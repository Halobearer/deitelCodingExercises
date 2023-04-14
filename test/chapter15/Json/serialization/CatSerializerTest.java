package chapter15.Json.serialization;

import chapter15.Json.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatSerializerTest {
    Cat cat;

    DateTimeFormatter formatter;

    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);

    @BeforeEach
    public void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        cat = new Cat();
        cat.setAge(20);
        cat.setName("Tom");
        cat.setDateOfBirth(dateOfBirth);
    }

    @Test
    public void testConvertCatToJson() {
        String catJson = CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"name\":\"Tom\",\"age\":20,\"birthday\":" + "\""
                + formatter.format(dateOfBirth) + "\"" + "}", catJson);
    }

    @Test
    public void testConvertCatToJsonIgnoresNullValues() {
        cat.setName(null);
        String catJson = CatSerializer.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"age\":20,\"birthday\":" + "\""
                + formatter.format(dateOfBirth) + "\"" + "}", catJson);
    }

}