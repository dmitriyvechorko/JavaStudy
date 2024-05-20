package HWTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();
        System.out.println("Enter strings (enter empty string for finishing):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            wordsList.add(input);
        }
        String[] wordsArray = wordsList.toArray(new String[0]);
        Map<String, String> result = pairs(wordsArray);
        for (Map.Entry<String, String> entry : result.entrySet()) {   //more sightly output for Map
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, String> pairs(String[] words) {
        Map<String, String> map = new HashMap<>();
        for (String str : words) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            map.put(firstChar, lastChar);
        }

        return map;
    }
}
