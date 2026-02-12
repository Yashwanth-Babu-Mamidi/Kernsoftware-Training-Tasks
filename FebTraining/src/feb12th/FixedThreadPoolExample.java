package feb12th;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {

    public static void main(String[] args) {

        // Step 1: Create a fixed thread pool with 5 threads
        // Only 5 threads will run at the same time
        ExecutorService executor = Executors.newFixedThreadPool(5);

        System.out.println("Submitting API requests...\n");

        // Step 2: Submit 20 tasks (simulating 20 API requests)
        for (int i = 1; i <= 20; i++) {

            int requestId = i; // Local copy for lambda

            executor.submit(() -> {

                // Print which thread is handling which request
                System.out.println("Request " + requestId +
                        " handled by " +
                        Thread.currentThread().getName());

                try {
                    // Simulate API processing time
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Request " + requestId + " completed.\n");
            });
        }

        // Step 3: Shutdown executor
        // No new tasks will be accepted
        executor.shutdown();

        System.out.println("All tasks submitted.");
    }
}
