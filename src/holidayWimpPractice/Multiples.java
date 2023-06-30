package holidayWimpPractice;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number ==> ");
        int userInput = scanner.nextInt();

        System.out.print("Enter a Number ==> ");
        int userInput2 = scanner.nextInt();

        int triple = userInput * userInput * userInput;
        System.out.println("The triple of " + userInput + " is " + triple);

        int secondDoubled = userInput2 * userInput2;
        System.out.println("The double of "+userInput2+" is "+secondDoubled);


        if (triple % secondDoubled == 0) {
            System.out.println("The First number is a multiple of the Second Number Doubled");
        } else System.out.println("The first number isn't a multiple of the Second number doubled \nMeaning that "
        +triple+ " is not a multiple of "+secondDoubled);
    }
}
