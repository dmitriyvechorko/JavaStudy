package LessonTasks;

import java.util.Arrays;
import java.util.List;

public class FilteringStringOnCertainCondition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");
        strings.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}
