package ClassExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReturnDateAndMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date:");
        String userInput = scanner.nextLine();
        dateFormatter(userInput);
    }

    public static void dateFormatter(String date){
        String[] dateSplit = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(dateSplit[2]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[0]));
        System.out.printf("%s, %s, %s, %s",localDate.getDayOfWeek(), localDate.getDayOfMonth() ,localDate.getMonth(), localDate.getYear());
    }
}