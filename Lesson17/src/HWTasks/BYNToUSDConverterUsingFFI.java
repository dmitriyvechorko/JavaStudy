package HWTasks;

import java.util.function.Function;
import java.util.Scanner;

public class BYNToUSDConverterUsingFFI {
    private static final double EXCHANGERATE = 0.305373;  //for 20.05.2024

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum in the following format: '*sum* BYN': ");
        String input = scanner.nextLine();
        Function<String, Double> convertBYNToUSDUsingFFI = bynString -> {
            try {
                String[] parts = bynString.split(" ");
                if (parts.length != 2 || !parts[1].equalsIgnoreCase("BYN")) {
                    throw new IllegalArgumentException("The wrong format of string!");
                }
                double amountBYN = Double.parseDouble(parts[0]);
                return amountBYN * EXCHANGERATE;
            } catch (Exception e) {
                System.err.println("Error processing the string: " + e.getMessage());
                return 0.0;
            }
        };
        double amountUSD = convertBYNToUSDUsingFFI.apply(input);
        System.out.println("Sum in USD: " + amountUSD);
    }
}


