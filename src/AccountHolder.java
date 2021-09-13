public class AccountHolder{

    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private double balance;



    public AccountHolder(String acctNumber, String acctHolder, String date, double acctBalance){
        this.accountNumber = acctNumber;
        this.accountHolder = acctHolder;
        this.openDate = date;
        this.balance = acctBalance;

    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;

    }
    public void deposit (double amount){
        this.balance = this.balance +amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
