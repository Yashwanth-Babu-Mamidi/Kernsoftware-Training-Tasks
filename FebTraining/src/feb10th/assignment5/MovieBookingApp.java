package feb10th.assignment5;


public class MovieBookingApp {
    public static void main(String[] args) {

        Movie movie = new Movie("Inception");
        Theatre theatre = new Theatre(5);

        System.out.println("Movie: " + movie.getName());

        // Multiple users trying to book tickets at the same time
        User u1 = new User(theatre, "Alice", 2);
        User u2 = new User(theatre, "Bob", 2);
        User u3 = new User(theatre, "Charlie", 2);

        u1.start();
        u2.start();
        u3.start();

        // Wait for all threads to finish
        try {
            u1.join();
            u2.join();
            u3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        theatre.showBookingHistory();
    }
}
