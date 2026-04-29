package model;

public class Sale { 
    private Product product;
    private int quantitySold;
    private double totalPrice;

    public Sale(Product product, int quantitySold) {
        this.product = product;
        this.quantitySold = quantitySold;
        this.totalPrice = product.getPrice() * quantitySold;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        System.out.println(product.getName() + 
            " | Sold: " + quantitySold + 
            " | Total: P" + totalPrice);
    }
}
