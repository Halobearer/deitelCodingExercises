package chapterSeven;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Scores you want to add? ");
        int numberOfScores = scanner.nextInt();

        int[] scores = new int[numberOfScores]; //Whatever the user puts will be our array length....
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score" + (index + 1) + ":"); // signalling enter score1
            // int score = Scanner.nextInt();
            scores[index] = scanner.nextInt();
            // scores[index] = score;
        }

        for (int index = 0; index < scores.length; index++) {
            sum += scores[index];
        }
        System.out.println("sum of scores is ==> " + sum);
    }
}
