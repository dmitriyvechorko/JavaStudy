package LessonTasks;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String line = scanner.nextLine();
        String[] words = line.split("\\s+");
        for (String word : words) {
            Integer frequency = map.get(word);
            if (frequency != null) {
                map.put(word, frequency + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println("Frequency of words:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {       //more sightly output for Map
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}