import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's length:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        ArrayInput.Input(array, arrayLength);
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int zeroAmount = 0;
        for (int i : array) {
            if (i == 0) {
                zeroAmount += 1;
            }
        }
        if (zeroAmount == 0) {
            System.out.println("There are no zeros in this array");
        } else {
            System.out.println("There are " + zeroAmount + " zeros in this array");
        }
    }
}

