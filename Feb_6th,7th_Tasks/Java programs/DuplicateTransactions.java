import java.util.HashSet;

public class DuplicateTransactions {
    public static void main(String[] args) {
        int[] transactions = {101, 202, 303, 101, 404, 202};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int t : transactions) {
            if (!seen.add(t)) {
                duplicates.add(t);
            }
        }

        System.out.println("Duplicate Transactions: " + duplicates);
    }
}
