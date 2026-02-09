public class LoginTracker {

    static int totalLogins = 0;
    int sessionId;

    LoginTracker(int sessionId) {
        this.sessionId = sessionId;
        totalLogins++;
    }

    void showStatus() {
        System.out.println("Session ID : " + sessionId);
        System.out.println("Total Logins So Far : " + totalLogins);
    }

    public static void main(String[] args) {

        LoginTracker user1 = new LoginTracker(101);
        user1.showStatus();

        LoginTracker user2 = new LoginTracker(102);
        user2.showStatus();

        LoginTracker user3 = new LoginTracker(103);
        user3.showStatus();
    }
}
