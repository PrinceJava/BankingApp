import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) throws IOException{
        BankDataInfo.readFile("C:\\Users\\raurosales\\Desktop\\Project1\\java-project-1\\src\\BankData.txt");
        for (int i =0; i < BankDataInfo.accountHolderList.size(); i++){
            System.out.println(BankDataInfo.accountHolderList.get(i));
        }
    }

}