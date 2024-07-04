package by.tms.calculator.web.httpHandler;

import by.tms.calculator.model.Operation;
import by.tms.calculator.service.OperationService;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HttpHandler implements com.sun.net.httpserver.HttpHandler {

    private final OperationService operationService = new OperationService();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        Map<String, String> attributes = getQueryAtributes(query);
        double num1 = Double.parseDouble(attributes.get("num1"));
        double num2 = Double.parseDouble(attributes.get("num2"));
        String type = attributes.get("type");

        Operation operation = new Operation(num1, num2, type);

        Operation execute = operationService.execute(operation);

        Gson gson = new Gson();
        String result = gson.toJson(execute);

        exchange.sendResponseHeaders(200, result.length());
        exchange.getResponseBody().write(result.getBytes());
        exchange.close();
    }
    private Map<String, String> getQueryAtributes(String query){
        String[] split = query.split("&");
        Map<String, String> attributes = new HashMap<String, String>();
        for (String s : split) {
            String[] split1 = s.split("=");
            attributes.put(split1[0], split1[1]);
        }
        return attributes;
    }

}