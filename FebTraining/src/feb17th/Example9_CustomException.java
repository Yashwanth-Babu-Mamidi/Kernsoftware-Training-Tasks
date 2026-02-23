package feb17th;

public class Example9_CustomException {

    static void withdraw(int amount) throws InvalidAmountException {
        if (amount < 1000) {
            throw new InvalidAmountException("Minimum withdrawal is 1000");
        } else {
            System.out.println("Withdrawal Successful");
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(500);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}