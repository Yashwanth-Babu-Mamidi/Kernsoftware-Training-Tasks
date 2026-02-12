package feb12th;

import java.util.concurrent.*;

class BankAccount {

    private int balance = 5000;

    // Synchronized to prevent race condition
    public synchronized void withdraw(String user, int amount) {

        if (balance >= amount) {
            System.out.println(user + " withdrawing ₹" + amount);
            balance -= amount;
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println(user + " - Insufficient balance");
        }
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {

            String user = "User-" + i;

            executor.submit(() -> {
                account.withdraw(user, 1500);
            });
        }

        executor.shutdown();
    }
}
