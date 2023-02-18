import java.util.Scanner;
public class Calculator {
    public double sum(double num1, double num2) {
        return num1 + num2;
    }
    public double difference(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplication(double num1, double num2){
        return num1 * num2; }
    public double division(double num1, double num2){
        if(num2 != 0){return num1 / num2;}
        else return 0;
    }
    public void calculate() {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double num1, num2;
        System.out.println("Insert the first number");
        num1 = input.nextDouble();
        System.out.println("Insert the second number");
        num2 = input.nextDouble();
        System.out.println("1 - sum" + "\n" + "2 - difference" + "\n" + "3 - multiplication" + "\n" + "4 - division");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.println(calculator.sum(num1,num2));
                break;
            case 2:
                System.out.println(calculator.difference(num1,num2));
                break;
            case 3:
                System.out.println(calculator.multiplication(num1,num2));
                break;
            case 4:
                if (calculator.division(num1,num2)!=0) {
                    System.out.println(calculator.division(num1, num2));
                }
                else{
                    System.out.println("Error ( division by zero )");
                }
                break;
        }
    }
}
