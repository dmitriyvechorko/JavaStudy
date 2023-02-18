import java.util.Scanner;
public class P1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();
        System.out.println("The number is " + number);
        int max = number % 10;
        int min = number % 10;
        while(number > 0){
            int digit = number % 10;
            if (digit > max){
                max = digit;
            }
            if (digit < min){
                min = digit;
            }
           number /= 10;
        }
        System.out.println("Max number is " + max + "; Min number is " + min + ";");
    }
}