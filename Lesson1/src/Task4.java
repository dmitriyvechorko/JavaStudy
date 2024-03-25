public class Task4 {
    public static void main(String[] args) {
        double n = 43.5;
        double v = n % 1 < 0.5 ? n : n++;
        System.out.println((int)n);
    }
}
