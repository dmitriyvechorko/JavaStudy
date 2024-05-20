package HWTasks;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();
        System.out.println("Enter strings (enter empty string for finishing):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            wordsList.add(input);
        }
        String[] wordsArray = wordsList.toArray(new String[0]);
        Map<String, Boolean> result = wordMultiple(wordsArray);
        for (Map.Entry<String, Boolean> entry : result.entrySet()) {   //more sightly output for Map
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }
        return result;
    }
}
