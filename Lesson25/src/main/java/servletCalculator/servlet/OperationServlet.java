package servletCalculator.servlet;

import com.google.gson.Gson;
import servletCalculator.model.Operation;
import servletCalculator.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",
        urlPatterns = "/calculate")     // localhost:8080/calculate?num1=-7&num2=2.84&type=MUL
public class OperationServlet extends HttpServlet {

    private final OperationService operationService = new OperationService();

    @Override
    public void init() throws ServletException {
        System.out.println("CalculatorServlet initialized successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");

        resp.setContentType("application/json");

        Operation operation = new Operation(num1, num2, type);
        Operation execute = operationService.execute(operation);

        Gson gson = new Gson();
        String json = gson.toJson(execute);

        resp.getWriter().println(json);
    }

    @Override
    public void destroy() {
        System.out.println("CalculatorServlet destroyed successfully");
    }
}
