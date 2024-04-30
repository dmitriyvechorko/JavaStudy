package HWTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarTask {
    public static void main(String[] args) {
        String text = "Номер документа 1423-1512-51 и email teachmeskills@gmail.com, а также номер телефона +(33)6844135.";

        // Поиск номера документа
        Pattern docPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher docMatcher = docPattern.matcher(text);
        if (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
        }

        // Поиск email
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(text);
        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        // Поиск номера телефона
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        if (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }
    }
}

