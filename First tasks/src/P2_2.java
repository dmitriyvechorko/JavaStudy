import java.util.Scanner;
public class P2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 1; i < size; i++) {
            if (array[i]%2==0 && array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            if ((array[i] % 2 == 1) || (array[i]==1)) {
                System.out.print(array[i] + " ");
            }
        }
    }
}