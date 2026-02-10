package feb10th.assignment6;

public class Patient {
    private String name;
    private Doctor doctor;

    public Patient(String name, Doctor doctor) {
        this.name = name;
        this.doctor = doctor;
    }

    public void discharge() {
        System.out.println(name + " discharged from Dr. " + doctor.getName());
    }
}
