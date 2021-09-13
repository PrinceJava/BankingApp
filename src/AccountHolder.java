public class AccountHolder{

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String accountHolder;
    private String openDate;
    private double balance;


    public AccountHolder(int acctNumber, String acctHolder, String date, double acctBalance){
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

    public int getAccountNumber() {
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
    @Override
    public String toString() {
        return "AccountHolder{" +
                "actNumber=" + accountNumber +
                ", fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", actPassword='" + actPassword + '\'' +
                ", checkingAccount= " + checkingAccount.getBalance() +
                ", savingsAccount= " + savingsAccount.getBalance() +
                '}';


}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
