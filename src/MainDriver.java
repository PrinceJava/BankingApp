import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDriver {

    public static final Scanner input = new Scanner(System.in);


// test block on adding new user

//    public static void newAccount(){
//        AccountHolder newAccount = new AccountHolder();
//        System.out.print("Type first name: ");
//        String fName = input.next();
//        accountHolder.setName(fName);


    public static void main(String[] args) throws IOException {
        BankDataInfo.readFile("C:\\Users\\raurosales\\Desktop\\Project1\\java-project-1\\src\\BankData.txt");
//        for (int i = 0; i < BankDataInfo.accountHolderList.size(); i++) {
//            System.out.println(BankDataInfo.accountHolderList.get(i));

        System.out.println("Welcome to Acme Bank");
        System.out.println("Login or create new account: ");
        System.out.println(input.next());
        System.out.println("Please type account number: ");
        System.out.println(input.next());
        System.out.println("Please type password: ");
        System.out.println(input.next());


//        Functions.userLogin(10001, "juagw362");


    }
}