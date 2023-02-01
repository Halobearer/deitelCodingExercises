package DiaryApp;

import javax.swing.*;
import java.util.Scanner;

public class Main {
   // private static Scanner keyboardInputCollector = new Scanner(System.in);

    private static Diary diaryApp = new Diary();

    public static void main(String[] args) {

        goToDiaryMenu();
    }

    private static void goToDiaryMenu() {
        String diaryMenu = """
                ============================
                Welcome to Secret Diary App
                1 -> Create Entry
                2 -> View Entry
                3 -> Delete Entry
                4 -> Count Entry
                5 -> Edit Entry
                6 -> Exit Application
                ============================
                """;
        String userInput = input(diaryMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> countEntry();
            case '5' -> editEntry();
            case '6' -> exitApplication();
            default -> goToDiaryMenu();
        }
    }

    private static void createEntry() {
        String title = input("Enter title");
        String body = input("Enter body");
        //int id = Integer.parseInt(input("Enter your pin"));
        diaryApp.createEntry(title,body);
        display("Entry created Successfully");

        goToDiaryMenu();
    }

    private static void viewEntry() {
        //String firstName = input("Enter your first name");
        int id = Integer.parseInt(input("Enter your id"));
        display(diaryApp.viewEntry(id).toString());

        goToDiaryMenu();
    }

    private static void deleteEntry() {
        int id = Integer.parseInt(input("Enter your Entry id"));
        diaryApp.deleteEntry(id);
        display("Your Entry has been deleted\n Retrieval is IMPOSSIBLE");

        goToDiaryMenu();
    }

    private static void countEntry() {
        diaryApp.countEntry();

        goToDiaryMenu();
    }

    private static void editEntry() {
        int id = Integer.parseInt(input("Enter your id"));
        String title = input("Enter your entry title");
        String body = input("Enter your entry body");
        diaryApp.editEntry(id, title,body);

        goToDiaryMenu();
    }

    private static void exitApplication() {
        System.out.println("Thank you for using our Application");
        System.exit(1);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
