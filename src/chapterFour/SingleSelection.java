package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        //collect the input
        //check userInput
        //userInput divided 2 has no remainder
        //print it is even

        Scanner evenOddCollector = new Scanner(System.in);

        System.out.println("Enter an even number: ");
        int userInput = evenOddCollector.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("It is even");
        }
        else {
            System.out.println("It is even na");
        }

    }
}