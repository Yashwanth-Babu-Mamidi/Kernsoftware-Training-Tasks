package feb10th.assignment6;

public class Doctor {
    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getName() {
        return name;
    }
}
