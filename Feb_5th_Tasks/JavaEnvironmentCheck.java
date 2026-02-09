public class JavaEnvironmentCheck {

    public static void main(String[] args) {

        System.out.println("Java Version      : " + System.getProperty("java.version"));
        System.out.println("JVM Vendor        : " + System.getProperty("java.vendor"));
        System.out.println("OS Name           : " + System.getProperty("os.name"));
        System.out.println("OS Architecture   : " + System.getProperty("os.arch"));
    }
}
