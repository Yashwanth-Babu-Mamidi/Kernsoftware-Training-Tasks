package feb18th;

public class AnonymousVsLambdaDemo {

    public static void main(String[] args) {

        // ==========================================
        // 1️⃣ Using Anonymous Inner Class (Pre-Java 8)
        // ==========================================
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running using Anonymous Inner Class");
            }
        };

        Thread t1 = new Thread(anonymousRunnable);
        t1.start();

        // ==========================================
        // 2️⃣ Using Lambda Expression (Java 8)
        // ==========================================
        Runnable lambdaRunnable = () ->
                System.out.println("Running using Lambda Expression");

        Thread t2 = new Thread(lambdaRunnable);
        t2.start();
    }
}
