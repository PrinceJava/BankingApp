import java.io.BufferedReader;
import java.util.ArrayList;

public class BankDataInfo {
    public static <Accounts, fileReader, Account> ArrayList<Accounts> readFile(String fileName) {
        ArrayList<Accounts> accounts = new ArrayList<Accounts>();
        try {
            fileReader fileReader1 = new fileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader1);
            String line;
            while((line =br.readLine()) !=null){
                String[] currentAccount = line.split(",");
                String acctNumber = currentAccount[0];
                String acctHolder = currentAccount[1];
                String openDat = currentAccount[2];
                double balance = Double.parseDouble(currentAccount[3]);
                Account acct = new Account(acctNumber, acctHolder, openDat, balance);
                accounts.add(Account);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return accounts;
    }
}