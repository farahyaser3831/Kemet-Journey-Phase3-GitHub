package explorer.tests;

import explorer.MonumentServer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApiIntegrationTest {
    @Test
    void monumentsApiReturnsFilteredListAndDetailPayloads() throws Exception {
        int port = findFreePort();
        MonumentServer server = new MonumentServer(port);
        server.start();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpResponse<String> listResponse = client.send(
                request(port, "/api/monuments?type=temple"),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, listResponse.statusCode(), "list endpoint should return 200");
            assertTrue(listResponse.body().contains("\"slug\":\"abu-simbel\""), "temple filter should include Abu Simbel");

            HttpResponse<String> detailResponse = client.send(
                request(port, "/api/monuments/great-pyramid-of-giza"),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, detailResponse.statusCode(), "detail endpoint should return 200");
            assertTrue(detailResponse.body().contains("Great Pyramid of Giza"), "detail payload should include monument name");
        } finally {
            server.stop(0);
        }
    }

    @Test
    void missingMonumentReturnsNotFound() throws Exception {
        int port = findFreePort();
        MonumentServer server = new MonumentServer(port);
        server.start();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> missingResponse = client.send(
                request(port, "/api/monuments/unknown"),
                HttpResponse.BodyHandlers.ofString()
            );

            assertEquals(404, missingResponse.statusCode(), "missing monument should return 404");
        } finally {
            server.stop(0);
        }
    }

    @Test
    void homepageAndMetadataEndpointsRenderExpectedContent() throws Exception {
        int port = findFreePort();
        MonumentServer server = new MonumentServer(port);
        server.start();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpResponse<String> pageResponse = client.send(
                request(port, "/"),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, pageResponse.statusCode(), "homepage should return 200");
            assertTrue(pageResponse.body().contains("Kemet Journey"), "homepage should render app shell");

            HttpResponse<String> metaResponse = client.send(
                request(port, "/api/meta"),
                HttpResponse.BodyHandlers.ofString()
            );
            assertEquals(200, metaResponse.statusCode(), "meta endpoint should return 200");
            assertTrue(metaResponse.body().contains("\"timelineGroups\""), "meta should expose grouped timeline data");
        } finally {
            server.stop(0);
        }
    }

    private static HttpRequest request(int port, String path) {
        return HttpRequest.newBuilder(URI.create("http://localhost:" + port + path)).GET().build();
    }

    private static int findFreePort() throws IOException {
        try (ServerSocket socket = new ServerSocket(0)) {
            return socket.getLocalPort();
        }
    }
}
