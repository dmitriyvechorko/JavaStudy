package WorkingWithStrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringsTasks {
    public static void task1(String[] arrayOfStrings) {
        String shortest = arrayOfStrings[1];
        String longest = arrayOfStrings[1];
        for (int i = 0; i < 3; i++) {
            String line = arrayOfStrings[i];

            if (shortest.isEmpty() || line.length() < shortest.length()) {
                shortest = line;
            }

            if (longest.isEmpty() || line.length() > longest.length()) {
                longest = line;
            }
        }

        System.out.println("Самая короткая строка: " + shortest + ", длина: " + shortest.length());
        System.out.println("Самая длинная строка: " + longest + ", длина: " + longest.length());
    }

    public static void task2(String[] arrayOfStrings) {
        String[] strings = new String[3];
        System.arraycopy(arrayOfStrings, 0, strings, 0, 3);
        Arrays.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void task3(String[] arrayOfStrings) {
        int totalLength = 0;
        for (int i = 0; i < 3; i++) {
            totalLength += arrayOfStrings[i].length();
        }

        int averageLength = totalLength / 3;

        System.out.println("Средняя длина строк: " + averageLength);
        System.out.println("Строки с длиной меньше средней:");
        for (String str : arrayOfStrings) {
            if (str.length() < averageLength) {
                System.out.println(str + ", длина: " + str.length());
            }
        }
    }

    public static void task4(String[] arrayOfStrings) {
        for (String line : arrayOfStrings) {
            String[] words = line.split(" +");
            for (String word : words) {
                if (isUnique(word)) {
                    System.out.println("Первое слово из уникальных символов: " + word);
                    return;
                }
            }
        }

        System.out.println("Нет слова из уникальных символов в строках.");
    }

    private static boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (word.indexOf(currentChar) != word.lastIndexOf(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public static void task5(String line) {
        StringBuilder doubledString = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            doubledString.append(currentChar).append(currentChar);
        }

        System.out.println("Новая строка с задублированными буквами: " + doubledString);
    }

    public static void taskStar(String line) {
        Scanner scanner = new Scanner(System.in);
        String[] words = line.split(" +");
        System.out.print("Введите номер слова для проверки на палиндром:");
        int wordIndex = scanner.nextInt();
        if (wordIndex <= 0 || wordIndex > words.length) {
            System.out.print("Ошибка: введенный номер слова выходит за границы строки.");
            return;
        }
        String selectedWord = words[wordIndex - 1];
        if (isPalindrome(selectedWord)) {
            System.out.print("Слово \"" + selectedWord + "\" является палиндромом.");
        } else {
            System.out.print("Слово \"" + selectedWord + "\" не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(word.charAt(left));
            char rightChar = Character.toLowerCase(word.charAt(right));
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
