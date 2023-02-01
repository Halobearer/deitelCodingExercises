package DiaryApp;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Diary {

    ArrayList<Entry> entries = new ArrayList<>();


    public void createEntry(String title, String body) {
        int idNumber = entries.size() + 1;
        Entry newEntry = new Entry(LocalDateTime.now(), title);
        newEntry.setTitle(title);
        newEntry.setBody(body);
        entries.add(newEntry);
    }

    public Entry viewEntry(int id) {
        //createEntry("Ndebueze", "Damian", 1234);
        return entries.get(id - 1);

    }

    public void deleteEntry(int id) {
        Entry deleteEntry = viewEntry(id);
        entries.remove(deleteEntry);
        Entry entry = null;
        entries.add(1, null);
    }

    public int countEntry(){
        return entries.size();
    }

    public void editEntry(int id, String title, String body){
        Entry entry = viewEntry(id);
        entry.setTitle(title);
        entry.setBody(body);
        entry.getDate();
    }

    // public void


    //
//    ArrayList<Entry> entries = new ArrayList<>();
//
//    public void createEntryFor(String firstName, String lastName, int id) {
//        int entry = entries.size() + 1;
//     //   Entry newEntry = new Entry(entry, 1234, LocalDateTime.now(), firstName + " " + lastName);
//       // entries.add(newEntry);
//    }
//
//    public int getNumberOFEntries() {
//        return entries.size();
//    }


}
