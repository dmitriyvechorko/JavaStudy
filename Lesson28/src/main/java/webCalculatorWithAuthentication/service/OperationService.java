package webCalculatorWithAuthentication.service;

import webCalculatorWithAuthentication.model.Operation;
import webCalculatorWithAuthentication.storage.InMemoryHistoryStorage;

public class OperationService {

    private final InMemoryHistoryStorage inMemoryHistoryStorage = new InMemoryHistoryStorage();

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
        throw new IllegalArgumentException("webCalculatorWithValidation.model.Operation type not supported");
    }

    public void addToHistory(Operation operation){
        inMemoryHistoryStorage.save(operation);
    }
}
