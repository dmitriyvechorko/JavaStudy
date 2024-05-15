package HWTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FirstTask {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string with numbers separated with commas: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(",\\s*");
        HashSet<String> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(Arrays.asList(numbers));
        System.out.println("Result: " + uniqueNumbers);
    }
}
