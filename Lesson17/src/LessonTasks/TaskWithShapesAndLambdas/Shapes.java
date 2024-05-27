package LessonTasks.TaskWithShapesAndLambdas;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IShape square = (int x, int y) -> x * y;
        IShape triangle = (int x, int y) -> 0.5 * x * y;
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter h: ");
        int h = scanner.nextInt();

        double squareSquare = square.getSquare(a, b);
        System.out.println("Square of square: " + squareSquare);  //funny moment:)

        double triangleSquare = triangle.getSquare(a, h);
        System.out.println("Square 0f triangle: " + triangleSquare);
    }
}

