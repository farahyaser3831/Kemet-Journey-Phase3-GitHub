package explorer;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import explorer.data.MonumentService;
import explorer.web.JsonUtil;
import explorer.web.StaticFileHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public final class MonumentServer {
    private final HttpServer server;
    private final MonumentService monumentService;

    public MonumentServer(int port) throws IOException {
        this.monumentService = new MonumentService();
        this.server = HttpServer.create(new InetSocketAddress(port), 0);
        this.server.createContext("/api/monuments", new MonumentApiHandler(monumentService));
        this.server.createContext("/api/meta", new MetaApiHandler(monumentService));
        this.server.createContext("/", new StaticFileHandler("src/main/resources/web"));
        this.server.setExecutor(Executors.newCachedThreadPool());
    }

    public void start() {
        server.start();
    }

    public void stop(int delaySeconds) {
        server.stop(delaySeconds);
    }

    private static final class MonumentApiHandler implements HttpHandler {
        private final MonumentService monumentService;

        private MonumentApiHandler(MonumentService monumentService) {
            this.monumentService = monumentService;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                    writeJson(exchange, 405, Map.of("error", "Method not allowed"));
                    return;
                }

                String path = exchange.getRequestURI().getPath();
                if ("/api/monuments".equals(path)) {
                    Map<String, String> query = queryParams(exchange.getRequestURI());
                    String search = query.getOrDefault("search", "");
                    String era = query.getOrDefault("era", "");
                    String type = query.getOrDefault("type", "");
                    String location = query.getOrDefault("location", "");

                    List<Map<String, Object>> payload = monumentService.findAll(search, era, type, location);
                    writeJson(exchange, 200, Map.of(
                        "items", payload,
                        "total", payload.size()
                    ));
                    return;
                }

                String prefix = "/api/monuments/";
                if (path.startsWith(prefix)) {
                    String slug = path.substring(prefix.length());
                    Map<String, Object> monument = monumentService.findBySlug(slug);
                    if (monument == null) {
                        writeJson(exchange, 404, Map.of("error", "Monument not found"));
                        return;
                    }
                    writeJson(exchange, 200, monument);
                    return;
                }

                writeJson(exchange, 404, Map.of("error", "Not found"));
            } catch (RuntimeException ex) {
                writeJson(exchange, 500, Map.of("error", "Unexpected server error"));
            }
        }
    }

    private static final class MetaApiHandler implements HttpHandler {
        private final MonumentService monumentService;

        private MetaApiHandler(MonumentService monumentService) {
            this.monumentService = monumentService;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                writeJson(exchange, 405, Map.of("error", "Method not allowed"));
                return;
            }
            writeJson(exchange, 200, monumentService.meta());
        }
    }

    private static void writeJson(HttpExchange exchange, int status, Object payload) throws IOException {
        byte[] body = JsonUtil.toJson(payload).getBytes(StandardCharsets.UTF_8);
        Headers headers = exchange.getResponseHeaders();
        headers.set("Content-Type", "application/json; charset=utf-8");
        headers.set("Access-Control-Allow-Origin", "*");
        exchange.sendResponseHeaders(status, body.length);
        exchange.getResponseBody().write(body);
        exchange.close();
    }

    private static Map<String, String> queryParams(URI uri) {
        Map<String, String> params = new HashMap<>();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.isBlank()) {
            return params;
        }

        for (String part : rawQuery.split("&")) {
            String[] pieces = part.split("=", 2);
            String key = java.net.URLDecoder.decode(pieces[0], StandardCharsets.UTF_8);
            String value = pieces.length > 1
                ? java.net.URLDecoder.decode(pieces[1], StandardCharsets.UTF_8)
                : "";
            params.put(key, value);
        }
        return params;
    }
}
