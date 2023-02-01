package BankApp;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size() + 1;
        Account newAccount = new Account(accountNumber, firstName + " " + lastName, pin);
        accounts.add(newAccount);

    }

    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber - 1);
    }

    public BigDecimal checkBalanceFor(int accountNumber, String pin) {
        return findAccount(accountNumber).getBalance(pin);

    }

    public void depositInto(int accountNumber, BigDecimal amount) {
        findAccount(accountNumber).deposit(amount);
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
        findAccount(accountNumber).withdrawal(amount, pin);
    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdrawal(amount, senderPin);
        receiverAccount.deposit(amount);
    }

    public void delete(int accountNumber, String pin) {
        Account deleteAccount = findAccount(accountNumber);

        //System.out.println("THIS ACCOUNT CAN'T BE FOUND");
        // IF YOU'RE REMOVING FROM AN ARRAY LIST YOU USE THE NAME OF THE ARRAY LIST
        // In this case that is accounts
        accounts.remove(deleteAccount);
        Account account = null;
        accounts.add(accountNumber-1,account);
    }
    public String viewAccounts(){
        return accounts.toString();
    }
}
