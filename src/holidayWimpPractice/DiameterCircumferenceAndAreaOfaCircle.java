package holidayWimpPractice;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfaCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Enter the radius of a Circle ==> ");
        int userRadius = scanner.nextInt();

        //diameter = 2r ( 2 * radius)
        float diameter = 2 * userRadius;
        System.out.println("The diameter of the Circle "+diameter);

        //Circumference = 2 * pi * radius
        double circumference = 2 * pi * userRadius;
        System.out.println("The Circumference of the Circle is "+circumference);

        //Area = pi * r2
        double area = pi * userRadius * userRadius;
        System.out.println("The Area of the Circle is "+area);

    }
}
