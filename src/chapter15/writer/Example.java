package chapter15.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\cohortFourteen\\src\\chapter15\\¨test.txt", true)) {
            fileWriter.append("Thank God it's Friday");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
