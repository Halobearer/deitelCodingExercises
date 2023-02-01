package SelfExercises;

import java.util.Scanner;

public class LoopFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a number to get the Factorial: ");
        int userInput = input.nextInt();
        // This is constant as it doesn't change, so  it should be outside the loop
        System.out.print(userInput+"! = "+userInput);

        for (int count = userInput-1; count >= 1; count--){
            System.out.print(" * "+count);
            userInput *= count;

        }
        System.out.println("\nThe answer is "+userInput);
    }
}
