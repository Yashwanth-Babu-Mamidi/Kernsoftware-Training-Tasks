package feb20th;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"));
        bw.write("Buffered writing is faster");
        bw.newLine();
        bw.write("Used for large data");
        bw.close();

        System.out.println("Buffered data written");
    }
}