import java.util.Scanner;

public class P2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Insert array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.print("Palindroms:");
        for (int i = 0; i < n; i++)
            if(palindrom(array[i]))
                System.out.print(" " + array[i]);;
    }
    static boolean palindrom(int n)
    {
        int a = n;
        int b = 0;
        while(n > 0)
        {
            b = (b * 10) + (n % 10);
            n /= 10;
        }
        return a == b;
    }
}
