package feb11th;

class Report extends Thread {
    public Report(String name) {
        super(name);
    }

    public void run() {
        try {
            System.out.println(getName() + " generating...");
            Thread.sleep(2000);
            System.out.println(getName() + " completed.");
        } catch (Exception e) {}
    }
}

public class ReportSystem {
    public static void main(String[] args) throws Exception {

        Report r1 = new Report("Sales Report");
        Report r2 = new Report("Inventory Report");
        Report r3 = new Report("Profit Report");

        r1.start();
        r2.start();
        r3.start();

        r1.join();
        r2.join();
        r3.join();

        System.out.println("All reports completed");
    }
}
