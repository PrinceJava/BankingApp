import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;


public class UserFunctionality {
    public static void userOptions(AccountHolder accountHolder) {
//        Scanner userActOptions = new Scanner(System.in);
        System.out.println("Welcome " + accountHolder.getFirstName());
//        System.out.println("1. To display Chercking account balance ");
//        System.out.println();


        System.out.println("Type 1 for Checking ");
        System.out.println("Type 2 for Savings ");
        Scanner userActChoice = new Scanner(System.in);
        int choice = userActChoice.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Welcome to Checking Account");
                System.out.println("Type 1 for Deposit \n Type 2 for withdrawal \n type 3 for Balance ");
                Scanner userCheckingActChoice = new Scanner(System.in);
                int checkActChoice = userCheckingActChoice.nextInt();
                if (checkActChoice == 1) {
                    System.out.println("Depositing money");
                    checkingAccountDepositOption(accountHolder);
                } else if (checkActChoice == 2) {
                    System.out.println("Withdrawal money");
                    checkingAccountWithdrawalOption(accountHolder);
                } else if (checkActChoice == 3) {
                    System.out.println("Check Account Balance");
                    checkingAccountBalanceOption(accountHolder);
                } else {
                    System.out.println("Incorrect menu option ");
                }
                break;

            case 2:
                System.out.println("Welcome to Savings account");
                System.out.println("Type 1 for Deposit \n Type 2 for withdrawal \n Type 3 for Balance ");
                Scanner userSavingsActChoice = new Scanner(System.in);
                int savingsActChoice = userSavingsActChoice.nextInt();
                if (savingsActChoice == 1) {
                    System.out.println("Depositing Money");
                    savingsAccountDepositOption(accountHolder);
                } else if (savingsActChoice == 2) {
                    System.out.println("Withdrawal Money ");
                    savingsAccountWithdrawalOption(accountHolder);
                } else if (savingsActChoice == 3) {
                    System.out.println("Savings Account Balance");
                    savingsAccountBalanceOption(accountHolder);
                } else {
                    System.out.println("Invalid menu option ");
                }
                break;
        }
    }

    public static void checkingAccountDepositOption(AccountHolder accountHolder) {
        System.out.println("Deposit Chosen");
        System.out.println("Choose Amount");
        Scanner depositAmountScanner = new Scanner(System.in);
        float depositAmount = depositAmountScanner.nextFloat();
        System.out.println(depositAmount);
        accountHolder.getCheckingAccount().depositMoney(depositAmount);
        System.out.println("your new balance is " + accountHolder.getCheckingAccount().getAccountBalance());
    }

    public static void checkingAccountWithdrawalOption(AccountHolder accountHolder) {
        Scanner checkingWithdrawal = new Scanner(System.in);
        System.out.println("Your current balance is " + accountHolder.getCheckingAccount().getAccountBalance());
        System.out.println("Enter amount to withdraw: ");
        float amount = checkingWithdrawal.nextFloat();
        if (amount <= accountHolder.getCheckingAccount().getAccountBalance()) {
            accountHolder.getCheckingAccount().withdrawMoney(amount);
            System.out.println("Your new balance is " + accountHolder.getCheckingAccount().getAccountBalance());
            userOptions(accountHolder);
        } else {
            System.out.println("Insufficient Funds");
            userOptions(accountHolder);
        }
    }

    public static void checkingAccountBalanceOption(AccountHolder accountHolder) {
        System.out.println("Your current balance is " + accountHolder.getCheckingAccount().getAccountBalance());
    }

    public static void savingsAccountDepositOption(AccountHolder accountHolder) {
        System.out.println("Deposit Chosen");
        System.out.println("Choose Amount");
        Scanner depositSavingsAmountScanner = new Scanner(System.in);
        float depositAmount = depositSavingsAmountScanner.nextFloat();
        accountHolder.getSavingsAccount().depositMoney(depositAmount);
        System.out.println("Your new balance is " + accountHolder.getSavingsAccount().getAccountBalance());
    }

    public static void savingsAccountWithdrawalOption(AccountHolder accountHolder) {
        Scanner savingWithdrawal = new Scanner(System.in);
        System.out.println("Your current balance is " + accountHolder.getSavingsAccount().getAccountBalance());
        System.out.println("Enter amount to withdraw: ");
        float amount = savingWithdrawal.nextFloat();
        if (amount <= accountHolder.getSavingsAccount().getAccountBalance()) {
            accountHolder.getSavingsAccount().withdrawMoney(amount);
            System.out.println("Your new balance is " + accountHolder.getSavingsAccount().getAccountBalance());
            userOptions(accountHolder);
        } else {
            System.out.println("Insufficient Funds");
            userOptions(accountHolder);
        }
    }

    public static void savingsAccountBalanceOption(AccountHolder accountHolder) {
        System.out.println("Your current balance is " + accountHolder.getSavingsAccount().getAccountBalance());
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

    public static void newAccountCreation() {
        AccountHolder accountHolder = new AccountHolder();
        Scanner newAct = new Scanner(System.in);
        int accountNumber = BankDataInfo.accountHolderList.stream().map(AccountHolder::getAccountNumber).reduce((x, y) -> x > y ? x : y).orElse(0);
        accountHolder.setAccountNumber(accountNumber);
        System.out.println("Enter First Name: ");
        Scanner userCreateFirstNameScanner = new Scanner (System.in);
        String firstName = userCreateFirstNameScanner.next();
        accountHolder.setFirstName(firstName);
        System.out.println("Enter Last Name: ");
        Scanner userCreateLastNameScanner = new Scanner (System.in);
        String lastName = userCreateLastNameScanner.next();
        accountHolder.setLastName(lastName);
        System.out.println("Enter Password: ");
        Scanner userCreatePasswordScanner = new Scanner(System.in);
        String password = userCreatePasswordScanner.nextLine();
        accountHolder.setAcctPassword(password);
        System.out.println("Enter Initial Deposit Amount ");
        float firstChecking = newAct.nextFloat();
        CheckingAccount firstCheckingAccount = new CheckingAccount(firstChecking);
        System.out.println("Enter Initial Deposit Amount ");
        float firstSavings = newAct.nextFloat();
        SavingsAccount firstSavingsAccount = new SavingsAccount(firstSavings);
        accountHolder.setAccountNumber(accountNumber);
        accountHolder.setFirstName(firstName);
        accountHolder.setAcctPassword(lastName);
        accountHolder.setCheckingAccount(firstCheckingAccount);
        accountHolder.setSavingsAccount(firstSavingsAccount);

        try {
            BankDataInfo.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        };







