package com.taller.practico;

public class OffByOneError {

    public static void main(String[] args) {
        int totalElements = 5;
        System.out.println("Printing elements from 1 to " + totalElements + ":");

        // FIX: '<' skipped the last element; '<=' makes the range inclusive.
        for (int i = 1; i <= totalElements; i++) {
            System.out.println("Element " + i);
        }
    }
}
