package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank accessBank;

    @BeforeEach
    public void startEachTestWith() {
        accessBank = new Bank();
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
    }

    @Test
    public void accountCanBeCreatedInBank() {
        Bank accessBank = new Bank();
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.createAccountFor("Alexandra", "Ndebueze", "1232");
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        assertEquals(3, accessBank.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreation() {
        String expected = """
                =======================
                Account Name: null
                Account Number: null
                Account Balance: 0
                =======================
                """;
        assertEquals(expected, accessBank.findAccount(1).toString());
    }

    @Test
    public void balanceCanBeCheckedTest() {
        assertEquals("0", accessBank.checkBalanceFor(1, "1232").
                toPlainString());
    }

    @Test
    public void depositIntoAccountTest() {
        accessBank.depositInto(1, BigDecimal.valueOf(50));
        assertEquals(BigDecimal.valueOf(50), accessBank.checkBalanceFor(1, "1232"));
    }

    @Test
    public void withdrawFromAccountTest() {
        accessBank.depositInto(1, BigDecimal.valueOf(50));
        accessBank.withdrawFrom(1, BigDecimal.valueOf(20), "1232");
        assertEquals(BigDecimal.valueOf(30), accessBank.checkBalanceFor(1, "1232"));
    }

    @Test
    public void transferMoneyTest() {
        accessBank.createAccountFor("Alexandra", "Ndebueze", "1234");
        accessBank.depositInto(2, BigDecimal.valueOf(5000));

        accessBank.transfer(BigDecimal.valueOf(2000), 2, 1, "1234");

        assertEquals(BigDecimal.valueOf(2000), accessBank.checkBalanceFor(1, "1232"));
        assertEquals(BigDecimal.valueOf(3000), accessBank.checkBalanceFor(2, "1234"));
    }

    @Test
    public void closeAccountTest() {
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.withdrawFrom(1, BigDecimal.valueOf(500), "1232");
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.createAccountFor("Dambgdjhdh", "Ndebueze", "1232");
        accessBank.createAccountFor("Damisduhsi", "Ndebueze", "1232");
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.createAccountFor("Damian", "Ndebueze", "1232");
        accessBank.delete(1, "1232");
        accessBank.delete(4,"");
        accessBank.delete(3, "");
        accessBank.delete(5,"" );
        System.out.println(accessBank.viewAccounts());
       // assertEquals("THIS ACCOUNT CAN'T BE FOUND", accessBank.findAccount(2));

        // assertEquals();

    }
}