import java.util.Scanner;

public class CheckingAccount implements AccountActions {
    private float checkingBalance;


    public CheckingAccount(float checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    @Override
    public void depositMoney(float amount) {
        this.checkingBalance += amount;
//        float depositM = checkingBalance + amount;
    }

    @Override
    public void withdrawMoney(float amount) {
        this.checkingBalance -= amount;
    }

    @Override
    public float getAccountBalance() {
        return checkingBalance;
    }
}


