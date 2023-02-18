import java.util.Scanner;
public class P1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert string: ");
        String str = input.nextLine();
        System.out.println(str);
        int length = str.length ();
        for(int i =0;i < length; i++){
            char c = str.charAt(i);

        }
        int l = length;
        int[] b = new int[l];
        int s=0;
        b[0] = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                b[s+1] = max;
                s++;
            }
            else{
                l--;
            }
        }
        System.out.print("Elements in ascending order:");
        for (s = 0; s < l; s++) {
            System.out.print(" " + b[s]);
        }
    }
}