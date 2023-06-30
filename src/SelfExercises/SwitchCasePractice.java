package SelfExercises;

import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER AN ODD NUMBER FROM 1-19 ");
        int userInput = input.nextInt();


        if (userInput % 2 != 0 && userInput <= 19) {
            System.out.println("You entered an odd number");
        }

            switch (userInput) {
                case 1:
                    System.out.println("Good keep Inputting ");
                    break;
                case 2:
                    System.out.println("Good keep Inputting ");
                case 3:
                    System.out.println("Good keep Inputting ");
                case 4:
                    System.out.println("Good keep Inputting ");
                case 5:
                    System.out.println(" Good keep inputting ");
                case 6:
                    System.out.println("Good keep Inputting");
                case 7:
                    System.out.println("Good keep Inputting ");
                case 8:
                    System.out.println("Good keep Inputting ");
                case 9:
                    System.out.println("Good keep Inputting ");
                case 10:
                    System.out.println("Good keep inputting ");


                default:
                    System.out.println("Olodo I said enter an Odd number ");

            }
    }
}
