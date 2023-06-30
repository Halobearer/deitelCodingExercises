package JavaAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get the L.C.M");
        int input = scanner.nextInt();
        System.out.println(Arrays.toString(solve(input)));
    }


    public static int[] solve(int number) {
        int[] arr = new int[50];

        int dividend = 2;
        int count = 0;

        while (number > 1) {
            if (number % dividend == 0) {
                number = number / dividend;
                arr[count] = dividend;
                count++;
            }else {
                dividend++;
            }
        }

        return new int[number];
    }
}
