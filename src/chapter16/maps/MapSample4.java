package chapter16.maps;

import java.util.Map;
import java.util.TreeMap;

public class MapSample4 {
    public static void main(String[] args) {

        Map<String, Integer> people = new TreeMap<>();
        people.put("Zainab", 109);
        people.put("Damian", 85);
        people.put("Balablu", 149);

        System.out.println(people);
    }
}
