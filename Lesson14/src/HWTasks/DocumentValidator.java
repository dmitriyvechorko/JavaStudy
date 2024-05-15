package HWTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocumentValidator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = scanner.nextLine();
        String validOutputFile = "valid_documents.txt";
        String invalidOutputFile = "invalid_documents.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             FileWriter validWriter = new FileWriter(validOutputFile);
             FileWriter invalidWriter = new FileWriter(invalidOutputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String validationResult = validateDocumentNumber(line);
                if (validationResult.equals("Valid")) {
                    validWriter.write(line + System.lineSeparator());
                } else {
                    invalidWriter.write(line + " - " + validationResult + System.lineSeparator());
                }
            }
            System.out.println("Validation complete. Check the output files for results.");
        } catch (IOException e) {
            System.out.println("There is smth wrong with Input/Output");
            DocumentValidator.main();
        }
    }

    private static String validateDocumentNumber(String documentNumber) {
        if (documentNumber.length() != 15) {
            return "Invalid length";
        }
        if (!(documentNumber.startsWith("docnum") || documentNumber.startsWith("contract"))) {
            return "Invalid prefix";
        }
        return "Valid";
    }
}
