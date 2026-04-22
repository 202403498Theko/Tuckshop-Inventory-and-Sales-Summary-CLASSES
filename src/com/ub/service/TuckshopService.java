package service;

import model.Item;
import model.Sale;
import interfaces.Reportable;

import java.util.ArrayList;

public class TuckshopService implements Reportable {

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Sale> sales = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("No items available.");
            return;
        }
        for (Item item : items) {
            item.display();
        }
    }

    public Item findItem(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void sellItem(int id, int quantity) {
        Item item = findItem(id);
        if (item == null) {
            System.out.println("Item not found.");
            return;
        }

        if (quantity > item.getQuantity()) {
            System.out.println("Not enough stock!");
            return;
        }

        item.setQuantity(item.getQuantity() - quantity);
        sales.add(new Sale(item, quantity));

        System.out.println("Sale successful!");
    }

    public void restockItem(int id, int quantity) {
        Item item = findItem(id);
        if (item != null) {
            item.setQuantity(item.getQuantity() + quantity);
            System.out.println("Restocked successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    @Override
    public void generateReport() {
        double total = 0;

        System.out.println("==== SALES REPORT ====");
        for (Sale sale : sales) {
            System.out.println(sale.getItemName() + " sold: " + sale.getQuantitySold());
            total += sale.getTotalPrice();
        }

        System.out.println("Total Revenue: P" + total);
    }
}
