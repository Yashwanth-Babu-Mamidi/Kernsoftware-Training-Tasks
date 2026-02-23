package feb23th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5_CountLines {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        int count = 0;

        while (br.readLine() != null) {
            count++;
        }

        br.close();
        System.out.println("Total Lines: " + count);
    }
}