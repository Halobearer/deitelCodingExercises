package BankApp;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static jdk.internal.org.jline.keymap.KeyMap.display;

public class ATMmachine {
    private static Scanner keyboardInputCollector = new Scanner(System.in);

    private static Bank accessBank = new Bank();

    public static void main(String[] args) {

        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                =====================
                Welcome to Access Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;

        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            //case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exitApplication();
            default -> gotoMainMenu();
        }
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String pin = input("Enter your pin");
        accessBank.createAccountFor(firstName, lastName, pin);
        display("Account created successfully");

        gotoMainMenu();
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        accessBank.depositInto(accountNumber, amount);
        display("Deposited successfully");

        gotoMainMenu();
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        accessBank.depositInto(accountNumber, amount);
        display("Deposited Successfully");
        String pin = input("Enter your pin");
        accessBank.withdrawFrom(accountNumber, amount, pin);
        display("Withdrawal Successful");

    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("ENTER YOUR ACCOUNT NUMBER"));
        String pin = input("Enter your pin");
        String accountBalance = String.format("""
                your account Balance is %s
                """, accessBank.checkBalanceFor(accountNumber, pin).toPlainString());
        System.out.println(accountBalance);
        gotoMainMenu();
    }

    private static void exitApplication() {
        System.out.println("Thank you for using our application");
        System.exit(1);
    }
//    private static void transfer() {
//        int senderAccountNumber = Integer.parseInt(input("Enter your account number"));
//        int receiverAccountNumber = Integer.parseInt(input("Enter your receiver account number"));
//        BigDecimal senderPin = input("Enter your Pin");
//        try {
//            accessBank.transfer(acco, senderAccountNumber, receiverAccountNumber, senderPin);

//        } catch (IllegalArgumentException error){

//

//        }


    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
        //display(prompt);
        //return keyboardInputCollector.nextLine();
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
        System.out.println(prompt);
    }
}
