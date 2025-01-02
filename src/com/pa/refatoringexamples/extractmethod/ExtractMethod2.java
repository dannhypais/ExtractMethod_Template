package com.pa.refatoringexamples.extractmethod;

public class ExtractMethod2 {
        public double calculateDiscountedPrice(double price, int quantity) {
            return price - calculateDiscount(price, quantity, 10, 0.1);
        }

        public double calculateBulkDiscount(double price, int quantity) {
            return price - calculateDiscount(price, quantity, 50, 0.2);
        }

        private double calculateDiscount(double price, int quantity, int value, double rate) {
            return (quantity > value) ? price * rate : 0.0;
        }
}
