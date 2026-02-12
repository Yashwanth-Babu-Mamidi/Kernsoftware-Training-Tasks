package feb11th;

//Email Service runs in background
class EmailService implements Runnable {

 private String customerEmail;

 public EmailService(String customerEmail) {
     this.customerEmail = customerEmail;
 }

 @Override
 public void run() {
     try {
         System.out.println("Preparing email for " + customerEmail);
         Thread.sleep(3000);  // Simulate email sending delay
         System.out.println("Email sent successfully to " + customerEmail);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

//Main Order Processing System
public class EmailNotificationSystem {

 public static void main(String[] args) {

     System.out.println("Order received...");

     // Simulate order processing
     try {
         Thread.sleep(1000);
         System.out.println("Payment verified.");
         Thread.sleep(1000);
         System.out.println("Order confirmed.");
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // Start email thread (Async)
     Thread emailThread = new Thread(
             new EmailService("customer@gmail.com")
     );

     emailThread.start();

     // Main thread continues immediately
     System.out.println("Order confirmation displayed to user.");
     System.out.println("Main thread finished work.");
 }
}
