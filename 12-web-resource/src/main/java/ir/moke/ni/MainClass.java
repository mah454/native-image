package ir.moke.ni;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class MainClass {

    public static void main(String[] args) throws Exception {
        System.out.println("Start Web Server");
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("0.0.0.0", 9090), -1);

        HttpContext context = httpServer.createContext("/");
        context.setHandler(new WebContext());

        httpServer.start();
    }
}
