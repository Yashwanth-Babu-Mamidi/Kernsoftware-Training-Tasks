package feb12th;

import java.util.concurrent.*;

public class HighLoadSimulation {

    public static void main(String[] args) throws InterruptedException {

        // Total number of incoming requests
        int totalRequests = 100;

        // Step 1: Create a Fixed Thread Pool of size 10
        // Only 10 threads can run simultaneously
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Step 2: Record start time
        long startTime = System.currentTimeMillis();

        // Step 3: Submit 100 tasks (simulate 100 requests)
        for (int i = 1; i <= totalRequests; i++) {

            int requestId = i;  // Local copy for lambda

            executor.submit(() -> {

                try {
                    // Simulate request processing time (1 second)
                    Thread.sleep(1000);

                    System.out.println("Request " + requestId +
                            " processed by " +
                            Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Step 4: Stop accepting new tasks
        executor.shutdown();

        // Step 5: Wait until all tasks finish execution
        executor.awaitTermination(2, TimeUnit.MINUTES);

        // Step 6: Record end time
        long endTime = System.currentTimeMillis();

        // Step 7: Print total time taken
        System.out.println("\nTotal time taken: "
                + (endTime - startTime) + " ms");
    }
}
