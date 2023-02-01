package chapterSeven.classExercises;

public class Example3 {
    public static int[] findOdd(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count++;
            //Odd syntax
        }

        int[] oddElements = new int[count];
        int oddElementsCounter = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter]%2 != 0){
                oddElements[oddElementsCounter] = numbers[counter];
                oddElementsCounter++;
            }
        }
        return oddElements;
    }

}
