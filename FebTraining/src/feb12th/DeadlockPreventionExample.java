package feb12th;

class Account {
    int balance = 1000;
}

public class DeadlockPreventionExample {

    static final Object LOCK1 = new Object();
    static final Object LOCK2 = new Object();

    public static void main(String[] args) {

        Runnable task1 = () -> {

            // Always lock LOCK1 first
            synchronized (LOCK1) {
                System.out.println("Thread-1 locked LOCK1");

                synchronized (LOCK2) {
                    System.out.println("Thread-1 locked LOCK2");
                    System.out.println("Thread-1 completed work");
                }
            }
        };

        Runnable task2 = () -> {

            // Same locking order (prevents deadlock)
            synchronized (LOCK1) {
                System.out.println("Thread-2 locked LOCK1");

                synchronized (LOCK2) {
                    System.out.println("Thread-2 locked LOCK2");
                    System.out.println("Thread-2 completed work");
                }
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
