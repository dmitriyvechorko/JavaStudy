package Figures;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure[] figures = new Figure[5];
        Figure figure = null;
        Random randomizer = new Random();
        double totalPerimeter = 0;
        for (int i=0; i<5; i++) {
            int randomNumber = randomizer.nextInt(3);
            switch(randomNumber) {
                case 0:
                    System.out.print("Введите размер 1-ой стороны треугольника: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Введите размер 2-ой стороны треугольника: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Введите размер 3-ей стороны треугольника: ");
                    double side3 = scanner.nextDouble();
                    figure = new Triangle(side1, side2, side3);
                    System.out.print("Периметр треугольника равен: " + figure.calculatePerimeter() + "\n");
                    totalPerimeter += figure.calculatePerimeter();
                    break;
                case 1:
                    System.out.print("Введите длину прямоугольника: ");
                    double length = scanner.nextDouble();
                    System.out.print("Введите ширину прямоугольника: ");
                    double width = scanner.nextDouble();
                    figure = new Rectangle(4, 6);
                    System.out.print("Периметр прямоугольника равен: " + figure.calculatePerimeter() + "\n");
                    totalPerimeter += figure.calculatePerimeter();
                    break;
                case 2:
                    System.out.print("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    figure = new Circle(5);
                    System.out.print("Периметр круга равен: " + figure.calculatePerimeter() + "\n");
                    totalPerimeter += figure.calculatePerimeter();
                    break;
            }
            figures[i] = figure;
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}