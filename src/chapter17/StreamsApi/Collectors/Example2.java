package chapter17.StreamsApi.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {

    public static Map<String, Integer> sortMapEntries(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new,
                        (k, v) -> k.put(v.getKey(), v.getValue()),
                        LinkedHashMap::putAll);
    }
}
