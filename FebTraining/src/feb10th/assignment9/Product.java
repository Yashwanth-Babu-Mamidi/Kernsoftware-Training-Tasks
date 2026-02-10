package feb10th.assignment9;

public class Product {
    private int id;
    private String name;
    private int stock;

    public Product(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public void updateStock(int qty) {
        if (stock + qty < 0)
            throw new IllegalArgumentException("Stock cannot be negative");
        stock += qty;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }
}
