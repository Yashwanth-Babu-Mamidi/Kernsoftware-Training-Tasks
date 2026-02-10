package feb10th.assignment5;


public class User extends Thread {
    private Theatre theatre;
    private String userName;
    private int seats;

    public User(Theatre theatre, String userName, int seats) {
        this.theatre = theatre;
        this.userName = userName;
        this.seats = seats;
    }

    @Override
    public void run() {
        theatre.bookTickets(userName, seats);
    }
}
