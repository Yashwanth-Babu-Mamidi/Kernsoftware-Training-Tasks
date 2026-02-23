package feb23th;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task3_AppendFile {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt", true));
        bw.newLine();
        bw.write("This line is appended");

        bw.close();
        System.out.println("Data appended successfully");
    }
}