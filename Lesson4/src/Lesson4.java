public class Lesson4 {
    public static void main(String[] args) {
        int[] array = {0, 4, 9, 7, 6, 5, 3, 2, 1};
        int sum = 45;
        for (int j : array) {
            sum -= j;
        }
        System.out.println(sum);
    }
}