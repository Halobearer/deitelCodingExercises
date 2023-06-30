package chapterSeven.classExercises;

import java.util.Scanner;

public class accountTransfer {
    public static void main(String[] args) {

        accountUpgradeServer accountUpgradeServer1 = new accountUpgradeServer("Mr.Damian", 2_000, 1234);
        accountUpgradeServer accountUpgradeServer2 = new accountUpgradeServer("Mr.Tayo", 1_000, 2345);
        Scanner input = new Scanner(System.in);

        System.out.println("Good day " + accountUpgradeServer1.getName() + "\n Your current Balance is " + accountUpgradeServer1.getBalance());
        System.out.println("Enter an amount to deposit " + accountUpgradeServer1.getName());
        double userDeposit = input.nextDouble();
        if (userDeposit >= 1000 && userDeposit <= 100000) {
            System.out.println("Enter your pin: ");
            int userPin = input.nextInt();

            if (userPin == 1234) {
                accountUpgradeServer1.deposit(userDeposit);
                double balance = accountUpgradeServer1.getBalance();
                System.out.println("Deposit Successful");
                System.out.println(accountUpgradeServer1.getName() + " Your current balance is " + balance);
            } else
                System.out.println(accountUpgradeServer1.getName() + " Your Pin is Incorrect");
        } else System.out.println("You can't deposit below 1,000 and you can't deposit above 100,000");

        System.out.println("Enter an Amount to Transfer " + accountUpgradeServer1.getName());
        double userTransfer = input.nextDouble();
        System.out.println("Enter your pin: ");
        int userPin2 = input.nextInt();

        if (userPin2 == 1234) {
            accountUpgradeServer1.transfer(userTransfer);
            System.out.println("Transfer Successful");
            double balance2 = accountUpgradeServer1.getBalance();
            System.out.println(accountUpgradeServer1.getName() + " Your current balance is " + balance2);
        } else
            System.out.println("Your Pin was Incorrect \n Transfer Failed");

        try {

            if (userPin2 == 1234) {
                System.out.println("Good day " + accountUpgradeServer2.getName() + "\n Your previous balance was " + accountUpgradeServer2.getBalance());
                System.out.println(accountUpgradeServer2.getName() + " Your Account just got credited by " + accountUpgradeServer1.getName());
                accountUpgradeServer2.getCredited(userTransfer);
                double balance3 = accountUpgradeServer2.getBalance();
                System.out.println(accountUpgradeServer2.getName() + " Your Current balance is " + balance3);
            }
        } catch (IllegalArgumentException sup) {
            System.out.println(sup.getMessage());
        }

    }
}

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userInput = input.nextLine();
        accountUpgradeServer damianAccount = new accountUpgradeServer();
        damianAccount.setName(userInput);

        System.out.println("Enter an Amount to DEPOSIT: ");
        double userDeposit = input.nextDouble();
        damianAccount.deposit(userDeposit);
        double balance = damianAccount.getBalance();

        System.out.println("Mr." +userInput+" Thank you, Your Balance is ==> " +balance);

        System.out.println("Enter an Amount to Transfer: ");
        double userInput2 = input.nextDouble();
        damianAccount.transfer(userInput2);
        double hisbalance = damianAccount.getBalance();
        System.out.println("Mr."+userInput+ " Your balance is ==>" +hisbalance);

        System.out.println("Enter Name:");
        String userInput3 = input.next();
        accountUpgradeServer smartsAccount = new accountUpgradeServer();
        smartsAccount.setName(userInput3);

        System.out.println("Enter an Amount to Deposit:");
        double userInput4 = input.nextDouble();
        smartsAccount.deposit(userInput4);
        double smartbalance = smartsAccount.getBalance();
        System.out.println("Mr"+userInput3+" Your Balance is ==>"+smartbalance);

        smartsAccount.getCredited(userInput4);
        double smartbalance1 = smartsAccount.getBalance();
        System.out.println("Mr."+userInput3+" Your Balance is ==>"+smartbalance1);


    }
}
*/