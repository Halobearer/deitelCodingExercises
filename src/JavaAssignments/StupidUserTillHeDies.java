package JavaAssignments;

import java.util.Scanner;

public class StupidUserTillHeDies {
    public static void main(String[] args) {
        Scanner satisfy = new Scanner(System.in);

        System.out.println("Enter a number or press 0 to stop");
        int number = satisfy.nextInt();

        int largestNumber = number;
        int smallestNumber = number;

    //NA THE CODE BE DIS WEREY
        do {
         if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            System.out.println("Enter a number or press 0 to stop");
            number = satisfy.nextInt();
        }
        while (number != 0);





        System.out.println(" The largest number is: " + largestNumber);
        System.out.println(" The smallest number is: " + smallestNumber);
    }
}
