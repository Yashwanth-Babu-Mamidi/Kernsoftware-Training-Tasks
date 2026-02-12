package feb12th;

import java.util.concurrent.*;

public class ParallelFileProcessing {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 file processing tasks
        for (int i = 1; i <= 5; i++) {

            int fileId = i;

            executor.submit(() -> {
                System.out.println("Processing File-" + fileId +
                        " by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(3000); // Simulate file processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("File-" + fileId + " completed.");
            });
        }

        executor.shutdown();
    }
}
