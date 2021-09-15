import java.util.Scanner;

public class UserFunctionality {
    public static void userOptions(AccountHolder accountHolder) {
        System.out.println("Welcome " + accountHolder.getFirstName());
        System.out.println("Type 1 for Checking ");
        System.out.println("Type 2 for Savings ");
        Scanner userActChoice = new Scanner(System.in);
        int choice = userActChoice.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Welcome to Checking Account");
                System.out.println("Type 1 for Deposit \n Type 2 for withdrawal \n Type 3 for balance ");
                Scanner userCheckingActChoice = new Scanner(System.in);
                int choice1 = userCheckingActChoice.nextInt();
                System.out.println("Your Choice is " + choice1);
                checkingAccountOptions(accountHolder);
                break;

            case 2:
                System.out.println("Welcome to Savings account");
        }
    }

    public static void checkingAccountOptions(AccountHolder accountHolder) {
        System.out.println("Deposit Chosen");
        System.out.println("Choose Amount");
        Scanner checkOptionsActions = new Scanner(System.in);
        int choice2 = checkOptionsActions.nextInt();
        switch (choice2) {
            case 1:

                accountHolder.getCheckingAccount().depositMoney(moneyIn);

        }

        //ToDo depositing money for the checking account.
        //first i need to ask the user to select where the money is being deposited checking or savings
        //user is selecting checking account
        //i have to show 3 options.. 1. deposit money 2. withdraw money 3. current account balance


    }

    public static void userLogin(int accountNumber, String password) {
        AccountHolder accountHolder = BankDataInfo.accountHolderList.stream()
                .filter(userAccount -> userAccount.getAccountNumber() == accountNumber)
                .findFirst().orElse(null);
        assert accountHolder != null;
        if (accountHolder.getAccountNumber() == accountNumber && accountHolder.getAcctPassword().equals(password)) {
            userOptions(accountHolder);
//            System.out.println("Hello " + accountHolder.getFirstName());
        } else {
            System.out.println(" Incorrect Password ");
        }
    }

}






