package feb10th.assignment1;


public class CurrentAccount extends BankAccount {

    public CurrentAccount(int acc, double bal) {
        super(acc, bal);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
