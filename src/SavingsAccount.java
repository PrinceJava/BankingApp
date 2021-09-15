public class SavingsAccount extends AccountHolder {

    private float savingsBalance;
    private float actNumber;

    public float getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public float getActNumber() {
        return actNumber;
    }

    public void setActNumber(float actNumber) {
        this.actNumber = actNumber;
    }

    public SavingsAccount() {
        super();
    }}

//
//    void withdraw(int amount)
//    {
//        if(amount !=0){
//            balance = balance - amount;
//            previousTransaction = amount;
//        }
//
//    }
//    void deposit(int amount){
//        if(amount !=0){
//            balance = balance - amount;
//            previousTransaction = amount;
//        }
//    }
//    void getPreviousTransaction(){
//        if(previousTransaction > 0)
//        {
//            System.out.println("Deposited: "+ previousTransaction);
//        }else if(previousTransaction<0){
//            System.out.println("Withdrawn: " +Math.abs(previousTransaction));
//        }else{
//            System.out.println("No Transaction Occurred");
//        }
//    }
//
//
//}
//
