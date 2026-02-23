package feb23th;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}