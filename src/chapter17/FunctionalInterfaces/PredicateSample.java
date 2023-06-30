package chapter17.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        System.out.println(predicate.test(10));

        //the and() method returns if and only if the first operation is true
        Predicate<Integer> andOperation = predicate.and(after);
        System.out.println(andOperation.test(10));
    }

    //Predicate returns true if the input matches the predicate
    static Predicate<Integer> predicate = input -> input % 2 == 1;
    static Predicate<Integer> after = afterInput -> afterInput >= 5;
}
