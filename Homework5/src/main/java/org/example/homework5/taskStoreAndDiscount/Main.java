package org.example.homework5.taskStoreAndDiscount;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        DiscountService discountService = new DiscountService();

        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Mouse", 25);
        Product p3 = new Product("Keyboard", 80);
        Product p4 = new Product("Headphones", 150);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        System.out.println("Загальна сума: " + cart.getTotalPrice());

        cart.applyDiscountToTotal(discountService, 10);
    }
}
