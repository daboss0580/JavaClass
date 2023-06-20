package Class29;

public class BankAccount {
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void withdraw(double amountToWithdraw){
        if (amountToWithdraw>balance){
            throw new InsufficientBalance("Insufficient balance");
        }
        balance=balance-amountToWithdraw;
    }
}
