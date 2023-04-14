package ClassExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int[] input = new int[]{scanner.nextInt()};

        System.out.println(sortArray(input));
    }

    public static ArrayList<Integer> sortArray(int[] array){

        int dividend = 2;

        ArrayList <Integer> newArr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % dividend == 0){
                int number = array[i] / dividend;
                newArr.add(number);
            }else {
                dividend++;
            }
        }

        return newArr;
    }
}
