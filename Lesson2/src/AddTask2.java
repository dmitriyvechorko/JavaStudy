public class AddTask2 {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        System.out.print(i1 + " ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i2 + " ");
            int i3 = i1;
            i1 = i2;
            i2 = i2 + i3;
        }
    }
}
