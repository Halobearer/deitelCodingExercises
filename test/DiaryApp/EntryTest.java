package DiaryApp;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    private Entry damianEntry;

    @Test
    public void testEntryTitle() {
        damianEntry = new Entry(1234, LocalDateTime.now(),"Ndebueze Damian");
        damianEntry.entry(1234);
        damianEntry.setTitle("My Break Up Story");
        assertEquals("My Break Up Story", damianEntry.getTitle(), String.valueOf(damianEntry.getDate()));
    }

    @Test
    public void testEntryBody() {
        damianEntry = new Entry(1234, LocalDateTime.now(),"Ndebueze Damian");
        damianEntry.entry(1234);
        damianEntry.setBody("I am Speechless");
        assertEquals("I am Speechless", damianEntry.getBody());
    }

    @Test
    public void testThatEntryShowsTimeCreated() {
        //DateTimeFormatterBuilder formatterBuilder =
        damianEntry = new Entry(1234, LocalDateTime.now(),"Ndebueze Damian");
        damianEntry.entry(1234);
        assertEquals("", damianEntry.getDate());
    }
}