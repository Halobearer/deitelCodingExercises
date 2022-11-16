package tdd;

public class Account {

    private int balance;
    private String pin = "1234";

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

   // public int getBalance() {
       // return balance;
    }

    //public void Withdrawal(int amount) {
       // if (amount > 0 && amount <= 0)
            //balance = balance - amount;
   // }

   // public String setPin(String pin) ;


        //}


   // }
