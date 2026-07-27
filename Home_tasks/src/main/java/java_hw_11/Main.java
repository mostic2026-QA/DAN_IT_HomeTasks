package java_hw_11;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____Task #1_____");
        task1();
        System.out.println("_____Task #2_____");
        task2();
        System.out.println("_____Task #3_____");
        task3();
        System.out.println("_____Task #4_____");
        task4();
        System.out.println("_____Task #5_____");
        task5();
    }

    public static void task1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedData = localDateTime.format(time);
        System.out.println(formattedData);
    }

    public static void task2() {
        LocalDateTime startDateTime = LocalDateTime.of(2026, 7, 27, 13, 56);
        LocalDateTime result = startDateTime.plusDays(3).plusHours(5);
        System.out.println(result);
    }

    public static void task3() {
        LocalDateTime date = LocalDateTime.of(2026, 7, 27, 13, 59);
        DayOfWeek day = date.getDayOfWeek();
        if (day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY)) {
            System.out.println("true. " + "Have a good " + day);
        } else {
            System.out.println("false. " + "It`s " + day + " today!");
        }
    }

    public static void task4() {
        LocalDateTime startDateTime = LocalDateTime.of(2026, 7, 27, 14, 18);
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedData = startDateTime.format(time);
        System.out.println(formattedData);
    }

    public static void task5() {
        LocalDateTime example = LocalDateTime.of(2026, 7, 27, 14, 40);
        LocalDateTime example2 = LocalDateTime.of(2010, 7, 15, 20, 44);
        Duration duration = Duration.between(example2, example);
        System.out.println("Days " + duration.toDays() + ", hours " + duration.toHours() % 24 + ", minutes " + duration.toMinutes() % 60);
    }
}