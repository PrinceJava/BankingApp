import java.util.Scanner;

public class Functions {
    public static void userLogin(int accountNumber, String password) {
        AccountHolder accountHolder = BankDataInfo.accountHolderList.stream()
                .filter(userAccount -> userAccount.getAccountNumber() == accountNumber)
                .findFirst().orElse(null);
        if (accountHolder.getAccountNumber() == accountNumber && accountHolder.getAcctPassword().equals(password)) {
//            System.out.println("Hello " + accountHolder.getFirstName());
        } else {
            System.out.println(" Incorrect Password ");
        }


        System.out.println("Welcome " + accountHolder.getFirstName());
        System.out.println("Type 1 for Checking ");
        System.out.println("Type 2 for Savings ");
        System.out.println("Your choice is ");

    }

   }





