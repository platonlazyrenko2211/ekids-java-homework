package org.example.homework5.taskStoreAndDiscount;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> items = new ArrayList<>();

    void addProduct(Product p) {
        items.add(p);
    }

    double getTotalPrice() {
        double sum = 0;

        for (Product p : items) {
            sum += p.getPrice();
        }

        return sum;
    }

    void applyDiscountToTotal(DiscountService ds, int percent) {
        double total = getTotalPrice();

        double newTotal = ds.applyPercentageDiscount(total, percent);

        System.out.println("Сума до знижки: " + total);
        System.out.println("Сума після знижки: " + newTotal);
    }
}
