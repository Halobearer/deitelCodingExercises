package ClassExercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReturnAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Date To get the Age:(dd/MM/yyyy) ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dateTimeNow = LocalDate.now();

        //int period = Period.between(formatter, dateTimeNow).getYears();

       // System.out.println("YOU ARE" + period + "years old");
    }
}
