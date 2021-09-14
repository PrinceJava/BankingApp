import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
//    public void run() throws FileNotFoundException {
//        Scanner scan = new Scanner (new File("C:\\Users\\raurosales\\Desktop\\BankData.txt"));
//        Scanner login = new Scanner (System.in);
//        String user = scan.nextLine();
//        String pass = scan.nextLine();
//
//        String inpUser = login.nextLine();
//        String inpPass = login.nextLine();


        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print(" Welcome to Acme Bank ");
        } else {
            System.out.print(" Incorrect Username or Password ");
        }
    }
}

