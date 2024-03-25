import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String warm = "Warm";
        String cold = "Cold";
        String normal = "Normal";
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        if (t >= -5) {
            System.out.println(warm);
        } else if (t <= -20) {
            System.out.println(cold);
        } else {
            System.out.println(normal);
        }
    }
}
