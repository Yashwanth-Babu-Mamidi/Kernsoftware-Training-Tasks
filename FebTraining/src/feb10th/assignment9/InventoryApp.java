package feb10th.assignment9;

import java.util.*;

public class InventoryApp {
    static Map<Integer, Product> inventory = new HashMap<>();

    // Method overloading
    static Product search(int id) {
        return inventory.get(id);
    }

    static Product search(String name) {
        return inventory.values()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        inventory.put(1, new Product(1, "Keyboard", 10));
        inventory.put(2, new Product(2, "Mouse", 5));

        System.out.println(search("Mouse").getStock());
    }
}
