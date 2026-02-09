public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {85, 110, 75, -5, 40, 60};

        int invalid = 0, pass = 0, fail = 0;

        for (int m : marks) {
            if (m < 0 || m > 100) {
                invalid++;
            } else if (m >= 50) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Invalid Marks: " + invalid);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);
    }
}
