package UnchartedAreas;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
      //To display in tabular form
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        // Initializing the elements of an array to default values of zero.
// declare variable array and initialize it with an array object
        int[] array = new int[10];
        array[1] = 2;
        // create the array object
// output each array element's value
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] == 0)
                array[counter] = 12 / 2;
            //To display in tabular form
            System.out.printf("%-5d%-8d%n", counter, array[counter]);
        }

        System.out.println(java.util.Arrays.toString(array));


    }
}
