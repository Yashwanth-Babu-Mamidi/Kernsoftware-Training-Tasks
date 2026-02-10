package feb10th.assignment7;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentMethod payment = PaymentFactory.getPayment("UPI");
        payment.pay(1500);
    }
}
