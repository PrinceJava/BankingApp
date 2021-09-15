import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BankDataInfo {

    public static List<AccountHolder> accountHolderList = new ArrayList<>();
    public static List<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
    public static List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();

    static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                AccountHolder accountHolder = new AccountHolder();
                CheckingAccount checkingAccount = new CheckingAccount();
                SavingsAccount savingsAccount = new SavingsAccount();
                String[] data = currentLine.split(",");
                accountHolder.setAccountNumber(Integer.parseInt(data[0]));
                checkingAccount.setActNumber(Integer.parseInt(data[0]));
                savingsAccount.setActNumber(Integer.parseInt(data[0]));
                accountHolder.setFirstName(data[1]);
                accountHolder.setLastName(data[2]);
                accountHolder.setAcctPassword(data[3]);
//                CheckingAccount checkingAccount = new CheckingAccount(Float.parseFloat(data[4]));
//                SavingsAccount savingsAccount = new SavingsAccount(Float.parseFloat(data[5]));
                accountHolder.setCheckingAccountBal(Float.parseFloat(data[4]));
                accountHolder.setSavingsAccountBal(Double.parseDouble(data[5]));
                BankDataInfo.accountHolderList.add(accountHolder);
                BankDataInfo.checkingAccounts.add(checkingAccount);
                BankDataInfo.savingsAccounts.add(savingsAccount);
                currentLine = reader.readLine();
            }

        } finally {
            assert reader != null;
            reader.close();
        }

    }
}
