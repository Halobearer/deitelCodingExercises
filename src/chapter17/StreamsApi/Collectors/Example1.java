package chapter17.StreamsApi.Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {

//        System.out.println(Stream.iterate(1, (number)-> number +2)
//                .anyMatch((number)));
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "DAMIAN",
                "THE LAW"
        );

        Map<Integer, List<String>> map = words.stream()
                .collect(Collectors.groupingBy((word)-> word.length()));
        System.out.println(map);
//        Stream<Integer> s1 = words.stream()
//                .flatMap((word) -> Stream.of(word.length()));
//
//        s1.forEach(System.out::println);
    }
}
