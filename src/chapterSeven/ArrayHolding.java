package chapterSeven;

import tdd.Account;

import java.util.Arrays;

public class ArrayHolding {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        Account accountsRenike = new Account();
        accountsRenike.deposit(5000);
        int herBalance = accountsRenike.getBalance();
        System.out.println("Your balance is ==>"+herBalance);
        Account accountsTayo = new Account();
        Account accountsmoyin = new Account();


        accounts[0] = accountsRenike;
        accounts[1] = accountsTayo;
        accounts[2] = accountsmoyin;
        System.out.println(Arrays.toString(accounts)); //This will print the object address


    }
}
