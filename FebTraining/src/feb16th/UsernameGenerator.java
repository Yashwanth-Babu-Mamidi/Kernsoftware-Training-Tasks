package feb16th;

public class UsernameGenerator {
    public static void main(String[] args) {

        String fullName = "Kern Software Solutions";
        String[] words = fullName.split(" ");

        StringBuilder username = new StringBuilder();

        for (String word : words) {
            // take first and last character of each word
            username.append(word.toLowerCase().charAt(0));
            username.append(word.toLowerCase().charAt(word.length() - 1));
        }

        System.out.println("Username: " + username);
    }
}
