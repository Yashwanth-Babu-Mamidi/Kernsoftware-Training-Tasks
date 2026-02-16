package feb16th;

import java.util.Scanner;

public class OTPVerification {
    public static void main(String[] args) {

        String generatedOTP = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter OTP: ");
        String enteredOTP = sc.next();

        if (generatedOTP.equals(enteredOTP)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }
        sc.close();
    }
}

