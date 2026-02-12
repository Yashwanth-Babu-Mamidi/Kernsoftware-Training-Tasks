package feb11th;

class Inventory {

    private int stock = 10;

    public void updateStock(String user) {

        // 🔒 Critical Section (only stock update synchronized)
        synchronized (this) {
            if (stock > 0) {
                System.out.println(user + " is updating stock...");
                try {
                    Thread.sleep(100);  // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                stock--;
                System.out.println("Stock after update: " + stock);
            } else {
                System.out.println("Stock not available for " + user);
            }
        }

        // 📝 Logging (NOT synchronized)
        System.out.println("Log: Stock checked by " + user);
    }
}

public class InventorySystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                inventory.updateStock(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task, "Admin-1");
        Thread t2 = new Thread(task, "Admin-2");
        Thread t3 = new Thread(task, "Admin-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
