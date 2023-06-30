package chapter17.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
//The Consumer takes in something but does not return::::::::
        Consumer<String> consumer = age -> System.out.println(age); //This means for anything that comes in print it out
        Consumer<String> after = name -> System.out.println(name);
        //also this System.out::println means to print anything that comes in
        //:: means method reference it also replaces the lambda Expression
        //and is used to refer to the method whether it is static , or a Constructor
        consumer.accept("Zainab");
        consumer.andThen(after).accept("23");
    }
}
