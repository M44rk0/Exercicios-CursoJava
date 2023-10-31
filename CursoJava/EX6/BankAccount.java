package CursoJava.EX6;

public class BankAccount {

    private String Name;
    private final int Account;
    private double Balance;

    public BankAccount(String name, int account, double balance) {
        Name = name;
        Account = account;
        Balance = balance;
    }

    public BankAccount(String name, int account) {
        Name = name;
        Account = account;
    }

    public String getName() {
        return Name;
    }

    public int getAccount() {
        return Account;
    }

    public double getBalance() {
        return Balance;
    }

    public void setName(String name) {
        Name = name;
    }

    public void Withdraw(double value){
        Balance -= value + 5.00;
    }

    public void Deposit(double value){
        Balance += value;
    }

    public String toString(){
        return "Account "
                + Account
                + ", Holder: "
                + Name
                + ", Balance: $ "
                + String.format("%.2f", Balance);
    }
}
