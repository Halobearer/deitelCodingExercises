package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello user");
        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println(" Welcome wimp " +name);

        System.out.println("Enter first integer");
        double input1 = input.nextDouble();

        System.out.println("Enter second integer");
        double input2 = input.nextDouble();

        double sum = input1 + input2;
        double multiply = input1 * input2;
        double  division = input1 / input2;

        System.out.println("The sum is " +sum);
        System.out.println("The multiple is " +multiply);
        System.out.println("The division is " +division);

        if (sum > multiply) {
            System.out.println("What a life ");
        }

        if (sum < multiply) {
            System.out.println("This is java for you");
        }


    }
}
