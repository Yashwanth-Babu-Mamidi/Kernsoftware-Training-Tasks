package feb23th;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task8_CopyFile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
        System.out.println("File copied successfully");
    }
}