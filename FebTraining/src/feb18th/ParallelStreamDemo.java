package feb18th;

import java.util.*;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.parallelStream()
            .forEach(n ->
                System.out.println(n + " - " + Thread.currentThread().getName())
            );
    }
}
