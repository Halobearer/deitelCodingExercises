package ClassExercises;
import java.util.Scanner;
public class Identifier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a number ");
        int input1 = input.nextInt();

        if (input1 %2 == 0) {
            System.out.println(+input1+ " is an even number ");
        }

        if (input1 %2 >= 1) {
            System.out.println(+input1+" is an odd number ");
        }
    }
}
