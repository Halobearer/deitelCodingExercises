package SelfExercises;

public class Account1 {
    private int balance;
    private String name;


    public void deposit(int amount) {
        if (amount <= 50000) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        if (amount <= 25000) {
            balance = balance - amount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

