package feb10th.assignment4;


import java.util.*;

public class PayrollApp {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee());

        list.forEach(e -> System.out.println(e.calculateSalary()));
    }
}