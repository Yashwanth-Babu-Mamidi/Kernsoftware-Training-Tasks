package feb20th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("source.jpg");
        FileOutputStream fos = new FileOutputStream("target.jpg");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully");
    }
}