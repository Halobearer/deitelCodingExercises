package Assessment;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;

        int largestNumber = 0;
        int secondLargestNumber = 0;

        while (counter <= 10) {

            System.out.println("Enter a number");
            int number = scanner.nextInt();

            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;

            } else if (number > secondLargestNumber) {
                secondLargestNumber = number;
            }
            counter++;
        }
        System.out.println("The Largest number is: " + largestNumber);
        System.out.println("The SecondLargest Number is: " + secondLargestNumber);
    }
}