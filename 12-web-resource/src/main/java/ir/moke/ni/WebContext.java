package ir.moke.ni;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WebContext implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println(exchange.getRequestURI().getPath());
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("web" + exchange.getRequestURI().getPath())) {
            if (inputStream != null) {
                byte[] bytes = inputStream.readAllBytes();
                exchange.sendResponseHeaders(200, bytes.length);
                OutputStream outputStream = exchange.getResponseBody();
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        exchange.sendResponseHeaders(204, -1);
    }
}
