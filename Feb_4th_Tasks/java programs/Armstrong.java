import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int temp = num, sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
        }
    }
}

