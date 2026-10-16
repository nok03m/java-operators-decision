package com.taller.practico;

import java.util.Scanner;

public class TicketCalculator {
    /*
     * Challenge 3
     * Write a program that determines the sale price of a ticket for
     * a technology event based on the type of ticket purchased.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double basePrice = 100.0;
        double totalAmount = 0;
        boolean isKnownTicketType = true;

        System.out.print("-- Available ticket types (VIP, STUDENT, SENIOR, GENERAL) --");
        System.out.print("\nEnter the ticket type: ");
        String entryType = scan.nextLine().trim().toUpperCase();

        /*
         * In this case, I'd prefer to use a switch statement, but the
         * guide literally mentions “if-else”
         */

        if (entryType.equals("VIP")) {
            totalAmount = basePrice + basePrice * 0.1;
        } else if (entryType.equals("STUDENT")) {
            totalAmount = basePrice - basePrice * 0.5;
        } else if (entryType.equals("SENIOR")) {
            totalAmount = basePrice - basePrice * 0.4;
        } else if (entryType.equals("GENERAL")) {
            totalAmount = basePrice;
        } else {
            isKnownTicketType = false;
        }

        if (isKnownTicketType) {
            System.out.printf("%nType of payment: %s%nBase price: %.2f%nTotal amount: %.2f",
                    entryType, basePrice, totalAmount);
        } else {
            System.err.println("Unknown ticket type. Valid options: VIP, STUDENT, SENIOR, GENERAL");
        }

        scan.close();
    }
}
