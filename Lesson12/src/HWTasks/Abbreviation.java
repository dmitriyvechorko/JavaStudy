package HWTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {

    public static void findAbbreviations(String input) {
        String pattern = "\\b[A-Z]{2,6}\\b";
        Matcher m = Pattern.compile(pattern).matcher(input);
        System.out.println("Аббревиатуры в строке:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        findAbbreviations(input);
        scanner.close();
    }
}