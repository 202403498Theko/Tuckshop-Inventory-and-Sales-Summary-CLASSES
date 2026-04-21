package model;

public class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantitity(int quantity) {
        this.quantity = quantity;
    }

    public String displayInfo() {
        return productId + " | " + name + " | P" + price + " | Qty: " + quantity;
    }
    
}
