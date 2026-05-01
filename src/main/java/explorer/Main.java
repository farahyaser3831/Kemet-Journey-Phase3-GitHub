package explorer;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) throws Exception {
        int port = resolvePort(args);
        MonumentServer server = new MonumentServer(port);
        server.start();
        System.out.println("Egyptian Monuments Explorer running on http://localhost:" + port);
    }

    private static int resolvePort(String[] args) {
        if (args != null && args.length > 0 && !args[0].isBlank()) {
            return Integer.parseInt(args[0].trim());
        }

        String envPort = System.getenv("PORT");
        if (envPort != null && !envPort.isBlank()) {
            return Integer.parseInt(envPort.trim());
        }

        return 8080;
    }
}
