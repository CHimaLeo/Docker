import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HolaMundoHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String respuesta = "Hola Mundo desde Java";
        exchange.sendResponseHeaders(200, respuesta.length());
        OutputStream os = exchange.getResponseBody();
        os.write(respuesta.getBytes());
        os.close();
    }
}
