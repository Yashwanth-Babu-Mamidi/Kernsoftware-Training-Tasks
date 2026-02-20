package feb20th;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("auto.txt")) {
            fw.write("No need to close manually");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}