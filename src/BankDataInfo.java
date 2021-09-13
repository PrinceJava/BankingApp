import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BankDataInfo {

    public static List<AccountHolder> accountHolderList = new ArrayList<AccountHolder>();
}

//    public void readFile(String fileName) throws IOException {
//        File file = new File("BankData.txt");
//        BufferedReader reader = null;
//        try{
//            reader = new BufferedReader(new BufferedReader(file));
//            String currentLine = reader.readLine();
//
//            while (currentLine != null)
//                AccountHolder accountHolder = new AccountHolder();
//
//            String data = currentLine.split(",");
//            accountHolder.setAcctNumber(Integer.parseInt(data[0]));
//
//        }


//    }

//    public static <Accounts, fileReader, Account> ArrayList<Accounts> readFile(String fileName) {
//        ArrayList<Accounts> accounts = new ArrayList<Accounts>();
//        try {
//            fileReader fileRead = new fileReader(fileName);
//            BufferedReader br = new BufferedReader(fileRead);
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] currentAccount = line.split(",");
//                String acctNumber = currentAccount[0];
//                String acctHolder = currentAccount[1];
//                String openDat = currentAccount[2];
//                double balance = Double.parseDouble(currentAccount[3]);
//                Account acct = (Account) new AccountHolder(acctNumber, acctHolder, openDat, balance);
//                accounts.add(AccountHolder);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return accounts;
//    }
