package feb11th;

class Account {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing...");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Account acc = new Account();

        Runnable r = () -> acc.withdraw(500);

        new Thread(r, "Customer-1").start();
        new Thread(r, "Customer-2").start();
        new Thread(r, "Customer-3").start();
    }
}
