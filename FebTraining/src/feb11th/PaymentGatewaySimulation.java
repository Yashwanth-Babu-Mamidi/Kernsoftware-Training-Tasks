package feb11th;

class Payment extends Thread {

    public Payment(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            int delay = 1000 + (int)(Math.random() * 2000); // 1–3 seconds
            System.out.println(getName() + " started payment. Processing time: "
                    + delay + " ms");

            Thread.sleep(delay);

            System.out.println(getName() + " payment completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PaymentGatewaySimulation {

    public static void main(String[] args) {

        System.out.println("Payment processing started...\n");

        Payment p1 = new Payment("User-1");
        Payment p2 = new Payment("User-2");
        Payment p3 = new Payment("User-3");

        p1.start();
        p2.start();
        p3.start();

        System.out.println("\nMain thread continues execution...");
    }
}
