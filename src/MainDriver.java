import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDriver {



    public static void main(String[] args) throws IOException {
        BankDataInfo.readFile("C:\\Users\\raurosales\\Desktop\\Project1\\java-project-1\\src\\BankData.txt");
//        for (int i = 0; i < BankDataInfo.accountHolderList.size(); i++) {
//            System.out.println(BankDataInfo.accountHolderList.get(i));

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Acme Bank");
        System.out.println("Please type account number:");
        System.out.println("\n");
        System.out.println("Please type password: ");
        Functions.userLogin(10001, "juagw362");


    }
}