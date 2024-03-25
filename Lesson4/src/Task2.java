import java.util.Scanner;

public class Task2 {

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
        int min = array[0];                            //Можно было просто отсортировать и вывести первый и последний
        int max = array[0];                            //элементы массива, но мы же не ищем лёгких путей :)
        for (int i : array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.print("Min is " + min + " and Max is " + max);
    }
}

