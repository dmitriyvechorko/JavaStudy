package HWTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListOperationsUsingStreams {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the initial size of the array: ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            numbers.add(random.nextInt(201) - 100);
        }
        System.out.println(numbers);

        int sum = numbers.stream()
                .distinct() // Deleting duplicates
                .filter(num -> num % 2 == 0) // Remain only even elements
                .peek(num -> System.out.print(num + " ")) // Outputting elements separated by spaces
                .mapToInt(Integer::intValue) // Converting Stream<Integer> into IntStream
                .sum(); // Calculating sum

        System.out.println("\nSum of remaining elements: " + sum);
    }
}
