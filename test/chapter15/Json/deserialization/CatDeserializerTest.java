package chapter15.Json.deserialization;

import chapter15.Json.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {

    private String catJson;
    private DateTimeFormatter formatter;
    private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);

    @BeforeEach
    void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        catJson = "{\"name\":\"Morenike\",\"age\":30,\"dateOfBirth\":" + "\"" +
                formatter.format(dateOfBirth) + "\"" + "}";
    }

    @Test
    void deserializeJsonToCat() {
        Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
        assertNotNull(ologbo);
        assertEquals("Morenike", ologbo.getName());
        assertEquals(formatter.format(dateOfBirth), formatter.format(ologbo.getDateOfBirth()));
    }

}