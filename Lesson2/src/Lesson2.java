import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        String winter = "Winter";
        String spring = "Spring";
        String summer = "Summer";
        String autumn = "Autumn";
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1, 2, 12 -> System.out.println(winter);
            case 3, 4, 5 -> System.out.println(spring);
            case 6, 7, 8 -> System.out.println(summer);
            case 9, 10, 11 -> System.out.println(autumn);
        }
        int i = 0;
        while (i <= 25) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
