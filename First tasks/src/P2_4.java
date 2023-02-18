import java.util.Scanner;
public class P2_4 {
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

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int l = size;
        int[] b = new int[l];
        int s=0;
        b[0] = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                b[s+1] = max;
                s++;
            }
            else{
                l--;
            }
        }
        System.out.print("Elements in ascending order:");
        for (s = 0; s < l; s++) {
            System.out.print(" " + b[s]);
        }
    }
}
