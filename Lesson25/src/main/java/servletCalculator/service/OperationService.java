package servletCalculator.service;

import servletCalculator.model.Operation;

public class OperationService {

    public Operation execute(Operation operation) {
        switch (operation.getType()) {
            case "SUM":
                operation.setResult(operation.getNum1() + operation.getNum2());
                return operation;
            case "SUB":
                operation.setResult(operation.getNum1() - operation.getNum2());
                return operation;
            case "MUL":
                operation.setResult(operation.getNum1() * operation.getNum2());
                return operation;
            case "DIV":
                operation.setResult(operation.getNum1() / operation.getNum2());
                return operation;
        }
        throw new IllegalArgumentException("by.tms.calculator.model.Operation type not supported");
    }
}
