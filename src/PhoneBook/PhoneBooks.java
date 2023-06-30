package PhoneBook;

import java.util.ArrayList;

public class PhoneBooks { //implements java.io.Serializable {


    ArrayList<Contacts> contacts = new ArrayList<>();

    public void createContacts(String name, String address, long phoneNumber) {
        int totalContacts = contacts.size() + 1;
        Contacts newContact = new Contacts();
        newContact.setName(name);
        newContact.setPhoneNumber(phoneNumber);
        newContact.setAddress(address);
        contacts.add(newContact);
    }

    public String viewContacts(String name) {
//        for (Contacts contact : contacts) {
//           // if (contact)
//        }
        return contacts.toString();
    }

    public Contacts findContacts(String name) {
        for (Contacts contacts1 : contacts){

        }
        return contacts.get(Integer.parseInt(name));
    }

    public void editContacts(String PreviousName,String name, String address, long phoneNumber) {
       // Contacts contacts1 = new Contacts();
        Contacts contacts1 = findContacts(PreviousName);
        contacts1.setName(name);
        contacts1.setAddress(address);
        contacts1.setPhoneNumber(phoneNumber);
    }

    public int countContacts() {
        return contacts.size();
    }

    public void deleteContacts(String name) {
        Contacts deleteContact = findContacts(name);
        contacts.remove(deleteContact);
        Contacts contacts2 = null;
        contacts.add(1, contacts2);
    }

    public void groupContacts() {
        PhoneBooks contacts3 = new PhoneBooks();
        //contacts
        /* contacts */
    }


}