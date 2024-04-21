package LessonTasks;

public class Main {
    public static void main(String[] args) {
        Computer hp = new Hp();
        Computer mac = new Mac();

        System.out.println(hp.getClassName());
        System.out.println(mac.getClassName());
    }
}
