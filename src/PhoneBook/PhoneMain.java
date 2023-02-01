package PhoneBook;

import javax.swing.*;

public class PhoneMain {

    private static PhoneBooks phoneBookApp = new PhoneBooks();

    public static void main(String[] args) {

        goToMainPage();
    }

    private static void goToMainPage() {
        String phoneMain = """
                ##############################################
                Welcome to PhoneBook
                Here you can save and manage your Contacts
                ###############################################\040\040\040\040\040\040\040\040\040\040\040\040\040
                1 -> Create Contact
                2 -> View Contacts
                3 -> Find Contacts
                4 -> Edit Contacts
                5 -> Count Contacts
                6 -> Delete Contacts
                7 -> Exit Application
                ###############################################
                """;
        String userInput = input(phoneMain);
        switch (userInput.charAt(0)) {
            case '1' -> createContact();
            case '2' -> viewContacts();
            case '3' -> findContacts();
            case '4' -> editContacts();
            case '5' -> countContacts();
            case '6' -> deleteContacts();
            case '7' -> exitApplication();
            default -> goToMainPage();
        }
    }

    private static void createContact() {
        String firstName = input("Enter contact's first name");
        String lastName = input("Enter contact's last name");
        String fullName = firstName + " " + lastName;
        String address = input("Enter contact's address");
        long phoneNumber = Long.parseLong(input("Enter contact's phone number"));
        // if (phoneNumber >= (char) 11) {
        // display("Incorrect phone number");
        //   goToMainPage();
        // }
        phoneBookApp.createContacts(fullName, address, phoneNumber);
        display("Contact created");

        String phoneMain2 = """
                                
                Would you like to create another contact ?!
                1 ->Yes
                2 ->No
                """;
        String userInput2 = input(phoneMain2);
        switch (userInput2.charAt(0)) {
            case '1' -> createContact();
            case '2' -> goToMainPage();
            default -> goToMainPage();
        }
    }

    private static void viewContacts() {
        String name = input("Enter contact name");
        display(phoneBookApp.viewContacts(name).toString());

        goToMainPage();
    }

    private static void findContacts() {

    }

    private static void editContacts() {

    }

    private static void countContacts() {

    }

    private static void deleteContacts() {

    }

    private static void exitApplication() {

    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }


}
