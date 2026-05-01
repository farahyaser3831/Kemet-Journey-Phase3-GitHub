package explorer.tests;

import explorer.data.MonumentService;

import java.util.List;
import java.util.Map;

public final class MonumentServiceTest {
    private MonumentServiceTest() {
    }

    public static void main(String[] args) {
        MonumentService service = new MonumentService();

        assertTrue(service.findAll("", "", "", "").size() >= 8, "expected seeded monuments");

        List<Map<String, Object>> pyramids = service.findAll("pyramid", "", "", "");
        assertTrue(!pyramids.isEmpty(), "search should find the pyramid");

        List<Map<String, Object>> arabic = service.findAll("نفرتيتي", "", "", "");
        assertEquals(1, arabic.size(), "arabic search should match Nefertiti");

        List<Map<String, Object>> filtered = service.findAll("", "new-kingdom", "temple", "aswan");
        assertEquals(1, filtered.size(), "combined filters should narrow results");

        List<Map<String, Object>> keyword = service.findAll("solar alignment", "", "", "");
        assertEquals(1, keyword.size(), "search should match keywords from richer descriptions");

        List<Map<String, Object>> empty = service.findAll("does-not-exist", "", "", "");
        assertEquals(0, empty.size(), "invalid search should return empty results");

        assertTrue(service.findBySlug("abu-simbel") != null, "known slug should return detail");
        assertTrue(service.findBySlug("missing-slug") == null, "unknown slug should return null");

        System.out.println("MonumentServiceTest passed");
    }

    private static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            throw new AssertionError(message + " (expected=" + expected + ", actual=" + actual + ")");
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
