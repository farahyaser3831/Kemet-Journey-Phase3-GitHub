package explorer.tests;

import explorer.MonumentServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public final class ApiIntegrationTest {
    private ApiIntegrationTest() {
    }

    public static void main(String[] args) throws Exception {
        int port = findFreePort();
        MonumentServer server = new MonumentServer(port);
        server.start();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpResponse<String> listResponse = client.send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/api/monuments?type=temple")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, listResponse.statusCode(), "list endpoint should return 200");
            assertTrue(listResponse.body().contains("\"slug\":\"abu-simbel\""), "temple filter should include Abu Simbel");

            HttpResponse<String> detailResponse = client.send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/api/monuments/great-pyramid-of-giza")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, detailResponse.statusCode(), "detail endpoint should return 200");
            assertTrue(detailResponse.body().contains("Great Pyramid of Giza"), "detail payload should include monument name");

            HttpResponse<String> missingResponse = client.send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/api/monuments/unknown")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(404, missingResponse.statusCode(), "missing monument should return 404");

            HttpResponse<String> pageResponse = client.send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, pageResponse.statusCode(), "homepage should return 200");
            assertTrue(pageResponse.body().contains("Kemet Journey"), "homepage should render app shell");

            HttpResponse<String> metaResponse = client.send(
                HttpRequest.newBuilder(URI.create("http://localhost:" + port + "/api/meta")).GET().build(),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, metaResponse.statusCode(), "meta endpoint should return 200");
            assertTrue(metaResponse.body().contains("\"timelineGroups\""), "meta should expose grouped timeline data");

            System.out.println("ApiIntegrationTest passed");
        } finally {
            server.stop(0);
        }
    }

    private static int findFreePort() throws IOException {
        try (ServerSocket socket = new ServerSocket(0)) {
            return socket.getLocalPort();
        }
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
