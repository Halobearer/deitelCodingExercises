package chapter17.FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("prof", "Zainab"));
    }

    static BinaryOperator<String> binaryOperator =
            (firstName, lastName) -> firstName + " " + lastName;
}
