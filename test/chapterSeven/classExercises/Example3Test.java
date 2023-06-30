package chapterSeven.classExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class Example3Test {

    @Test
    public void testFindOdd(){
        int[] numbers = {11,15,12,17,14,5};
        int[] oddElements = Example3.findOdd(numbers);
        int[] expected = {11,15,17,5};
        assertArrayEquals(expected, oddElements);
    }
}