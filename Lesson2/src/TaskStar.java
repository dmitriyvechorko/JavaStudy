import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        String error = "Something wrong!";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 1) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.print(sum);
            } else {
                System.out.println(error);
            }
        } else {
            System.out.println(error);
        }
    }
}
