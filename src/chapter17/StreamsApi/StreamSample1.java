package chapter17.StreamsApi;

import java.util.Arrays;
import java.util.List;

public class StreamSample1 {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 4, 5, 8, 12);
        System.out.println(Arrays.toString(number.stream().filter(x -> x % 2 == 0).toArray()));
        //.forEach(x -> System.out.println(x)):::::::::
    }
}
