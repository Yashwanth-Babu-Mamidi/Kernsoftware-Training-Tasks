package feb12th;

import java.util.concurrent.*;

public class ProducerConsumerExample {

    public static void main(String[] args) {

        // Thread-safe queue
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Producer
        executor.execute(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    String order = "Order-" + i;
                    queue.put(order); // Waits if full
                    System.out.println("Produced: " + order);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer
        executor.execute(() -> {
            try {
                while (true) {
                    String order = queue.take(); // Waits if empty
                    System.out.println("Consumed: " + order);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}
