public class ApiResponseTime {
    public static void main(String[] args) {
        int[] responseTimes = {1200, 2500, 1800, 3000, 900};

        int sum = 0;
        System.out.println("Slow APIs (>2000 ms):");

        for (int time : responseTimes) {
            sum += time;
            if (time > 2000) {
                System.out.println(time);
            }
        }

        double average = (double) sum / responseTimes.length;
        System.out.println("Average Response Time: " + average);
    }
}
