import java.util.Scanner;
public class P1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();
        System.out.println("The number is " + number);
        int rev = 0;
        while(number != 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reversed number is " + rev);
    }
}