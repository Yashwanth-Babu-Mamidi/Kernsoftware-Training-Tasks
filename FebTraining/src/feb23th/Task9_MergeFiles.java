package feb23th;

import java.io.*;

public class Task9_MergeFiles {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));

        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        String line;

        while ((line = br1.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        while ((line = br2.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br1.close();
        br2.close();
        bw.close();

        System.out.println("Files merged successfully");
    }
}