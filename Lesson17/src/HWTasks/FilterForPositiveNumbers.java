package HWTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FilterForPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter elements (enter 0 for exit):");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        Predicate<Integer> isPositive = number -> number > 0;
        List<Integer> positiveNumbers = numbers.stream().filter(isPositive).toList();
        System.out.println("Positive numbers: " + positiveNumbers);
    }
}
