package feb18th;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Java", "Spring", "Java", "Hibernate", "Spring");

        // Grouping
        Map<String, Long> result =
                names.stream()
                     .collect(Collectors.groupingBy(
                             name -> name,
                             Collectors.counting()
                     ));

        System.out.println(result);
    }
}
