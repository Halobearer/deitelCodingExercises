package ClassExercises;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        for (int i =number -1; i >= 1; i--){
            number = number * i;
                // for multiplication 1-12
            //for (int i =number -1; i <= 12; i++){

        //initial condition
        // loop continuation condition
        //post-condition
        //i means count(so it can be: for (int count=0;count <=10;count++)
            System.out.println(i + " times " +number+ " is " +number * i);

        }
        System.out.println(" factorial is " + number);
                //for multiplication 1-12
        //System.out.println(i + " times " +number+ " is " +number * i);
    }
}
