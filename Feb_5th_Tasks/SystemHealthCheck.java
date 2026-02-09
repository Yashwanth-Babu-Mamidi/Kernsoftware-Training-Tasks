public class SystemHealthCheck {

    public static void main(String[] args) {

        int cpuUsed = 65;
        int cpuTotal = 100;

        int memoryUsed = 8200;
        int memoryTotal = 16000;

        int cpuUsage = (cpuUsed * 100) / cpuTotal;
        int memoryUsage = (memoryUsed * 100) / memoryTotal;

        System.out.println("CPU Usage    : " + cpuUsage + "%");
        System.out.println("Memory Usage : " + memoryUsage + "%");

        String healthStatus = (cpuUsage < 80 && memoryUsage < 80)
                ? "HEALTHY"
                : "CRITICAL";

        System.out.println("System Status: " + healthStatus);
    }
}
