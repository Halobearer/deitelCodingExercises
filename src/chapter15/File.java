package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class File {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream
                     = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\cohortFourteen\\src\\chapter15\\¨test.txt")) {
          //Look up ASCII table to understand the byte numbers in the array

            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));

            for (byte b:bytes) {
                System.out.println(Character.toString(b)+ " ");
            }

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
