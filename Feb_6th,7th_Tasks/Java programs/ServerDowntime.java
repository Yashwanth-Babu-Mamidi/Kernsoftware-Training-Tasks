public class ServerDowntime {
    public static void main(String[] args) {
        int[] status = {1, 1, 0, 0, 0, 1, 0, 0};

        int totalDowntime = 0;
        int longest = 0, current = 0;

        for (int s : status) {
            if (s == 0) {
                totalDowntime++;
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }

        System.out.println("Total Downtime Hours: " + totalDowntime);
        System.out.println("Longest Continuous Downtime: " + longest);
    }
}
