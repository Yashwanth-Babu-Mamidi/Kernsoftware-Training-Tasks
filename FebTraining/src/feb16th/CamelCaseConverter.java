package feb16th;

public class CamelCaseConverter {
    public static void main(String[] args) {

        String sentence = "java string programs";
        String[] words = sentence.split(" ");

        StringBuilder camelCase = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            camelCase.append(words[i].substring(0, 1).toUpperCase());
            camelCase.append(words[i].substring(1));
        }

        System.out.println("camelCase: " + camelCase);
    }
}
 