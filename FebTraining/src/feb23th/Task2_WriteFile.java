package feb23th;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_WriteFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));

        bw.write("Java File Handling");
        bw.newLine();
        bw.write("BufferedWriter Example");
        bw.newLine();
        bw.write("Overwriting file content");
        bw.newLine();
        bw.write("Line 4");
        bw.newLine();
        bw.write("Line 5");

        bw.close();
        System.out.println("Data written successfully");
    }
}