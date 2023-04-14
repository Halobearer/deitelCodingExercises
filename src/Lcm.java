import java.util.Arrays;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to get the L.C.M...");
        int userInput = scanner.nextInt();

        // int[] lcmArray = new int[userInput];
        int[] count = new int[10];


        int store = 0;
        int dividend = 2;
        for (int index = 2; index < userInput; index++) {

            if (userInput % index == 0) {
                count[store] = index;
                userInput/=index;
                store++;
            } else {
                dividend++;
            }

            System.out.println(Arrays.toString(count));
        }
    }
}
