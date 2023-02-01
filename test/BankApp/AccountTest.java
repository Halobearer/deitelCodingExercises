package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account paulineAccount;

    @BeforeEach
    public void startWithThis() {
        paulineAccount = new Account(1531954970, "Damian", "1234");
    }

    @Test
    public void depositMoneyTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithCorrectPinTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithCorrectThrowsExceptionTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        assertThrows(IllegalArgumentException.class, () -> paulineAccount.getBalance("2231"));
    }

    @Test
    public void withdrawalMoneyTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        paulineAccount.withdrawal(BigDecimal.valueOf(1_000), "1234");
        assertEquals(BigDecimal.valueOf(1_000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void testThatWithdrawalIsImpossibleWhenAmountIsMoreThanBalance() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        paulineAccount.withdrawal(BigDecimal.valueOf(20_000), "1234");
        assertEquals(BigDecimal.valueOf(2_000), paulineAccount.getBalance("1234"));

    }

    @Test
    public void WithdrawalWithWrongPinThrowsExceptionTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2_000));
        paulineAccount.withdrawal(BigDecimal.valueOf(1_000), "1234");
        assertThrows(IllegalArgumentException.class, () -> paulineAccount.withdrawal(BigDecimal.valueOf(1_000), "2231"));
    }

    @Test
    public void proofMichaelWrongTest(){
        System.out.println(paulineAccount.toString());
    }

}