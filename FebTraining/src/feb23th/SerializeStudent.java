package feb23th;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Ravi");

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.txt"));

        oos.writeObject(s);
        oos.close();

        System.out.println("Object Serialized");
    }
}