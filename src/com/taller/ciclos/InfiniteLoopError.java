package com.taller.practico;

public class InfiniteLoopError {

    public static void main(String[] args) {
        int counter = 1;
        int limit = 10;

        System.out.println("Starting processing...");
        while (counter <= limit) {
            System.out.println("Processing element number: " + counter);
            // FIX: the control variable was never updated, so the condition
            // stayed true forever.
            counter++;
        }
        System.out.println("Processing finished successfully.");
    }
}
