package chapter17.FunctionalInterfaces;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
//        IntConsumer intConsumer = System.out::println;
//        intConsumer.accept(100000); OR ::::::::::::::::::::::::::::::::>>>>>>>>>

        IntConsumer intConsumer = nums -> System.out.println(nums);
        intConsumer.accept(100000);
    }

}
