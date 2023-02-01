package chapterSeven.classExercises;

public class accountUpgradeServer {
    private String name;
    private double balance;
    private int pin;

    accountUpgradeServer() {
    }

    public accountUpgradeServer(String name, int balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transfer(double amount) {
        if (pin == 1234)
            balance -= amount;
    }

    public double getTransfer(double amount) {
        return balance + amount;
    }

    public void getCredited(double amount) {
        balance = balance + amount;
    }
}