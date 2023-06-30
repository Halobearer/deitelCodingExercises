package chapterTwo;

import java.util.Scanner;

public class AddingTwoIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int userInput = input.nextInt();

        System.out.println("Enter Second Integer: ");
        int userInput2 = input.nextInt();

        int sum = userInput + userInput2;

        System.out.printf("The sum is ==> %d%n", sum);
        //%d%n is for integers, %s%n is for string

    }
}
