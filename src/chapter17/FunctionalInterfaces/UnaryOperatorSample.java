package chapter17.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(2));
    }

    static UnaryOperator<Integer> unaryOperator =
            value -> value * 30;
}
