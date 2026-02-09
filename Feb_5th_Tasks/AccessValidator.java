public class AccessValidator {

    public static void main(String[] args) {

        int age = 22;
        boolean hasValidId = true;
        boolean hasSubscription = false;

        if (age >= 18 && hasValidId && hasSubscription) {
            System.out.println("✅ Access Granted");
        } else {
            System.out.println("❌ Access Denied");
        }
    }
}
