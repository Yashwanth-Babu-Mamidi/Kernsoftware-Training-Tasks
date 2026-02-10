package feb10th.assignment7;

public class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
