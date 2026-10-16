package com.taller.practico;

import java.util.Scanner;

public class TransactionProcessor {

    private static final double MAX_LIMIT = 1_000_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean processing = true;
        double balance = 0;
        String stopReason = "";

        while (processing) {
            System.out.print("Enter the transaction amount: ");
            double amount = scanner.nextDouble();

            if (amount < 0) {
                processing = false;
                stopReason = "Negative amount entered";
            } else {
                balance += amount;

                if (balance > MAX_LIMIT) {
                    processing = false;
                    stopReason = "Maximum limit of $1,000,000 exceeded";
                }
            }
        }

        System.out.println("---- Cash Report ----");
        System.out.printf("Final accumulated balance: $%.2f%n", balance);
        System.out.println("Stop reason: " + stopReason);

        scanner.close();
    }
}
