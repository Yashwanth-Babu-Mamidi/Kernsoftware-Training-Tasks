public class SalaryIncrement {
    public static void main(String[] args) {
        double[] salaries = {30000, 45000, 50000, 60000};

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += salaries[i] * 0.10;
        }

        System.out.println("Updated Salaries:");
        for (double s : salaries) {
            System.out.println(s);
        }
    }
}
