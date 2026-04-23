package org.example.homework5.taskCalculator;

public class AdvancedCalculator {
    int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    int factorial(int n) {
        if (n < 0) return 0;

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
    boolean isEven(int n) {
        return n % 2 == 0;
    }
}
