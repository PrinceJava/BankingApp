import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BankDataInfo {

    public static List<AccountHolder> accountHolderList = new ArrayList<>();


    static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                AccountHolder accountHolder = new AccountHolder();
                String[] data = currentLine.split(",");
                accountHolder.setAccountNumber(Integer.parseInt(data[0]));
                accountHolder.setFirstName(data[1]);
                accountHolder.setLastName(data[2]);
                accountHolder.setAcctPassword(data[3]);
                CheckingAccount checkingAccount = new CheckingAccount(Float.parseFloat(data[4]));
                SavingsAccount savingsAccount= new SavingsAccount(Float.parseFloat(data[5]));
                accountHolder.setCheckingAccount(checkingAccount);
                accountHolder.setSavingsAccount(savingsAccount);
                BankDataInfo.accountHolderList.add(accountHolder);
                currentLine = reader.readLine();
            }

        } finally {
            assert reader != null;
            reader.close();
        }

    }
}
