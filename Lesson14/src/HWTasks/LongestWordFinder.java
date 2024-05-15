package HWTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LongestWordFinder {
    public static void main(String[] args) {
        String inputFile = "romeo-and-juliet.txt";
        String outputFile = "longest_word.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {
            String line;
            String longestWord = "";
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            writer.write(longestWord);
            System.out.println("The longest word is: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

