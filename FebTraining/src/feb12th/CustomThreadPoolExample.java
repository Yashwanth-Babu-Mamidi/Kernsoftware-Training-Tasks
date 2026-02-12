package feb12th;

import java.util.concurrent.*;

public class CustomThreadPoolExample {

    public static void main(String[] args) {

        try (ThreadPoolExecutor executor = new ThreadPoolExecutor(
		        2,   // core pool size
		        4,   // max pool size
		        10,  // keep alive time
		        TimeUnit.SECONDS,
		        new ArrayBlockingQueue<>(5) // queue capacity
		)) {
			for (int i = 1; i <= 15; i++) {

			    int taskId = i;

			    executor.execute(() -> {
			        System.out.println("Executing Task-" + taskId +
			                " by " + Thread.currentThread().getName());
			        try {
			            Thread.sleep(2000);
			        } catch (Exception e) {}
			    });
			}

			executor.shutdown();
		}
    }
}
