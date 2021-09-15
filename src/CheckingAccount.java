import java.util.Scanner;

public class CheckingAccount extends AccountHolder {
    private float checkingBalance;
    private float actNumber;



    public float getCheckingBalance() {
        return checkingBalance;
    }

    public CheckingAccount(float checkingBalance, float actNumber) {
        this.checkingBalance = checkingBalance;
        this.actNumber = actNumber;
    }

    public void setCheckingBalance(float checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public float getActNumber() {
        return actNumber;
    }

    public void setActNumber(float actNumber) {
        this.actNumber = actNumber;
    }

    public CheckingAccount(float checkingBalance) {
        this.checkingBalance = checkingBalance;
        this.actNumber = actNumber;

    }
public CheckingAccount(){}



}





