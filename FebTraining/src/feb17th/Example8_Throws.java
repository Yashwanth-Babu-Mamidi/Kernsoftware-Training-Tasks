package feb17th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example8_Throws {

    static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}