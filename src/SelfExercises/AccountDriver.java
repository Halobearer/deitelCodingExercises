package SelfExercises;

import java.util.Scanner;
public class AccountDriver {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Account1 damian = new Account1();
        
        System.out.println(" Enter your name ");
            String name1 = input.nextLine();
            damian.setName(name1);

        System.out.println(" Enter amount to deposit ");
            int deposit = input.nextInt();
            damian.deposit(deposit);
            int balance = damian.getBalance();


        System.out.println("Thank you " +name1+ " Your balance is: "+ balance);


        System.out.println("Would you like to make a Withdrawal ? ");

        System.out.println("Enter amount to Withdraw ");
            int withdrawal = input.nextInt();
            damian.withdrawal(withdrawal);
            int balance2 = damian.getBalance();

        System.out.println(" Thank you " +name1+ " Your balance is: " +balance2);


    }
}
