import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i == 0) || (i % 2 == 0)) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = k;
                    k++;
                }
            } else {
                for (int j = array[i].length - 1; 0 <= j; j--) {
                    array[i][j] = k;
                    k++;
                }
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}