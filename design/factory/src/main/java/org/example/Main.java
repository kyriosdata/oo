package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.Executors;

/**
 * Código obtido de
 * https://inside.java/2023/11/06/in-memory-http-server-handler/
 *
 * @param assets
 */
record InMemoryHttpServer(Map<String, Asset> assets) implements HttpHandler {

    public static void main(String... args) throws Exception {
        System.out.println("InMemoryHttpServer");

        var server = HttpServer.create(new InetSocketAddress("", 0), 0);
        var address = server.getAddress();
        var assets =
                Map.of(
                        "/index.text",
                        Asset.ofText("Index"),
                        "/index.html",
                        Asset.ofText(
                                """
                                <html>
                                  <body>
                                    <h1>Index</h1>
                                  </body>
                                </html>
                                """,
                                "text/html"),
                        "/bin/123",
                        Asset.of(new byte[] {0x1, 0x2, 0x3}),
                        "/bin/456",
                        Asset.of(new byte[] {0x4, 0x5, 0x6}),
                        "/bin/789",
                        Asset.of(new byte[] {0x7, 0x8, 0x9}),
                        "/favicon.ico",
                        Asset.ofBase64(NANO_DUKE_BASE_64_ENCODED, "image/x-icon"));

        server.createContext("/", new InMemoryHttpServer(assets));
        // server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
        // Define o executor para o servidor
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();

        System.out.printf("http://%s:%d%n", address.getHostString(), address.getPort());
        Thread.sleep(Long.MAX_VALUE);
    }

    public record Asset(int code, byte[] data, String type) {

        public static Asset of(byte... bytes) {
            return new Asset(200, bytes, "application/octet-stream");
        }

        public static Asset ofBase64(String base64, String type) {
            return new Asset(200, Base64.getDecoder().decode(base64), type);
        }

        public static Asset ofText(String text) {
            return Asset.ofText(text, "text/plain");
        }

        public static Asset ofText(String text, String type) {
            return Asset.ofText(200, text, type);
        }

        public static Asset ofText(int code, String text, String type) {
            return new Asset(code, text.getBytes(StandardCharsets.UTF_8), type);
        }
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        var asset = lookupOrGenerateAsset(exchange.getRequestURI().getPath());
        exchange.getResponseHeaders().set("Content-Type", asset.type);
        exchange.getResponseHeaders().set("Content-Length", String.valueOf(asset.data.length));
        if ("HEAD".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(asset.code, -1);
            return;
        }
        exchange.sendResponseHeaders(asset.code, asset.data.length);
        try (var stream = exchange.getResponseBody()) {
            stream.write(asset.data);
        }
    }

    private Asset lookupOrGenerateAsset(String path) {
        var asset = assets.get(path);
        if (asset != null) return asset;
        return path.endsWith("/") ? generatePathIndexAsset(path) : generateFileNotFoundAsset(path);
    }

    private Asset generatePathIndexAsset(String path) {
        var spaces = " ".repeat(13);
        var PARENT = spaces + "&#x2934 <a href='%s'>../</a></br>";
        var DIRECTORY = spaces + "&#x1F4C1 <a href='%s'>%s</a></br>";
        var FILE = "%,13d &#x1F4C4 <a href='%s'>%s</a></br>";

        var html = new StringJoiner("\n");
        html.add(
                """
                <html>
                  <body>
                    <h1>Index of %s</h1>
                    <hr>
                    <pre>"""
                        .formatted(path));

        var parent = Path.of(path).getParent();
        if (parent != null) {
            var up = parent.getNameCount() == 0 ? "/" : parent.toString().replace('\\', '/') + '/';
            html.add(PARENT.formatted(up));
        }

        assets.keySet().stream()
                .filter(key -> key.startsWith(path))
                .map(key -> key.substring(path.length())) // cd $path
                .filter(name -> name.indexOf('/') >= 0) // directories only
                .map(name -> name.substring(0, name.indexOf('/') + 1)) // first element + '/'
                .distinct()
                .sorted()
                .map(name -> DIRECTORY.formatted(name, name))
                .forEach(html::add);

        assets.keySet().stream()
                .filter(key -> key.startsWith(path))
                .map(key -> key.substring(path.length())) // cd $path
                .filter(name -> name.indexOf('/') < 0) // files only
                .distinct()
                .sorted()
                .map(name -> FILE.formatted(assets.get(path + name).data.length, name, name))
                .forEach(html::add);

        html.add(
                """
                    </pre>
                    <hr>
                    <a href='https://inside.java'>#MovedByJava</a> %s
                  </body>
                </html>
                """.formatted(System.getProperty("java.version")));
        return Asset.ofText(html.toString(), "text/html");
    }

    private Asset generateFileNotFoundAsset(String path) {
        return Asset.ofText(404, "File not found: " + path, "text/plain");
    }

    private static final String NANO_DUKE_BASE_64_ENCODED = // https://jdk.java.net
            """
            AAABAAEAEBAAAAAAAABoBQAAFgAAACgAAAAQAAAAIAAAAAEACAAAAAAAAAAAAAAAAAAAAAAAAAAA\
            AAAAAAAAAAAAAACAAACAAAAAgIAAgAAAAIAAgACAgAAAwMDAAICAgAAAAP8AAP8AAAD//wD/AAAA\
            /wD/AP//AAD///8AwwAAAM8AAADbAAAA5wAAAPMAAAD/AAAA/xcXAP8vLwD/U1MA/2tnAP9/fwD/\
            i4sA/5eXAP+jowD/r68A/7u7AP/HxwD/z8cA/9vbAP/n5wD/8/MA//v3ACsrUwA3N18AQ0NrAE9P\
            dwBXV38AY2OLAG9vlwB/f6cAi4uzAJeXvwCnp88As7PbAL+/5wDHx+8Az8/3AFMrKwBfNzcAa0ND\
            AHdPTwCDW1sAj2dnAJtzcwCnf38As4uLAL+XlwDLo6MA16+vAOO7uwDrw8MA+9PTAC9TLwA7XzsA\
            R2tHAFN3UwBfg18Aa49rAHebdwCDp4MAj7OPAJu/mwCny6cAs9ezAL/jvwDL78sA1/vXAIdvlwCX\
            f6cAp4+3ALObwwDDq9MAz7ffANvD6wCLl28Ak6N7AJ+vhwCru5MAt8efAMvbswDX578A4/PLAAtv\
            mwAPe6MAE4evABePtwAbm8MAF6fPABuz2wAjv+cAK8vzADfX/wD/8/8A/+v/AP/f/wD/0/8A/8f/\
            AP+3/wD/o/8A/5f/AP+D/wD/a/8A/0v/AOcA5wDXANcAwwDHALcAtwCjAKcAlwCXAIsAiwB3AHcA\
            ZwBnAE8AUwAvADMA6///AOf//wDf//8A0///ALv//wCb//8AP///AADz9wAA5+sAAN/fAADT0wAA\
            x8cAALu7AACzrwAAp6cAAJuXAACXjwAAf38AAHd3AABfXwAAR0cAADMzAP//9wD//+cA///bAP//\
            xwD//7sA//+XAP//fwD//1MA7+8AAOPjAADX1wAAy8sAAL+/AACzswAAo6MAAJeTAACLgwAAe3sA\
            AGdrAABbWwAAR0sAACMjAADz//MA3//nANf/1wDD/88Au/+7AKP/owCH/4cAZ/9nADf/NwAL/wAA\
            APMAAADrAAAA4wAAANcAAADLAAAAvwAAALMAAACnAAAAnwAAAJMAAACHAAAAfwAAAHcAAABvAAAA\
            ZwAAAF8AAABTAAAARwAAADcAAAAjAAD38/8A6+v/AN/f/wDT0/8Aw8P/AK+v/wCbm/8Ai4v/AHd3\
            /wBnZ/8AU1P/AEND/wAvL/8AFxf/AAAARwAAAFcAAABnAAAAcwAAAH8AAACLAAAAlwAAAKMAAACv\
            AAAAuwAAAMMAAADPAAAA2wAAAOcAAADzAHwAVACbAGkAugB+ANkAkwDwAKoA/yS2AP9IwgD/bM4A\
            /5DaAP+05gDw8PAA3NzcAMjIyAC0tLQAoKCgAICAgAAAAP8AAP8AAAD//wD/AAAA/wD/AP//AAD/\
            //8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAICAgAAAAAAAgAAA8I\
            AAACAA8AAAAAAAgAAAgPDw8PDw8PAAAAAAAAAAAAAA8PDw8PDwAAAAAAAAAADwAPCAgIDw8AAAAA\
            AAAAAAAAAAkICQgIAAgAAAAAAAAAAAAJDwkAAAAIAAAAAAAAAAAACAkBAAgACAAAAAAAAAAAAAAA\
            AAAAAAAACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\
            AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP//AAD//wAA548AAKBPAAAADwAACA8AAKAP\
            AADABwAA8BEAAPgRAAD4OQAA/DsAAPx/AAD+fwAA//8AAP//AAA=""";
}