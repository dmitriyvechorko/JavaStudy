import java.util.Scanner;

public class Task3 {

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
        int min = array[0];                         //Можно было просто отсортировать и вывести первый и последний
        int max = array[0];                         //элементы массива, но мы же не ищем лёгких путей :)
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.print("Min is " + minIndex + " and Max is " + maxIndex);
    }
}

