package feb18th;

interface Vehicle {

    default void start() {
        System.out.println("Vehicle started");
    }
}

class Bike implements Vehicle {
}

public class DefaultMethodDemo {

    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.start();
    }
}
