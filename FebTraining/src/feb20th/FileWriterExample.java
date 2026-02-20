package feb20th;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("./Resources/data.txt");
        fw.write("Welcome to Java File Handling\n");
        fw.write("This is a sample text file");
        fw.close();

        System.out.println("Data written successfully");
    }
}