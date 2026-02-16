package feb16th;

public class URLValidator {
    public static void main(String[] args) {

        String url = "https://kernsoftware.com";

        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }
}
