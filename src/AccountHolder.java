class  AccountHolder {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String acctPassword;
    private Double checkingAccountBal;
    private Double SavingsAccountBal;

        public int getAccountNumber() {
        return accountNumber;
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

    public String getAcctPassword() {
        return acctPassword;
    }

    public void setAcctPassword(String acctPassword) {
        this.acctPassword = acctPassword;
    }

    public Double getCheckingAccountBal() {
        return checkingAccountBal;
    }

    public void setCheckingAccountBal(Double checkingAccountBal) {
        this.checkingAccountBal = checkingAccountBal;
    }

    public Double getSavingsAccountBal() {
        return SavingsAccountBal;
    }

    public void setSavingsAccountBal(Double savingsAccountBal) {
        SavingsAccountBal = savingsAccountBal;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", acctPassword='" + acctPassword + '\'' +
                ", checkingAccountBal=" + checkingAccountBal +
                ", SavingsAccountBal=" + SavingsAccountBal +
                '}';
    }
}

