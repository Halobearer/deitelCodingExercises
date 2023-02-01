package holidayWimpPractice;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number ==> ");
        int userInput = scanner.nextInt();

        //  int divisible = userInput % 3;

        if (userInput % 3 == 0) {
            System.out.println(userInput + " is divisible by 3");
        } else System.out.println("The Number is not Divisible by 3");
    }
}
