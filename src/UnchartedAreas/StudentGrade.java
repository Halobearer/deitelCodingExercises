package UnchartedAreas;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students: ");
        int studentAmount = scanner.nextInt();

        System.out.println("Enter Number of subjects he offers: ");
        int subjectTotal = scanner.nextInt();

        int[][] gradeBook = new int[studentAmount][subjectTotal];

        int studentIndex;
        int subjectIndex = 0;
        for (studentIndex = 0; studentIndex < gradeBook.length; studentIndex++) {
            System.out.println("STUDENT-ID " + (studentIndex + 1) + " FOR SEMICOLON");
            for (subjectIndex = 0; subjectIndex < gradeBook[studentIndex].length; subjectIndex++) {
                System.out.println("Enter Score For SUBJECT " + (subjectIndex + 1));
                int score = scanner.nextInt();
                gradeBook[studentIndex][subjectIndex] = score;
            }
        }
//        for (int subjectDisplay = 0; subjectDisplay < gradeBook[subjectTotal][studentAmount]; subjectDisplay++) {
//            System.out.println("Grades for student" + (studentIndex + 1));
////            System.out.println("Grades for subject" + (subjectIndex + 1));
//        }

    }
    // TODO: 2/19/2023 find cash

}
