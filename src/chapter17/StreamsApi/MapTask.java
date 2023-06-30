package chapter17.StreamsApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Damian", 17);
        map.put("James", 24);
        map.put("Spencer", 45);
        map.put("Peter", 12);
        map.put("Anthony", 32);

        System.out.println(map.entrySet()
                .stream().sorted().toList());
    }
}
