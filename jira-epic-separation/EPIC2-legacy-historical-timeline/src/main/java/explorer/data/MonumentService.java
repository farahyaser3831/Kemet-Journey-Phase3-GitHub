package explorer.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public final class MonumentService {
    private static final List<String> ERA_ORDER = List.of(
        "old-kingdom",
        "middle-kingdom",
        "new-kingdom",
        "amarna-period",
        "ptolemaic-period"
    );

    private static final List<String> LOCATION_ORDER = List.of(
        "giza",
        "cairo",
        "luxor",
        "amarna",
        "aswan"
    );

    private final List<Monument> monuments;

    public MonumentService() {
        this.monuments = MonumentRepository.load();
    }

    public List<Map<String, Object>> findAll(String search, String era, String type, String location) {
        String searchValue = normalize(search);
        String eraValue = normalize(era);
        String typeValue = normalize(type);
        String locationValue = normalize(location);

        return monuments.stream()
            .filter(monument -> matchesSearch(monument, searchValue))
            .filter(monument -> eraValue.isBlank() || normalize(monument.eraKey()).equals(eraValue))
            .filter(monument -> typeValue.isBlank() || normalize(monument.typeKey()).equals(typeValue))
            .filter(monument -> locationValue.isBlank() || normalize(monument.locationKey()).equals(locationValue))
            .sorted(Comparator.comparing(Monument::periodOrder).thenComparing(Monument::slug))
            .map(this::toSummary)
            .collect(Collectors.toList());
    }

    public Map<String, Object> findBySlug(String slug) {
        return monuments.stream()
            .filter(monument -> monument.slug().equalsIgnoreCase(slug))
            .findFirst()
            .map(this::toDetail)
            .orElse(null);
    }

    public Map<String, Object> meta() {
        List<Map<String, Object>> timelineGroups = ERA_ORDER.stream()
            .map(this::timelineGroup)
            .filter(group -> !((List<?>) group.get("items")).isEmpty())
            .collect(Collectors.toList());

        List<Map<String, Object>> regions = LOCATION_ORDER.stream()
            .map(this::regionGroup)
            .filter(group -> !((List<?>) group.get("items")).isEmpty())
            .collect(Collectors.toList());

        return Map.of(
            "eras", timelineGroups.stream().map(group -> group.get("key")).collect(Collectors.toList()),
            "types", monuments.stream().map(Monument::typeKey).distinct().sorted().collect(Collectors.toList()),
            "locations", regions.stream().map(group -> group.get("key")).collect(Collectors.toList()),
            "timelineGroups", timelineGroups,
            "regions", regions
        );
    }

    private boolean matchesSearch(Monument monument, String search) {
        if (search.isBlank()) {
            return true;
        }

        return contains(monument.name(), search)
            || contains(monument.location(), search)
            || contains(monument.subtitle(), search)
            || contains(monument.shortDescription(), search)
            || contains(monument.overview(), search)
            || contains(monument.historicalBackground(), search)
            || contains(monument.whyItMatters(), search)
            || contains(monument.relatedFigure(), search)
            || monument.facts().stream().anyMatch(fact ->
                normalize(fact.get("labelEn")).contains(search)
                    || normalize(fact.get("valueEn")).contains(search)
                    || normalize(fact.get("labelAr")).contains(search)
                    || normalize(fact.get("valueAr")).contains(search)
            );
    }

    private boolean contains(Map<String, String> text, String search) {
        return normalize(text.get("en")).contains(search) || normalize(text.get("ar")).contains(search);
    }

    private String normalize(String value) {
        return value == null ? "" : value.trim().toLowerCase(Locale.ROOT);
    }

    private Map<String, Object> toSummary(Monument monument) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("slug", monument.slug());
        map.put("name", monument.name());
        map.put("subtitle", monument.subtitle());
        map.put("shortDescription", monument.shortDescription());
        map.put("location", monument.location());
        map.put("locationKey", monument.locationKey());
        map.put("era", monument.era());
        map.put("eraKey", monument.eraKey());
        map.put("type", monument.type());
        map.put("typeKey", monument.typeKey());
        map.put("approximateDate", monument.approximateDate());
        map.put("relatedFigure", monument.relatedFigure());
        map.put("thumbnail", monument.images().isEmpty() ? "" : monument.images().get(0));
        map.put("coordinates", Map.of("x", monument.mapX(), "y", monument.mapY()));
        return map;
    }

    private Map<String, Object> toDetail(Monument monument) {
        Map<String, Object> map = toSummary(monument);
        map.put("overview", monument.overview());
        map.put("historicalBackground", monument.historicalBackground());
        map.put("whyItMatters", monument.whyItMatters());
        map.put("funFact", monument.funFact());
        map.put("story", monument.story());
        map.put("facts", monument.facts());
        map.put("images", monument.images());
        map.put("eraSummary", monument.eraSummary());
        map.put("relatedMonuments", monument.relatedSlugs().stream()
            .map(this::findRawBySlug)
            .filter(item -> item != null)
            .map(this::toSummary)
            .collect(Collectors.toList()));
        return map;
    }

    private Monument findRawBySlug(String slug) {
        return monuments.stream()
            .filter(monument -> monument.slug().equalsIgnoreCase(slug))
            .findFirst()
            .orElse(null);
    }

    private Map<String, Object> timelineGroup(String eraKey) {
        List<Monument> items = monuments.stream()
            .filter(monument -> monument.eraKey().equals(eraKey))
            .sorted(Comparator.comparing(Monument::periodOrder))
            .collect(Collectors.toList());

        Map<String, Object> group = new LinkedHashMap<>();
        group.put("key", eraKey);
        if (items.isEmpty()) {
            group.put("label", Map.of("en", humanize(eraKey), "ar", humanizeArabic(eraKey)));
            group.put("summary", Map.of("en", "", "ar", ""));
            group.put("items", List.of());
            return group;
        }

        group.put("label", items.get(0).era());
        group.put("summary", items.get(0).eraSummary());
        group.put("items", items.stream().map(this::toSummary).collect(Collectors.toList()));
        return group;
    }

    private Map<String, Object> regionGroup(String locationKey) {
        List<Monument> items = monuments.stream()
            .filter(monument -> monument.locationKey().equals(locationKey))
            .sorted(Comparator.comparing(Monument::periodOrder))
            .collect(Collectors.toList());

        Map<String, Object> group = new LinkedHashMap<>();
        group.put("key", locationKey);
        if (items.isEmpty()) {
            group.put("label", Map.of("en", humanize(locationKey), "ar", humanizeArabic(locationKey)));
            group.put("items", List.of());
            return group;
        }

        group.put("label", items.get(0).location());
        group.put("items", items.stream().map(this::toSummary).collect(Collectors.toList()));
        return group;
    }

    private String humanize(String key) {
        List<String> pieces = new ArrayList<>();
        for (String part : key.split("-")) {
            pieces.add(Character.toUpperCase(part.charAt(0)) + part.substring(1));
        }
        return String.join(" ", pieces);
    }

    private String humanizeArabic(String key) {
        return switch (key) {
            case "old-kingdom" -> "الدولة القديمة";
            case "middle-kingdom" -> "الدولة الوسطى";
            case "new-kingdom" -> "الدولة الحديثة";
            case "amarna-period" -> "عصر العمارنة";
            case "ptolemaic-period" -> "العصر البطلمي";
            case "giza" -> "الجيزة";
            case "cairo" -> "القاهرة";
            case "luxor" -> "الأقصر";
            case "amarna" -> "العمارنة";
            case "aswan" -> "أسوان";
            default -> key;
        };
    }
}
