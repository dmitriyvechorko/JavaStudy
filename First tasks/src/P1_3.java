import java.util.Scanner;
public class P1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();
        int a,b,s;
        do {
            a = number %10;
            number = number / 10;
            s = number;
            while(s > 0){
                b = s % 10;
                s = s / 10;
                if (a==b){
                    System.out.println("False");
                    a = -1;
                    break;
                }
            } if (a == -1)
                break;
        } while (number != 0);
        if (a != -1) {
            System.out.println("True");
        }
    }
}


