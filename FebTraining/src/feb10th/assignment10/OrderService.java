package feb10th.assignment10;

public class OrderService {

    @LogExecutionTime
    public void placeOrder() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        System.out.println("Order placed");
    }
}
