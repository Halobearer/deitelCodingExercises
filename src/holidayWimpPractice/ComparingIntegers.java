package holidayWimpPractice;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bingo = 100;

        System.out.print("Enter a Number ==> ");
        int userInput = scanner.nextInt();

        int square = userInput * userInput;
        System.out.println("The Square of the number is ==> " + square);

        if (userInput > bingo) {
            System.out.println(userInput + " > "+bingo);
        }
        if (square > bingo){
            System.out.println(square+" > "+bingo);
        }
        if (userInput == bingo){
            System.out.println(userInput+" == "+bingo);
        }
        if (square == bingo){
            System.out.println(square+" == "+bingo);
        }





        if (userInput != bingo){
            System.out.println(userInput+" != "+bingo);
        }
        if (square != bingo){
            System.out.println(square+" != "+bingo);
        }
        if (userInput < bingo){
            System.out.println(userInput+" < "+bingo);
        }
        if (square < bingo){
            System.out.println(square+" < "+bingo);
        }
    }
}
