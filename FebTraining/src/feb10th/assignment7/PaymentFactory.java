package feb10th.assignment7;

public class PaymentFactory {
    public static PaymentMethod getPayment(String type) {
        if (type.equalsIgnoreCase("UPI"))
            return new UPIPayment();
        if (type.equalsIgnoreCase("CARD"))
            return new CreditCardPayment();
        return null;
    }
}
