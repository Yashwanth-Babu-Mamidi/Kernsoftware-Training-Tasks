package feb10th.assignment1;


public abstract class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public double getBalance() {
        return balance;
    }
}
