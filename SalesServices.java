package service;

import model.Product;
import model.Sale;
import java.util.ArrayList;

public class SalesServices {
    private ArrayList<Sale> sales = new ArrayList<>();

    public void makeSale(Product product, int quantity) {
        if (product.getQuantity() < quantity) {
            System.out.println("Not enough stock!");
            return;
        }

        product.reduceStock(quantity);

        Sale sale = new Sale(product, quantity);
        sales.add(sale);

        System.out.println("Sale completed!");
    }

    public void viewSales() {
        double total = 0;

        for (Sale s : sales) {
            s.display();
            total += s.getTotalPrice();
        }

        System.out.println("Total Revenue: P" + total);
    }
}
