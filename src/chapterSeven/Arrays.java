package chapterSeven;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 9;
        numbers[1] = 8;
        numbers[9] = 100;
        numbers[4] = 29;
        System.out.println(java.util.Arrays.toString(numbers));
        // We used java.util.Arrays and the .toString method to see the content of the arrays(what's inside the arrays)
        System.out.println(numbers[9]); // To print the value of index9 only
        System.out.println(numbers[1]+ " "+numbers[9]+ " "+numbers[4]); // To print multiple specific elements


    }
}
