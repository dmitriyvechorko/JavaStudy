import java.lang.reflect.Field;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Blue");
        System.out.println(apple.getColor());
        try {
            Field colorField = Apple.class.getDeclaredField("color");

            // Устанавливаем доступ к полю color, даже если оно private
            colorField.setAccessible(true);

            // Меняем значение поля color на "Red" для объекта apple
            colorField.set(apple, "Red");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(apple.getColor());
    }
}