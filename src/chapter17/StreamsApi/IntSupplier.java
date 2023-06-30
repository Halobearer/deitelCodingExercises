package chapter17.StreamsApi;

import java.util.Random;
import java.util.stream.IntStream;

public class IntSupplier {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(IntStream.
                generate(() -> 1 + random.nextInt(20))
                .limit(12)
                .boxed()
                .toList());

        System.out.println(IntStream
                .iterate(0, i -> i < 20, x -> x + 2)//Index means seed
                .boxed()
                .toList()
                .stream().toList());

    }
}
