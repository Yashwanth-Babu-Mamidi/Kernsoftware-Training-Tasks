package feb18th;

import java.util.*;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Spring", "Hibernate");

        // Using lambda
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);
    }
}
