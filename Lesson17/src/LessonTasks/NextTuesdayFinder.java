package LessonTasks;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class NextTuesdayFinder {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextTuesday = findNextTuesday(today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Next Tuesday: " + nextTuesday.format(formatter));
    }

    private static LocalDate findNextTuesday(LocalDate date) {
        DayOfWeek targetDay = DayOfWeek.TUESDAY;
        DayOfWeek currentDay = date.getDayOfWeek();
        int daysUntilNextTuesday = targetDay.getValue() - currentDay.getValue();

        if (daysUntilNextTuesday <= 0) {
            daysUntilNextTuesday += 7;
        }

        return date.plusDays(daysUntilNextTuesday);
    }
}
