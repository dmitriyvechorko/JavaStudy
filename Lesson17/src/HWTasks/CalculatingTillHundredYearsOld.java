package HWTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculatingTillHundredYearsOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth date in dd.MM.yyyy format: ");

        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate hundredYearsLater = birthDate.plusYears(100);
            System.out.println("The date you turn one hundred years old: " + hundredYearsLater.format(formatter));
        } catch (DateTimeParseException e) {
            System.out.println("The wrong date format!");
        }

        scanner.close();
    }
}

