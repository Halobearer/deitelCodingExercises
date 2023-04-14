package UnchartedAreas;

import java.util.Objects;

public class Arrays {
    public static void main(String[] args) {

        int[] number = new int[10];
        String[] numberTwo = {"bruh", "Goats", "Sleep", "Spaceship", "Galaxy", "Avenge", "Nuclear",
                "Japan", "Anime", "New-York", "States", "Nigeria", "Caged", "Freedom"};

        //We wrap ion an Array.toString to show the string representation of the full array
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        // .length determines the length of the array
        System.out.println(number.length);
        System.out.println(numberTwo.length);

        System.out.println(java.util.Arrays.toString(number));
        System.out.println(java.util.Arrays.toString(numberTwo));
        // If you want to add to an array, and you don't know the index
        // we loop through the array to find the index for what we're looking

        for (int index = 0; index < numberTwo.length; index++) {
            if (Objects.equals(numberTwo[index], "Anime"))
                System.out.println(index);
            else {
                System.out.println("WEREY");
            }
            for (int i = 0; i < number.length; i++) {
                if (number[i] == 0) {
                    number[i] = 25;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(number));
        System.out.println(java.util.Arrays.toString(numberTwo));

        int[][] num = new int[3][4];
        System.out.println(java.util.Arrays.deepToString(num));

    }

}
