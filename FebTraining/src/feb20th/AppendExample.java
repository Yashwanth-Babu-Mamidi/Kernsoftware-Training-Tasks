package feb20th;

import java.io.FileWriter;
import java.io.IOException;

public class AppendExample {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("data.txt", true);
        fw.write("\nThis line is appended");
        fw.close();

        System.out.println("Data appended");
    }
}