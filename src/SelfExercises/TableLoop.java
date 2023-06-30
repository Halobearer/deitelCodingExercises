package SelfExercises;

public class TableLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {  //
            for (int j = 1; j <= i; j++) { // the second loop works for the first loop
                System.out.print("*");

            }
            System.out.println();
        }
    }
}