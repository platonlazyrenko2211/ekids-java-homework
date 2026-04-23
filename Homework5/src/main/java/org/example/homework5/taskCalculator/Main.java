package org.example.homework5.taskCalculator;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator sc = new SimpleCalculator();
        AdvancedCalculator ac = new AdvancedCalculator();

        System.out.println("Add: " + sc.add(5, 3));
        System.out.println("Subtract: " + sc.subtract(10, 4));
        System.out.println("Multiply: " + sc.multiply(6, 7));
        System.out.println("Divide: " + sc.divide(10, 2));
        System.out.println("Divide by zero: " + sc.divide(10, 0));

        System.out.println("-------------------");

        System.out.println("Power: " + ac.power(2, 5));
        System.out.println("Factorial: " + ac.factorial(5));
        System.out.println("IsEven 7: " + ac.isEven(7));
        System.out.println("IsEven 8: " + ac.isEven(8));
    }
}
