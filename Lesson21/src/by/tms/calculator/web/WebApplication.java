package by.tms.calculator.web;

import by.tms.calculator.Application;
import by.tms.calculator.web.httpHandler.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebApplication implements Application {
    @Override
    public void run() {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
            httpServer.createContext("/calculate", new HttpHandler());
            httpServer.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
