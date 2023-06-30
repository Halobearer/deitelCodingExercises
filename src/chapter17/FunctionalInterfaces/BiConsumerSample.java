package chapter17.FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        biConsumer.accept("Felix", 77);
        printNameAge("Tinu", 2);
    }

    //This is the Declarative way of doing it:::
    static BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " " + age);

    //This down here is the Imperative way of doing it::::
    public static void printNameAge(String name, Integer age) {
        System.out.println(name + " " +age);
    }
}
