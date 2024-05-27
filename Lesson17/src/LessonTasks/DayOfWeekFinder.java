package LessonTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in dd.MM.yyyy format: ");

        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate date = LocalDate.parse(input, formatter);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("The day of week: " + dayOfWeek.name());
        } catch (DateTimeParseException e) {
            System.out.println("The wrong format!");
        }

        scanner.close();
    }
}