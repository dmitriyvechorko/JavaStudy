import java.util.Scanner;
public class P3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size of grid: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            array[i][0] = array[i][i] = 1;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}