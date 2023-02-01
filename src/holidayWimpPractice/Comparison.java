package holidayWimpPractice;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Integer ==> ");
        int userInput = scanner.nextInt();

        System.out.print("Enter first Integer ==> ");
        int userInput2 = scanner.nextInt();


        if (userInput == userInput2) {
            System.out.println(userInput + " == " + userInput2);
        }
        if (userInput != userInput2) {
            System.out.println(userInput + " != " + userInput2);
        }
        if (userInput < userInput2) {
            System.out.println(userInput + " < " + userInput2);
        }
        if (userInput > userInput2) {
            System.out.println(userInput + " > " + userInput2);
        }
        if (userInput >= userInput2) {
            System.out.println(userInput + " >= " + userInput2);
        }
        if (userInput <= userInput2) {
            System.out.println(userInput + " <= " + userInput2);
        }

    }
}