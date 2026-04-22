package model;

public class PerishableProduct  extends Product {
    private String expiryDate;

    public PerishableProduct(String productId, String name, double price, int quantity, String expiryDate) {
        super(productId, name, price, quantity);
        this.expiryDate = expiryDate;
        
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + " | Expiry: " + expiryDate;
    }
    
}
