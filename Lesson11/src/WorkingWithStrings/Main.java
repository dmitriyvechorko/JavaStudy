package WorkingWithStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfStrings = new String[3];
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            arrayOfStrings[i] = line;
        }
        StringsTasks.task1(arrayOfStrings);
        StringsTasks.task2(arrayOfStrings);
        StringsTasks.task3(arrayOfStrings);
        StringsTasks.task4(arrayOfStrings);
        StringsTasks.task5(arrayOfStrings[0]);
        StringsTasks.taskStar(arrayOfStrings[1]);
    }
}
