import java.util.Scanner;

class ArrayInput {
    public static void Input(int[] array, int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, if you want to input array's elements manually");
        System.out.println("Enter 2, if you want to randomize array's elements");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> {
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = scanner.nextInt();
                }
            }
            case 2 -> {
                for (int i = 0; i < arrayLength; i++) {
                    int min = -50;
                    int max = 50;
                    array[i] = (int) ((Math.random() * (max - min)) + min);
                }
            }
        }
    }

}
