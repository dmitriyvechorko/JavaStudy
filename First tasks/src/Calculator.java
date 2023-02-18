import java.util.Scanner;
public class Calculator {
        public static int calculator() {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Insert the first number");
        num1 = input.nextInt();
        System.out.println("Insert the second number");
        num2 = input.nextInt();
        System.out.println("1 - sum" + "\n" + "2 - difference" + "\n" + "3 - multiplication" + "\n" + "4 - division");
        int x = input.nextInt();
        switch (x) {
            case 1:
                int sum = num1 + num2;
                System.out.println("The result is: " + sum);
                break;
            case 2:
                int difference = num1-num2;
                System.out.println("The result is: " + difference);
                break;
            case 3:
                int multiplication = num1*num2;
                System.out.println("The result is: " + multiplication);
                break;
            case 4:
                int division = num1/num2;
                System.out.println("The result is: " + division);
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
    public static void main(String[] args) {
        if(calculator()==1)
        calculator();
    }
}