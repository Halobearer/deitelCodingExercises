package Assessment;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter my Date of Birth");
        int date = scanner.nextInt();

        while (date != 25) {

            if (date != 25) {
                System.out.println("Incorrect Guess");
            }

            System.out.println("Enter my Date of Birth");
            date = scanner.nextInt();


            if (date == 25) {
                System.out.println("Correct guess");
            }
        }
    }
}
