package chapter15.Json.deserialization;

import chapter15.Json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {


    public static Cat deserializeJsonToCat(String catJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(catJson.getBytes(), Cat.class);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
