public class ConfigLoader {

    public static void main(String[] args) {

        int maxUsers = 150;
        double threshold = 75.5;
        boolean featureEnabled = true;
        String environment = "PRODUCTION";

        System.out.println("Environment : " + environment);
        System.out.println("Max Users   : " + maxUsers);
        System.out.println("Threshold   : " + threshold);
        System.out.println("Feature ON? : " + featureEnabled);

        if (maxUsers > threshold) {
            System.out.println("⚠ WARNING: Max users exceed threshold!");
        }
    }
}
