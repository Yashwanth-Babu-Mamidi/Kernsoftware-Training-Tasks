package feb10th.assignment3;

public class RentalApp {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("Rent: " + v.calculateRent());
    }
}