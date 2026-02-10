package feb10th.assignment10;

public class FrameworkApp {
    public static void main(String[] args) throws Exception {
        OrderService service = new OrderService();
        ExecutionLogger.log(service);
    }
}
