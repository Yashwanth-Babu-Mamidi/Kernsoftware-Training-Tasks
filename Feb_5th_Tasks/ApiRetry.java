public class ApiRetry {

    public static void main(String[] args) {

        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            attempts++;
            System.out.println("API Call Attempt: " + attempts);

            // Random success simulation
            if (attempts == 2) {
                success = true;
                System.out.println("API Call Successful");
                break;
            }
        }

        if (!success) {
            System.out.println("API Failed After 3 Attempts");
        }
    }
}

