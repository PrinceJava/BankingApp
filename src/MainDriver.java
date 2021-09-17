import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainDriver {

    public static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BankDataInfo.readFile("C:\\Users\\raurosales\\Desktop\\Project1\\java-project-1\\src\\BankData.txt");
        Scanner input = new Scanner(System.in);

        int mainMenuChoice;

        {
            System.out.println("Welcome to RosalesInc. Bank ");
            System.out.println("----------------------------");
            System.out.println ( "Please Make a Selection") ;
            System.out.println ( "1. Login to Existing Account" );
            System.out.println ( "2. Create a New Account" ) ;
            System.out.println ( "\n\nEnter a number from 1 to 2" );
            mainMenuChoice = input.nextInt();
            if (mainMenuChoice == 1) {
                UserFunctionality.userLogin(10001, "juagw362");
            }
                    else if (mainMenuChoice == 2) {
                    UserFunctionality.newAccountCreation();
            }else
            System.out.println("Invalid menu option ");
        }

//
//        System.out.println("Hello World");
//        UserFunctionality.newAccountCreation();

    }
}
