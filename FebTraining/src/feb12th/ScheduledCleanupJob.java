package feb12th;

import java.util.concurrent.*;

public class ScheduledCleanupJob {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        // Run task every 5 seconds
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Cleaning temporary files... " +
                    System.currentTimeMillis());
        }, 0, 5, TimeUnit.SECONDS);

        // Let it run for 20 seconds
        Thread.sleep(20000);

        scheduler.shutdown();
        System.out.println("Cleanup stopped.");
    }
}
