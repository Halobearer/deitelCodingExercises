package holidayWimpPractice;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number ==> ");
        int userInput = scanner.nextInt();

        System.out.print("Enter a Second Number ==> ");
        int userInput2 = scanner.nextInt();

        System.out.print("Enter a Third Number ==> ");
        int userInput3 = scanner.nextInt();

        int sum = userInput + userInput2 + userInput3;
        System.out.println("The Sum of all Numbers is ==> " + sum);

        int average = sum / 3;
        System.out.println("The average of the Numbers is ==> " + average);

        int product = userInput * userInput2 * userInput3;
        System.out.println("The product of the Numbers is ==> " + product);

        if (userInput > userInput2 && userInput > userInput3) {
            System.out.println("The Largest number is " + userInput);
        } else System.out.println("The smallest Number is " + userInput);

        if (userInput2 > userInput3 && userInput2 > userInput) {
            System.out.println("The Largest Number is " + userInput2);
        } else System.out.println("The Smallest Number is " + userInput2);

        if (userInput3 > userInput && userInput3 > userInput2) {
            System.out.println("The Largest Number is " + userInput3);
        } else System.out.println("The Smallest Number is " + userInput3);

        //USE THE METHOD BELOW TO GET ONLY ONE SMALLEST NUMBER THE ONE ABOVE GIVES TWO SMALLEST NUMBERS


       /* if (userInput < userInput2 && userInput < userInput3) {
            System.out.println("The smallest number is:" +userInput );
        }

        if (userInput2 <  && secondNumber < firstNumber) {
            System.out.println("The smallest number is:" +secondNumber);
        }

        if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            System.out.println("The smallest number is:" +thirdNumber);
        }
 */
    }
}
