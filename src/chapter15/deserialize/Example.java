package chapter15.deserialize;

import chapter15.serialize.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\cohortFourteen\\dog"))) {
            var dog = (Dog) objectInputStream.readObject(); //Down-Casting
            System.out.println(dog);
        } catch (IOException | SecurityException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
