package HWTasks;

import java.util.Scanner;
import java.util.function.Supplier;

public class StringSupplierFI {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };
        System.out.println("Input string: " + stringSupplier.get());
    }
}
