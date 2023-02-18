import java.util.Scanner;
public class Calculator {
        public static int calculator() {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Insert the first number");
        num1 = input.nextDouble();
        System.out.println("Insert the second number");
        num2 = input.nextDouble();
        System.out.println("1 - sum" + "\n" + "2 - difference" + "\n" + "3 - multiplication" + "\n" + "4 - division");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.println(sum(num1,num2));
                break;
            case 2:
                System.out.println(difference(num1,num2));
                break;
            case 3:
                System.out.println(multiplication(num1,num2));
                break;
            case 4:
                System.out.println(division(num1,num2));
                break;
        }
            System.out.println("If you want to continue insert 1");
            int c = input.nextInt();
            if (c == 1) {
                return 1;
            }
            else{
                return 0;
            }
        }
    private static double sum(double num1, double num2) {
        return num1 + num2;
    }
    private static double difference(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplication(double num1, double num2){
            return num1 * num2; }

    private static double division(double num1, double num2){
            return num1 / num2; }

    public static void main(String[] args) {
        if(calculator()==1)
        calculator();
    }
}