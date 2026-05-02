package explorer.tests;

import explorer.data.MonumentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonumentServiceTest {
    private final MonumentService service = new MonumentService();

    @Test
    @DisplayName("Seeded catalog contains expected monument data")
    void seededCatalogContainsExpectedMonuments() {
        assertTrue(service.findAll("", "", "", "").size() >= 8, "expected seeded monuments");
    }

    @Test
    @DisplayName("Search finds English and Arabic monument text")
    void searchFindsEnglishAndArabicText() {
        List<Map<String, Object>> pyramids = service.findAll("pyramid", "", "", "");
        List<Map<String, Object>> arabic = service.findAll("نفرتيتي", "", "", "");

        assertFalse(pyramids.isEmpty(), "search should find the pyramid");
        assertEquals(1, arabic.size(), "arabic search should match Nefertiti");
    }

    @Test
    @DisplayName("Combined filters narrow monument results")
    void combinedFiltersNarrowResults() {
        List<Map<String, Object>> filtered = service.findAll("", "new-kingdom", "temple", "aswan");

        assertEquals(1, filtered.size(), "combined filters should narrow results");
        assertEquals("abu-simbel", filtered.get(0).get("slug"));
    }

    @Test
    @DisplayName("Keyword search and invalid search handle edge cases")
    void keywordAndInvalidSearchHandleEdgeCases() {
        List<Map<String, Object>> keyword = service.findAll("solar alignment", "", "", "");
        List<Map<String, Object>> empty = service.findAll("does-not-exist", "", "", "");

        assertEquals(1, keyword.size(), "search should match keywords from richer descriptions");
        assertEquals(0, empty.size(), "invalid search should return empty results");
    }

    @Test
    @DisplayName("Known slug returns detail and missing slug returns null")
    void findBySlugHandlesKnownAndMissingSlugs() {
        assertNotNull(service.findBySlug("abu-simbel"), "known slug should return detail");
        assertNull(service.findBySlug("missing-slug"), "unknown slug should return null");
    }
}
