package feb16th;

public class LogAnalyzer {
    public static void main(String[] args) {

        String logs =
                "INFO Application started\n" +
                "ERROR Database connection failed\n" +
                "INFO User logged in\n" +
                "ERROR Null pointer exception";

        String[] lines = logs.split("\n");
        int errorCount = 0;

        for (String line : lines) {
            if (line.contains("ERROR")) {
                errorCount++;
            }
        }

        System.out.println("ERROR count: " + errorCount);
    }
}

