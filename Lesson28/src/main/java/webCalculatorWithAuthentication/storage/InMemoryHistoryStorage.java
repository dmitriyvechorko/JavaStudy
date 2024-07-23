package webCalculatorWithAuthentication.storage;

import webCalculatorWithAuthentication.model.Operation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryStorage {

    private static final List<Operation> operations = new ArrayList<>();

    public void save(Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getAllOperations() {
        return operations;
    }
}
