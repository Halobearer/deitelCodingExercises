package chapter17.FunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(biFunction.apply(30, 20));
    }

    static BiFunction<Integer, Integer, String> biFunction =
            (inputOne, inputTwo) -> inputOne + inputTwo + " " + "A String";//it takes in two integers and return String
    //the +" "+ is the return
}