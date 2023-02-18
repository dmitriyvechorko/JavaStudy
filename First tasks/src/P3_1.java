import java.util.Scanner;
public class P3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size of grid: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] array = new int[n][m];
        System.out.println("Insert array elements:");
        System.out.println("Insert 1, if you want to enter elements manually,"+"\n"+"else it will be filled randomly");
        int x = input.nextInt();
        if (x==1){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = input.nextInt();
                }
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = (int)(Math.random()*200-100);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
