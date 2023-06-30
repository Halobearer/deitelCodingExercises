package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {

        try (var fileOutputStream =
                     new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\cohortFourteen\\src\\chapter15\\test2.txt")) {
            //look up ASCII Table to understand the byte numbers
            byte[] bytes = {72, 101, 108, 108, 111, 32, 102, 114, 111, 109, 32, 68, 97, 109, 105, 97, 110, 46};
            fileOutputStream.write(bytes);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
