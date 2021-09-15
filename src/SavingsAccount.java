public class SavingsAccount implements AccountActions {
private float savingsBalance;

    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    @Override
    public void depositMoney(float amount) {
        this.savingsBalance += amount;
    }

    @Override
    public void withdrawMoney(float amount) {
        this.savingsBalance -= amount;

    }

    @Override
    public float getAccountBalance() {
        return savingsBalance;
    }
}