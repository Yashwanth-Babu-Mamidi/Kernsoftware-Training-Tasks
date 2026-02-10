package feb10th.assignment6;

import java.util.*;
import java.util.stream.*;

public class HospitalApp {
    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(1, "Ravi", "Cardiology"));
        doctors.add(new Doctor(2, "Meena", "Orthopedic"));

        // Search doctor by specialization (BONUS)
        doctors.stream()
               .filter(d -> d.getSpecialization().equalsIgnoreCase("Cardiology"))
               .forEach(d -> System.out.println("Found Doctor: " + d.getName()));

        Patient p = new Patient("Amit", doctors.get(0));
        p.discharge();
    }
}
