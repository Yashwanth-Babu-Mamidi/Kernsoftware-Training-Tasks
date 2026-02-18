package feb18th;

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparatorLambdaDemo {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "Ravi"));
        list.add(new Employee(1, "Amit"));
        list.add(new Employee(2, "John"));

        // Sort by id
        Collections.sort(list, (e1, e2) -> e1.id - e2.id);

        list.forEach(System.out::println);
    }
}
