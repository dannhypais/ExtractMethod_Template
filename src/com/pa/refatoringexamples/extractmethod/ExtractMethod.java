/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.refatoringexamples.extractmethod;

/**
 *
 * @author patricia.macedo
 */
public class ExtractMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String titulo1 = "Duplicate Code";
        String titulo2 = "Extract Method";
        printEmptyLine(4);
        printTitle(titulo1);
        printEmptyLine(2);
        printTitle(titulo2);
    }

    private static void printEmptyLine(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println();
        }
    }

    private static void printTitle(String title){
        for (int i = 0; i < title.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n" + title);
    }
}
