package Class23;

public class BankAccount {
    private String userName;
    private String password;
    private double accountBalance = 1200;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public double getAccountBalance(String password) {
        if (password.equals("DAboss12")) {
            System.out.println(accountBalance);
        } else {
            System.out.println("Wrong password");
        }return 0;


    }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }

}
class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("admin", "pass");
        System.out.println(bankAccount.getAccountBalance("DAboss12"));
        bankAccount.setAccountBalance(100000);
        System.out.println(bankAccount.getAccountBalance("DAboss12"));

    }
}