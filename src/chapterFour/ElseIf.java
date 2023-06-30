package chapterFour;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner elseIf = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = elseIf.nextInt();

        if (input > 10) {
            System.out.println("out of range");
        } else {
            if (input % 2 == 0)
                System.out.println("It is even ni");
            else {
                System.out.println("This is odd biko");
            }
        }
    }
}

