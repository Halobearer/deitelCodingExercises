package chapter16.maps;

import java.util.HashMap;
import java.util.Map;

public class MapSample1 {
    public static void main(String[] args) {

        Map<String, String> nigerianStates = new HashMap<>();
        //The method put inserts values in tot eh Map
        nigerianStates.put("Zamfara", "Gusau");
        nigerianStates.put("Sokoto", "Sokoto");
        nigerianStates.put("Taraba", "Jalingo");
        nigerianStates.put("Akwa-Ibom", "Uyo");


        System.out.println("map--> "+nigerianStates);
        nigerianStates.put("Akwa-Ibom", "Canada");
        //If you change the values but use the same key for it, it replaces the value used before...
        System.out.println("Map--> "+nigerianStates);
    }
}
