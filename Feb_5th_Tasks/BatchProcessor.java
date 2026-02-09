public class BatchProcessor {

    public static void main(String[] args) {

        int[] records = {10, 20, -1, 30, 999, 40};

        for (int record : records) {

            if (record < 0) {
                System.out.println("Skipping invalid record");
                continue;
            }

            if (record == 999) {
                System.out.println("Critical error encountered. Stopping job.");
                break;
            }

            System.out.println("Processing record: " + record);
        }

        System.out.println("Batch Job Finished");
    }
}
