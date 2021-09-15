import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDriver {

    public static final Scanner input = new Scanner(System.in);



    public static void main(String[] args) throws IOException {
        BankDataInfo.readFile("C:\\Users\\raurosales\\Desktop\\Project1\\java-project-1\\src\\BankData.txt");

//        System.out.println("Welcome to Acme Bank");
//        System.out.println("Login or create new account: ");
//        System.out.println(input.next());
//        System.out.println("Please type account number: ");
//        System.out.println(input.next());
//        System.out.println("Please type password: ");
//        System.out.println(input.next());
//
//        System.out.println();
        UserFunctionality.userLogin(10001, "juagw362");


    }
}