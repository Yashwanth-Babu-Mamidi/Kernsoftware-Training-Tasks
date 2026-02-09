package feb9th;

import java.util.ArrayList;
import java.util.List;

class Cart {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000));
        products.add(new Product("Mouse", 500));

        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("Total Bill: " + total);
    }
}