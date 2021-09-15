public class SavingsAccount extends AccountHolder {

    int balance;
    int previousTransaction;

    public SavingsAccount(float parseFloat) {
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
