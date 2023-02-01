package chapterSeven.classExercises;

public class pass_by_Value {
    public static void main(String[] args) {

        int number = 10; //number was passed to square
        square(number);
        System.out.println("number after squaring:: "  +number);

    }

    public static void square(int firstNumber){
        firstNumber = firstNumber*firstNumber; //The answer is only 100 around here
        System.out.println("Square of first number :: "+firstNumber);
    }
}