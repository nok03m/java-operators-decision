package com.taller.practico;

public class StringComparisonError {

    public static void main(String[] args) {
        String provider1 = new String("OneTrust");
        String provider2 = "OneTrust";

        // FIX: '==' compares memory references (two different objects here).
        // equals() compares the actual text content.
        if (provider1.equals(provider2)) {
            System.out.println("The providers match exactly.");
        } else {
            System.out.println("The providers are different.");
        }
    }
}
