import java.util.Scanner;

public class Task5 {

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
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i] + " " + array[array.length - i - 1]);
        }
        if (array.length % 2 != 0) {
            System.out.println(array[(array.length / 2)]);
        }
    }
}

