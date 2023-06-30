package chapter17.FunctionalInterfaces;

import java.util.function.Consumer;

public class Sample2 {
    public static void main(String[] args) {
        consumerDeclarative.andThen(name -> System.out.println(name + "60")).accept("Damian ");
    }

    static Consumer<String> consumerDeclarative = name -> System.out.println(name);
}
