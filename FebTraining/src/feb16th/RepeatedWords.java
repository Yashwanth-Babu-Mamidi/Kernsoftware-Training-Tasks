package feb16th;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {
    public static void main(String[] args) {

        String paragraph = "java is easy java is powerful";
        String[] words = paragraph.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Repeated Words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
