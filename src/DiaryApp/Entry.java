package DiaryApp;

import java.time.LocalDateTime;

public class Entry {

    private String title;
    private String body;
    private LocalDateTime date = LocalDateTime.now();
    private int id;


    public Entry(LocalDateTime date, String name) {
        this.id = id;
    }


    public void entry(int id) {
        validateId(id);
        LocalDateTime.now();
        System.out.println("The query was Created --> " + date);
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDate() {
        System.out.println(date);
        //  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //  System.out.println(format);
        return date;

    }

    public void validateId(int id) {
        if (id != (this.id)) {
            throw new IllegalArgumentException("Invalid Pin");
        }

    }

    @Override
    public String toString() {
        return String.format("""
                        =======================
                        Date of creation: %s
                        Entry title: %s
                        Entry body: %s
                        Entry id:%s
                        =======================
                        """,
                date, title, body, id).toString();
    }
}
