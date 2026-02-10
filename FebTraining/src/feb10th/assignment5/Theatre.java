package feb10th.assignment5;


import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private int availableSeats;
    private List<String> bookingHistory = new ArrayList<>();

    public Theatre(int seats) {
        this.availableSeats = seats;
    }

    // synchronized method to prevent overbooking
    public synchronized void bookTickets(String user, int seatsRequested) {
        if (seatsRequested <= availableSeats) {
            availableSeats -= seatsRequested;
            bookingHistory.add(user + " booked " + seatsRequested + " seat(s)");
            System.out.println(user + " successfully booked " + seatsRequested + " seat(s)");
        } else {
            System.out.println(user + " FAILED to book " + seatsRequested + " seat(s)");
        }
    }

    public void showBookingHistory() {
        System.out.println("\nBooking History:");
        for (String record : bookingHistory) {
            System.out.println(record);
        }
        System.out.println("Remaining Seats: " + availableSeats);
    }
}
