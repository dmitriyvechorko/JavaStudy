package HWTasks.StudentsCollection;

import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades; // Key is a subject, and value is student's grade on this subject

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student " + name + " from "  + group + " on the "  + course +
                "course has the next grades: \t" + grades;
    }
}
