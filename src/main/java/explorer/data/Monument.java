package explorer.data;

import java.util.List;
import java.util.Map;

public record Monument(
    String slug,
    Map<String, String> name,
    Map<String, String> subtitle,
    Map<String, String> shortDescription,
    Map<String, String> overview,
    Map<String, String> historicalBackground,
    Map<String, String> whyItMatters,
    Map<String, String> funFact,
    Map<String, String> story,
    Map<String, String> location,
    String locationKey,
    Map<String, String> era,
    String eraKey,
    Map<String, String> eraSummary,
    Map<String, String> type,
    String typeKey,
    String approximateDate,
    Map<String, String> relatedFigure,
    int periodOrder,
    double mapX,
    double mapY,
    List<Map<String, String>> facts,
    List<String> relatedSlugs,
    List<String> images
) {
}
