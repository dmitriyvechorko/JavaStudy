package HWTasks.MaxAndMinFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's elements (enter 0 to exit):");
        int input;

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        if (numbers.isEmpty()) {
            System.out.println("The array is empty. Try again.");
            Main.main();
        }

        // Objects to store the result
        Result result = new Result();

        Thread maxThread = new Thread(new MaxFinder(numbers, result));
        Thread minThread = new Thread(new MinFinder(numbers, result));

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Max: " + result.getMax());
        System.out.println("Min: " + result.getMin());
    }
}