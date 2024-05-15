package HWTasks.StudentsCollection;

import java.util.Iterator;
import java.util.List;

public class StudentCollection {

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                if (student.getCourse() >= 5) {
                    System.out.println("Student " + student.getName() + " is FREE!!!");
                    student.setCourse(0);
                } else {
                    student.setCourse(student.getCourse() + 1);
                }
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
