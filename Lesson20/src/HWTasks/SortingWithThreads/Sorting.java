package HWTasks.SortingWithThreads;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's length:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter array's elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Result array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] arrayForInsertionSort = Arrays.copyOf(array, array.length);
        int[] arrayForSelectionSort = Arrays.copyOf(array, array.length);
        int[] arrayForBubbleSort = Arrays.copyOf(array, array.length);

        Thread insertionSortThread = new Thread(new InsertionSort(arrayForInsertionSort));
        Thread selectionSortThread = new Thread(new SelectionSort(arrayForSelectionSort));
        Thread bubbleSortThread = new Thread(new BubbleSort(arrayForBubbleSort));

        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();

        try {
            insertionSortThread.join();
            selectionSortThread.join();
            bubbleSortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Insertion sorting: " + Arrays.toString(arrayForInsertionSort));
        System.out.println("Selection sorting: " + Arrays.toString(arrayForSelectionSort));
        System.out.println("Buble sorting: " + Arrays.toString(arrayForBubbleSort));
    }
}
