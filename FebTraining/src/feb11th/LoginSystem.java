package feb11th;

class UserLogin extends Thread {

    public UserLogin(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " Login started at: " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(getName() + " Login Successful");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LoginSystem {
    public static void main(String[] args) {

        UserLogin t1 = new UserLogin("User-1");
        System.out.println("State before start: " + t1.getState());

        t1.start();

        System.out.println("State after start: " + t1.getState());
    }
}
