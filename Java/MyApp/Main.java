import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        int puerto = 3003;
        HttpServer server = HttpServer.create(new InetSocketAddress(puerto), 0);
        server.createContext("/api/saludo", new HolaMundoHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Servidor en ejecución en el puerto " + puerto);
    }
}
