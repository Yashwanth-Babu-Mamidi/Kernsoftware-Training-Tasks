package feb11th;

class Order implements Runnable {

    private String orderName;

    public Order(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        System.out.println(orderName + " Validating...");
        System.out.println(orderName + " Processing Payment...");
        System.out.println(orderName + " Completed by " + Thread.currentThread().getName());
    }
}

public class OrderSystem {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Order("Order-" + i));
            t.start();
        }
    }
}
