package holidayWimpPractice;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Weight In Pounds ==> ");
        int userWeight = scanner.nextInt();

        System.out.print("Enter Your Height in Inches ==> ");
        int userInches = scanner.nextInt();

        int BMI = (userWeight * 703) / (userInches * userWeight);

        System.out.println("Your BMI is: "+BMI);
    }
}
