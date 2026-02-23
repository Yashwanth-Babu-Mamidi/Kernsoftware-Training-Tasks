package feb23th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task6_CountWords {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int wordCount = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            wordCount += words.length;
        }

        br.close();
        System.out.println("Total Words: " + wordCount);
    }
}