package feb18th;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // Filter even numbers
        List<Integer> evenNumbers =
                numbers.stream()
                       .filter(n -> n % 2 == 0)
                       .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // Square of numbers
        List<Integer> squares =
                numbers.stream()
                       .map(n -> n * n)
                       .collect(Collectors.toList());

        System.out.println("Squares: " + squares);

        // Sorted
        List<Integer> sorted =
                numbers.stream()
                       .sorted()
                       .collect(Collectors.toList());

        System.out.println("Sorted: " + sorted);
    }
}
