package chapter17.StreamsApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSample3 {
    public static void main(String[] args) {

        List<String> names = List.of(
                "Damian",
                "Prof",
                "Pauline",
                "Zainab",
                "Deborah"
        );

        System.out.println(names
                .stream()
                .map(String::toUpperCase)//.map() applies the given function to elements of a stream::::::::
                .filter(x -> x.length() < 5)//if the String coming in is less than 5
                .toList());
//KEY VALUE-PAIR
        System.out.println(names
                .stream()
                .collect(Collectors.toMap(x -> x, String::length))
        );
    }
}
