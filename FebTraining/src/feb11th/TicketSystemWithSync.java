package feb11th;

class TicketBookingSync {

    int tickets = 10;

    public synchronized void bookTicket() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() +
                    " is booking ticket...");
            try {
                Thread.sleep(100);  // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
            System.out.println(Thread.currentThread().getName() +
                    " booked successfully. Remaining: " + tickets);
        } else {
            System.out.println("No tickets available for " +
                    Thread.currentThread().getName());
        }
    }
}

public class TicketSystemWithSync {

    public static void main(String[] args) {

        TicketBookingSync booking = new TicketBookingSync();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                booking.bookTicket();
            }
        };

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");
        Thread t3 = new Thread(task, "User-3");
        Thread t4 = new Thread(task, "User-4");
        Thread t5 = new Thread(task, "User-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
