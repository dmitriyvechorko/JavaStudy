package webCalculatorWithAuthentication.servlet;

import webCalculatorWithAuthentication.model.Operation;
import webCalculatorWithAuthentication.service.OperationService;
import webCalculatorWithAuthentication.storage.InMemoryHistoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calculator", name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    private final OperationService operationService = new OperationService();
    private final InMemoryHistoryStorage storage = new InMemoryHistoryStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");

        Operation operation = new Operation(num1, num2, type);
        Operation result = operationService.execute(operation);
        operationService.addToHistory(operation);
        req.setAttribute("result", result.getResult());
        req.setAttribute("history", storage.getAllOperations());
        getServletContext().getRequestDispatcher("/pages/calculator.jsp").forward(req, resp);
    }

}