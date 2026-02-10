package feb10th.assignment1;



public class SavingsAccount extends BankAccount {

    public SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < 0)
            throw new InsufficientBalanceException("No overdraft allowed");
        balance -= amount;
    }
}
