public class LoginData {
    public static void userLogin(int accountNumber, String password) {
        AccountHolder accountHolder = BankDataInfo.accountHolderList.stream()
                .filter(userAccount -> userAccount.getAccountNumber() == accountNumber)
                .findFirst().orElse(null);
        if(accountHolder.getAccountNumber()==accountNumber && accountHolder.getAcctPassword().equals(password)){
            System.out.println(accountHolder.getFirstName());
        }else {
            System.out.println(" Incorrect Password ");
        }
    }
}
