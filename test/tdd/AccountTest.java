package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        //given
        Account deborahAccount = new Account();
        //when i deposit 5000
        deborahAccount.deposit(5000);
        //check that balance is 5000
       // int deborahAccountBalance = deborahAccount.getBalance();
       // assertEquals(5000, deborahAccountBalance);
    }
@Test
public void depositTwiceTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 4000
        deborahAccount.deposit(4000);
        //when i deposit 2000
        deborahAccount.deposit(2000);
        //check that balance is 6000
       // int deborahAccountBalance = deborahAccount.getBalance();
      //  assertEquals(6000, deborahAccountBalance);
  }

  @Test
    public void depositNegativeAmountTest() {
      //given there is an account
      Account deborahAccount = new Account();
      //given that initial balance is 4000
      deborahAccount.deposit(4000);
      //when i deposit -2000
      deborahAccount.deposit(-2000);
      //check that balance is 6000
     // int deborahAccountBalance = deborahAccount.getBalance();
     // assertEquals(4000, deborahAccountBalance);
  }

  @Test
    public void WithdrawalTest() {
        //given
      Account deborahAccount = new Account();
      //when I deposit 5000
      deborahAccount.deposit(5000);
      //check that balance is 5000

      //when I withdraw 3000
     // deborahAccount.Withdrawal(3000);
      //check that balance is 2000
      //int deborahAccountBalance = deborahAccount.getBalance();
    //  assertEquals(2000, deborahAccountBalance);
    }


  @Test
    public void WithdrawalNegativeTest() {
        //given there is an account
        Account deborahAccount = new Account();
      //given that initial balance is 6000
      deborahAccount.deposit(6000);
      //when I withdraw -4000
     // deborahAccount.Withdrawal(-4000);
      //check that balance is 2000
     // int deborahAccountBalance = deborahAccount.getBalance();
     // assertEquals(6000, deborahAccountBalance);
    }

    @Test
    public void NoFundWithdrawal() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 2000
        deborahAccount.deposit(2000);
        //when i withdraw 6000
       // deborahAccount.Withdrawal(6000);
        //check that balance is 2000
       // int deborahAccountBalance = deborahAccount.getBalance();
      //  assertEquals(2000, deborahAccountBalance);
    }

    @Test
    public void WithdrawalWithRightPin() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 5000
        deborahAccount.deposit(5000);
        //ask for pin
        //deborahAccount.setPin

    }
}