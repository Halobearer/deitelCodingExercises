package chapter17.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
//        System.out.println(function.apply("Kabir"));
//
//        System.out.println("Declarative: " + function2.apply(10));
//        System.out.println("Imperative: " + multiplyByTwenty(10));
        Function<Integer, Integer> result = function.andThen(function2);

        System.out.println(result.apply(10));
    }

    static Function<Integer, String> function =
            input -> input * 20 + "";

    static Function<String, Integer> function2 = name -> name.length();

    //Imperative Way
    public static int multiplyByTwenty(int input) {
        return input * 20;
    }
}
