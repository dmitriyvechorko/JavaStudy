package LessonTasks;


public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Sergey", 16); // Попытка создать объект с возрастом меньше 18
            System.out.println("Sergey: " + person1.getName() + ", age: " + person1.getAge());
        } catch (AgeBelow18Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Person person2 = new Person("Alex", 20); // Попытка создать объект с возрастом 18 или старше
            System.out.println("Alex: " + person2.getName() + ", age: " + person2.getAge());
        } catch (AgeBelow18Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
