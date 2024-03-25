import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String evenNum = "Even number";
        String oddNum = "Odd number";
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age % 2 == 0) {
            System.out.println(evenNum);
        } else {
            System.out.println(oddNum);
        }
    }
}
