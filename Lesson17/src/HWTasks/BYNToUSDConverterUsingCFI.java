package HWTasks;

import java.util.Scanner;
import java.util.function.Consumer;

public class BYNToUSDConverterUsingCFI {
    private static final double EXCHANGERATE = 0.305373;  //for 20.05.2024


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum in the following format: '*sum* BYN': ");
        String input = scanner.nextLine();
        Consumer<String> convertBYNToUSDUsingCFI = (bynString) -> {
            String[] parts = bynString.split(" ");
            if (parts.length == 2 && parts[1].equals("BYN")) {
                try {
                    double bynAmount = Double.parseDouble(parts[0]);
                    double usdAmount = bynAmount * EXCHANGERATE;
                    System.out.println("Sum in USD" + usdAmount);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid amount format: " + parts[0]);
                }
            } else {
                System.err.println("Invalid input format: " + bynString);
            }
        };
        convertBYNToUSDUsingCFI.accept(input);
    }
}
