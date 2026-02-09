public class ServerLoad {
    public static void main(String[] args) {
        int[] cpuLoad = {65, 70, 55, 80, 90, 60, 75};

        int max = cpuLoad[0];
        int min = cpuLoad[0];
        int sum = 0;

        for (int load : cpuLoad) {
            max = Math.max(max, load);
            min = Math.min(min, load);
            sum += load;
        }

        double average = (double) sum / cpuLoad.length;

        System.out.println("Highest Load: " + max);
        System.out.println("Lowest Load: " + min);
        System.out.println("Average Load: " + average);
    }
}
