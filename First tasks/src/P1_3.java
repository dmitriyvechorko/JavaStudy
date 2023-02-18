import java.util.Scanner;
public class P1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();
        int a,b,s;
        do {
            a = number %10;
            number = number / 10;
            s = number;
            while(s > 0){
                b = s % 10;
                s = s / 10;
                if (a==b){
                    System.out.println("False");
                    a = -1;
                    break;
                }
            } if (a == -1)
                break;
        } while (number != 0);
        if (a != -1) {
            System.out.println("True");
        }
    }
}


//public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter array length: ");
//        int size = input.nextInt();
//        int[] array = new int[size];
//        System.out.println("Insert array elements:");
//        for (int i = 0; i < size; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.print("Inserted array elements:");
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(" " + array[i]);
//        }
//        System.out.println();
//        int next1 = 0;
//        for (int i = 0; i < size-1; i++) {
//            if (array[i] < array[i+1]) {
//                next1 = array[i];
//                System.out.print(next1 + " ");
//            }
//        }