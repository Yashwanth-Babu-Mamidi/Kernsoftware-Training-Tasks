package feb11th;

class DeadlockExample {

    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 locked A");
                synchronized (lock2) {
                    System.out.println("Thread1 locked B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 locked B");
                synchronized (lock1) {
                    System.out.println("Thread2 locked A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
