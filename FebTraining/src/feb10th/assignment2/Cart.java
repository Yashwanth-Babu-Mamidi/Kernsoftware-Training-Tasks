package feb10th.assignment2;

import java.util.*;

public class Cart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Electronics());
        System.out.println(cart.calculateTotal());
    }
}
