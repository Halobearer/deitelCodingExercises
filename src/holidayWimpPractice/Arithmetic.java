package holidayWimpPractice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Integer ==> ");
        int userInput = scanner.nextInt();

        System.out.print("Enter First Integer ==> ");
        int userInput2 = scanner.nextInt();

        int square = userInput * userInput;
        int square2 = userInput2 * userInput2;

        System.out.println("The square of " + userInput + " is " + square);
        System.out.println("The Square of " + userInput2 + " is " + square2);

        int squareSum = square + square2;
        System.out.println("The Sum of their Squares is " + squareSum);

        int squareDifference = square - square2;
        System.out.println("The Difference of their Squares is " + squareDifference);


        int x = 6;
        while (x > 3){
            System.out.println("sup");
            x = x-1;
        }
    }
}
