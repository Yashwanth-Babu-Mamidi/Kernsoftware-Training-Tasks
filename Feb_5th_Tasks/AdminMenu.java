import java.util.Scanner;

public class AdminMenu {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n1. Start Service");
                System.out.println("2. Stop Service");
                System.out.println("3. Restart Service");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");
                
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> System.out.println("Service Started");
                    case 2 -> System.out.println("Service Stopped");
                    case 3 -> System.out.println("Service Restarted");
                    case 4 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        }
    }
}
