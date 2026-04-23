package org.example.homework5.taskStoreAndDiscount;

public class DiscountService {
    double applyPercentageDiscount(double price, int percent) {
        return price - (price * percent / 100.0);
    }

    double applyFixedDiscount(double price, double discountAmount) {
        double result = price - discountAmount;
        return Math.max(result, 0); // не даємо піти в мінус
    }

    boolean isEligibleForDiscount(double price) {
        return price > 100;
    }
}
