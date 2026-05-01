package explorer.web;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public final class StaticFileHandler implements HttpHandler {
    private static final Map<String, String> CONTENT_TYPES = Map.of(
        ".html", "text/html; charset=utf-8",
        ".css", "text/css; charset=utf-8",
        ".js", "application/javascript; charset=utf-8",
        ".json", "application/json; charset=utf-8",
        ".svg", "image/svg+xml; charset=utf-8",
        ".jpg", "image/jpeg",
        ".jpeg", "image/jpeg",
        ".png", "image/png",
        ".webp", "image/webp",
        ".gif", "image/gif"
    );

    private final Path rootDirectory;

    public StaticFileHandler(String rootDirectory) {
        this.rootDirectory = Path.of(rootDirectory).toAbsolutePath().normalize();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
            sendText(exchange, 405, "Method not allowed");
            return;
        }

        String requestPath = exchange.getRequestURI().getPath();
        String relative = "/".equals(requestPath) ? "index.html" : requestPath.substring(1);
        Path file = rootDirectory.resolve(relative).normalize();

        if (!file.startsWith(rootDirectory) || !Files.exists(file) || Files.isDirectory(file)) {
            sendText(exchange, 404, "Not found");
            return;
        }

        byte[] body = Files.readAllBytes(file);
        Headers headers = exchange.getResponseHeaders();
        headers.set("Content-Type", contentType(file));
        exchange.sendResponseHeaders(200, body.length);
        exchange.getResponseBody().write(body);
        exchange.close();
    }

    private String contentType(Path file) {
        String name = file.getFileName().toString();
        for (Map.Entry<String, String> entry : CONTENT_TYPES.entrySet()) {
            if (name.endsWith(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "text/plain; charset=utf-8";
    }

    private void sendText(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        exchange.getResponseBody().write(bytes);
        exchange.close();
    }
}
