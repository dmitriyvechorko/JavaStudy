import java.util.Scanner;

public class Task6 {

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
        boolean isProgression = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isProgression = false;
                break;
            }
        }
        if (isProgression) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }

    }
}

