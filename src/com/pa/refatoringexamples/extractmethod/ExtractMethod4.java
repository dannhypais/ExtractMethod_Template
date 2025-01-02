package com.pa.refatoringexamples.extractmethod;

public class ExtractMethod4 {
    public double calculateIncomeTax(double salary) {
        return calculateTax(salary, 50000, 0.3, 0.2);
    }

    public double calculateCorporateTax(double revenue) {
        return calculateTax(revenue, 100000, 0.25, 0.15);
    }

    private double calculateTax (double amount, int value, double highRate, double lowRate) {
        return (amount > value) ? amount * highRate : amount * lowRate;
    }
}
