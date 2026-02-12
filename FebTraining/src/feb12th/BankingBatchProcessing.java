package feb12th;

import java.util.concurrent.*;

//Step 1: Create Callable (returns value)
class InterestCalculator implements Callable<Double> {

 private double principal;

 public InterestCalculator(double principal) {
     this.principal = principal;
 }

 @Override
 public Double call() throws Exception {

     // Simulate calculation delay
     Thread.sleep(2000);

     double interest = principal * 0.05; // 5% interest
     return interest;  // Return result
 }
}

public class BankingBatchProcessing {

 public static void main(String[] args) throws Exception {

     // Step 2: Create thread pool
     ExecutorService executor = Executors.newFixedThreadPool(3);

     // Step 3: Submit Callable tasks
     Future<Double> f1 = executor.submit(new InterestCalculator(10000));
     Future<Double> f2 = executor.submit(new InterestCalculator(20000));
     Future<Double> f3 = executor.submit(new InterestCalculator(30000));

     // Step 4: Get results (Blocking call)
     System.out.println("Interest 1: " + f1.get());
     System.out.println("Interest 2: " + f2.get());
     System.out.println("Interest 3: " + f3.get());

     executor.shutdown();
 }
}
