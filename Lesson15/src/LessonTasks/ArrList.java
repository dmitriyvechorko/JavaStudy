package LessonTasks;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Belarus");
        countries.add("Russia");
        countries.add("Greece");
        System.out.println(countries);
        countries.set(2, "Norway");
        System.out.println(countries);
        countries.remove(1);
        System.out.println(countries);
        countries.remove("Norway");
        System.out.println(countries);
        System.out.println(countries.indexOf("Belarus"));
        System.out.println(countries.contains("Belarus"));
    }
}