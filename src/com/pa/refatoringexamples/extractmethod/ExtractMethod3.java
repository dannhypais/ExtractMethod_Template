package com.pa.refatoringexamples.extractmethod;

public class ExtractMethod3 {
    public String formatUserName(String firstName, String lastName) {
        return stringUpperCase(firstName) + " " + stringUpperCase(lastName);
    }

    public String formatProductName(String productName) {
        return stringUpperCase(productName);
    }
    private String stringUpperCase(String upperCase) {
        return upperCase.trim().toUpperCase();
    }
}
