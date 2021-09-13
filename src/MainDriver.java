import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//public class BankData extends BankDataInfo{

//    ArrayList<Account> accounts = BankDataInfo.readFile("BankData.txt");




//public class MainDriver{
//    public static void userLogin(String accountNumber, String accountPassword) throws FileNotFoundException {
//        AccountHolder accountHolder = BankData.accountHolderList.stream().filter(
//                account -> account.getAccountNumber()==Integer.parseInt(accountNumber)).findFirs().orElse(null);
//        if (accountHolder.getAccountHolder() == Integer.parseInt(accountNumber) && accountHolder.getpassword().equals(acccount password)){
//            System.out.println("Welcome " + accountHolder.getFirstName());
//        } else {
//            System.out.println("incorrect account number or password ");
//        }
//    }



public class MainDriver {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = scanner.nextInt();
//        System.out.println("value = "+ a);
//        System.out.println("Enter a Character");
//        char c = scanner.next().charAt(0);
//        System.out.println("Value = " + c);
//

        File file = new File(("BankData.txt"));
        BufferedReader br = new BufferedReader((new FileReader(file)));

    }
}