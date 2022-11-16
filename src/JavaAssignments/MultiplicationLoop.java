package JavaAssignments;

import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = 0;
        int multiples = 0;

        System.out.println("Enter number or -1 to quit: ");
        int input0 = input.nextInt();

        while (input0 != -1) {
            value = value * input0;
            multiples = multiples + 1;
            System.out.println("Enter a number or -1 to quit: ");
            input0 = input.nextInt();
        }
        if (multiples != 0) {
            int answer = value * input0;


            System.out.printf("%n times %d is %d%n", multiples, value);

        }
    }
}






































