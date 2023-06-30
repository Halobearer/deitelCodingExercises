package chapter17.FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println("first operation " + biPredicate.test("Prof", 4));
        System.out.println("second operation " + biPredicate.test("Kabir", 4));
    }

    static BiPredicate<String, Integer> biPredicate = (name, lengthOfName) -> name.length() == lengthOfName;
}
