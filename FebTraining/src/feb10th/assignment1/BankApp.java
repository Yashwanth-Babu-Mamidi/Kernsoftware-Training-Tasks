package feb10th.assignment1;

import java.util.*;

public class BankApp {
    public static void main(String[] args) throws InsufficientBalanceException {
        Map<Integer, BankAccount> accounts = new HashMap<>();

        accounts.put(1, new SavingsAccount(1, 5000));
        accounts.put(2, new CurrentAccount(2, 3000));

        try {
            accounts.get(1).withdraw(6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        accounts.get(2).withdraw(6000);
        System.out.println("Current Balance: " + accounts.get(2).getBalance());
    }
}