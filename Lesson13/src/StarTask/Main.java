package StarTask;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1, if you want to use the first way \n " +
                "of not calling finally (using System.exit(0) \n or input 2, if you want to use the second way\n " +
                "of not calling finally (using 'infinite' loop in 'try'):");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                Main.firstWay();
            } else if (choice == 2) {
                Main.secondWay();
            } else {
                System.out.println("Smth wrong! Try again");
                Main.main();
            }
        } else {
            System.out.println("Smth wrong! Try again");
            Main.main();
        }
    }

    public static void firstWay() {
        try {
            System.out.println("Try блок вызван!");
            throw new Exception("Исключение!");
        } catch (Exception e) {
            System.out.println("Получено: " + e.getMessage());
            System.exit(0);
        } finally {
            System.out.println("Finally блок вызван!");
        }
    }

    public static void secondWay() {
        try {
            while (true) {
                System.out.println("Внутри try блока (бесконечный цикл)");
            }
        } catch (Exception e) {
            System.out.println("Внутри catch блока: " + e.getMessage());
        } finally {
            System.out.println("Внутри finally блока");
        }
    }
}

