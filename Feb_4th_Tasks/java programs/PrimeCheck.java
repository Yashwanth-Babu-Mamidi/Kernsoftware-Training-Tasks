import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            boolean prime = true;

            if (num <= 1) prime = false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            System.out.println(prime ? "Prime" : "Not Prime");
        }
    }
}
