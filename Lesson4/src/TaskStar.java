import java.util.Scanner;

public class TaskStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's length:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
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
                    int min = 1;
                    int max = 9;
                    array[i] = (int) ((Math.random() * (max - min)) + min);
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        boolean increaseArraySize = false;
        System.out.println();
        System.out.println();
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == 9) {
                if (array[i] == array[0]) {
                    increaseArraySize = true;
                }
            } else {
                break;
            }
        }
        if (increaseArraySize) {
            int newArrayLength = array.length + 1;
            int[] newArray = new int[newArrayLength];
            newArray[0] = 1;
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = 0;
            }
            System.out.print("New array: ");
            for (int i : newArray) {
                System.out.print(i + ", ");
            }
        } else {
            array[array.length - 1] += 1;
            System.out.print("Array: ");
            for (int i : array) {
                System.out.print(i + ", ");
            }
        }
    }
}

