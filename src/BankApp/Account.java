package BankApp;

import java.math.BigDecimal;


public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private final String pin;
    private int accountNumber;
    private String accountName;

    public Account(int accountNumber, String accountName, String accountPin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = accountPin;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);

    }

    public BigDecimal getBalance(String pin) {
        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
        return balance;
    }

    public void withdrawal(BigDecimal amount, String pin) {
        if (balance.compareTo(amount) > -1) {
            validate(pin);
            if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
            balance = balance.subtract(amount);
        }
    }


    public void validate(String pin) {

        if (!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid Pin");
    }


    @Override
    public String toString() {
        return String.format("""
                        =======================
                        Account Name: %s
                        Account Number: %s
                        Account Balance: %s
                        =======================
                        """,
                accountName, accountNumber, balance.toPlainString());
    }
}
