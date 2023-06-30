package Menstrual_Flow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Menstrual_Flow.MenstrualApp.calculatePeriod;

public class Cyclle {

    public static void main(String[] args) {
        viewCycle();
    }

    public static void viewCycle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your last flow date in pattern (yyyy-MM-dd)");
        String flow = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate lastFlow = LocalDate.parse(flow, formatter);

        System.out.println("Enter the cycle length in Days:");
        int cycleLength = scanner.nextInt();

        LocalDate ovulation = lastFlow.plusDays((int) (0.4 * cycleLength));

        LocalDate next = calculatePeriod(lastFlow, cycleLength);
        System.out.println("Your Next Expected Period is " + next);
        System.out.println("Your Ovulation date is " + ovulation);
    }
}
