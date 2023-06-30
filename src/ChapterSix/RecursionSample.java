package ChapterSix;

public class RecursionSample {

    public static void main(String[] args) {
        printRightAngledTriangle(5);
        printLeftAngledTriangle(5);
    }

    private static void printRightAngledTriangle(int number) {
        if (number < 1) {
            return; // The program only starts returning the moment it gets to zero(0).......from(5)
            // After zero is less than one then it will start returning......
        }

        number = number - 1;
        printRightAngledTriangle(number);
        for (int i = 0; i < number; i++) { // Then for the for loop is starts from one(1)
            System.out.print("* ");         // Because zero got kicked out of the Stack
        }
        System.out.println();
    }

    private static void printLeftAngledTriangle(int number) {
        if (number < 1) {
            return; // The program only starts returning the moment it gets to zero(0).......from(5)
            // After zero is less than one then it will start returning......
        }

        number = number - 1;
        printLeftAngledTriangle(number);
        for (int index = number; index < 4; index++) {
            System.out.println(" ");
        }
        for (int index = 0; index < number; index++) { // Then for the for loop is starts from one(1)
            System.out.print("* ");         // Because zero got kicked out of the Stack
        }
        System.out.println();

    }
}