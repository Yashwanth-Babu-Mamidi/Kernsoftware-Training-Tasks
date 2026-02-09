public class BillingSystem {

    public static void main(String[] args) {

        double amount = 999.99;

        // Explicit casting
        int storedAmount = (int) amount;

        // Implicit casting
        double implicitCast = storedAmount;

        System.out.println("Original Amount   : " + amount);
        System.out.println("Stored Amount     : " + storedAmount);
        System.out.println("Precision Lost    : " + (amount - storedAmount));
        System.out.println("Implicit Cast Back: " + implicitCast);
    }
}
