package feb20th;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.txt"));

        Student s = (Student) ois.readObject();
        ois.close();

        System.out.println(s.id + " " + s.name);
    }
}