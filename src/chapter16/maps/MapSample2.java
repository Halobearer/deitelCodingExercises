package chapter16.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample2 {
    public static void main(String[] args) {

        Map<String, String[]> nigerianStates = new HashMap<>();

        nigerianStates.put("Zamfara", new String[]{"Akure", "Gusau"});
        nigerianStates.put("Sokoto", new String[]{"Sokoto", "Gusau"});
        nigerianStates.put("Taraba", new String[]{"Gembu", "Jalingo municipal"});
        nigerianStates.put("Akwa-Ibom", new String[]{"Ikot-ekpene", "ikono"});


        var set = nigerianStates.entrySet();
        set.forEach(e -> System.out.println(e.getKey() + " : " + Arrays.toString(e.getValue())));

//        nigerianStates.keySet()
//                .forEach(k -> System.out.println(k + Arrays.toString(nigerianStates.get(k)) + "\n"));

        nigerianStates.forEach((k, v) -> System.out.println(k + " : " + Arrays.toString(v)));

//
//        String[] value = nigerianStates.get("Taraba");
//        System.out.println(Arrays.toString(value));

    }
}
