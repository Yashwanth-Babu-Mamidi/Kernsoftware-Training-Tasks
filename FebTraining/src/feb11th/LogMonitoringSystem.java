package feb11th;

class LogScanner extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Scanning logs... Cycle " + i);
                Thread.sleep(5000);   // Wait 5 seconds
            }
            System.out.println("Log scanning completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LogMonitoringSystem {

    public static void main(String[] args) throws InterruptedException {

        LogScanner scanner = new LogScanner();

        // Before starting thread
        System.out.println("State before start: " + scanner.getState());

        scanner.start();

        // After starting thread
        System.out.println("State after start: " + scanner.getState());

        // Observe state periodically
        for (int i = 1; i <= 4; i++) {
            Thread.sleep(2000);
            System.out.println("Current Thread State: " + scanner.getState());
        }

        scanner.join(); // Wait until scanner finishes

        System.out.println("Final Thread State: " + scanner.getState());
    }
}
