import java.util.Scanner;

public class Task1 {

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
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }
}

