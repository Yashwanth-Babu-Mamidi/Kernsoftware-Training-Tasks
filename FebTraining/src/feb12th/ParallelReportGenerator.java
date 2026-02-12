package feb12th;

import java.util.*;
import java.util.concurrent.*;

public class ParallelReportGenerator {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create list of Callable tasks
        List<Callable<String>> reports = Arrays.asList(

                () -> {
                    Thread.sleep(2000);
                    return "Sales Report Ready";
                },

                () -> {
                    Thread.sleep(2000);
                    return "Inventory Report Ready";
                },

                () -> {
                    Thread.sleep(2000);
                    return "Profit Report Ready";
                },

                () -> {
                    Thread.sleep(2000);
                    return "HR Report Ready";
                },

                () -> {
                    Thread.sleep(2000);
                    return "Finance Report Ready";
                }
        );

        // invokeAll executes all tasks and waits
        List<Future<String>> results = executor.invokeAll(reports);

        // Print results
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
