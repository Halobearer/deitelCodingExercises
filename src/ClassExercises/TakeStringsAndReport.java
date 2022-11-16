package ClassExercises;

import java.util.Scanner;

public class TakeStringsAndReport {
    public static void main(String[] args) {
        // 1. Collect integer from user
        // 2. is userInput is number respond with well done
        // 3. if not respond with olodo

        Scanner scanner = new Scanner(System.in);

        //do {
        int userInput = scanner.nextInt();
        String userInputAsString = String.valueOf(userInput);
        if (Character.isDigit(userInputAsString.charAt(0))) System.out.println("well done");
        // System.out.println("olodo rabata ni e ");
        // } while () {
        //  }
        // }
        // }
        //
    }}