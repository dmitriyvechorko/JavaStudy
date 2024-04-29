package LessonTasks;


import java.util.regex.*;

public class Main {

    public static String getDigits(String str) {
        StringBuilder digits = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            digits.append(matcher.group());
        }
        return digits.toString();
    }

    public static String replaceLetters(String str) {
        return str.replaceAll("[a-zA-Z]", "&");
    }

    public static String findInstagram(String str) {
        Pattern pattern = Pattern.compile("inst: @([\\w]+)");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "Instagram не найден";
        }
    }

    public static boolean isNull(String str) {
        return str.equals("null");
    }

    public static String removeNewLines(String str) {
        return str.replaceAll("\\n", "");
    }

    public static void findNameAndSurname(String str) {
        Pattern pattern = Pattern.compile("([А-Я][а-я]+)\\s([А-Я][а-я]+)");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("Имя: " + matcher.group(1));
            System.out.println("Фамилия: " + matcher.group(2));
        } else {
            System.out.println("Имя и фамилия не найдены");
        }
    }

    public static String extractDate(String input) {

        String pattern = "(0?[1-9]|[12]\\d|30|31)[^\\w\\d\\r\\n:](0?[1-9]|1[0-2])[^\\w\\d\\r\\n:](\\d{4}|\\d{2})";
        Matcher m = Pattern.compile(pattern).matcher(input);
        if (m.find()) {
            return m.group();
        } else {
            return "Дата не найдена";
        }
    }

    public static void main(String[] args) {
        String str1 = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String str2 = "Hello \n world \n !!!";
        String str3 = "Всем привет!! Меня зовут Билл Гейтс и я рад изучать Java!";

        System.out.println("1. Цифры из строки: " + getDigits(str1));
        System.out.println("2. Замена букв на &: " + replaceLetters(str1));
        System.out.println("3. Инстаграм из строки: " + findInstagram(str1));
        System.out.println("4. Строка имеет вид 'null': " + isNull("null"));
        System.out.println("5. Удаление \\n: " + removeNewLines(str2));
        System.out.println("6. Поиск имени и фамилии: ");
        findNameAndSurname(str3);

        String input = "coming from the 25.11.2020 to the 30.11.2020";

        System.out.println("Дата извлечена: " + extractDate(input));
    }
}
