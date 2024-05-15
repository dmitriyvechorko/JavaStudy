package HWTasks.StudentsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Создание примеров студентов
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 10);
        grades1.put("Physics", 9);
        grades1.put("English", 3);
        students.add(new Student("Dmitry", "Group1", 1, grades1));

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Physics", 2);
        grades2.put("English", 3);
        students.add(new Student("Alex", "Group1", 1, grades2));

        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 6);
        grades3.put("Physics", 7);
        grades3.put("English", 4);
        students.add(new Student("Egor", "Group2", 2, grades3));

        Map<String, Integer> grades4 = new HashMap<>();
        grades3.put("Math", 8);
        grades3.put("Physics", 8);
        grades3.put("English", 9);
        students.add(new Student("Timur", "Group3", 5, grades3));

        // Processing students
        StudentCollection.processStudents(students);

        // Students on the 2nd course
        StudentCollection.printStudents(students, 2);

        // Students on the 3rd course
        StudentCollection.printStudents(students, 3);
    }
}
