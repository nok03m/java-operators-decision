package com.taller.practico;

import java.util.Scanner;

public class RetailSimulator {
    /*
    * Integrated Challenge
    * The system must calculate the total cost of a purchase,
    * apply conditional discounts based on customer type,
    * process additional discount coupons, and calculate
    * applicable taxes (VAT).
    */

    public static void main(String[] args) {
        double pricePerLicense = 250.00;
        double iva = 0.16;
        double baseSubtotal;
        double discountedSubtotal;
        double totalAmount;
        String typeCustomer = "";
        String coupon = "";
        int quantity = 0;
        boolean isValidEntries = false;

        try (Scanner scan = new Scanner(System.in)){
            System.out.print("\nEnter the quantity of products: ");
            quantity = Integer.parseInt(scan.nextLine().trim());

            if(quantity < 1) {
                System.out.print("The quantity must be greater than 1");
                throw new NumberFormatException();
            }

            System.out.print("Enter the customer type (VIP, REGULAR, NEW): ");
            typeCustomer = scan.nextLine().trim().toUpperCase();

            System.out.print("Enter the coupon code (leave blank if you don't have one): ");
            coupon = scan.nextLine().trim();

            isValidEntries = true;
        } catch (NumberFormatException e) {
            System.err.println("The quantity entered is invalid.");
        }

        if (isValidEntries) {
            baseSubtotal = quantity * pricePerLicense;

            discountedSubtotal = baseSubtotal - (baseSubtotal * switch (typeCustomer) {
                case "VIP" -> 0.2;
                case "REGULAR" -> 0.1;
                case "NEW" -> 0.05;
                default -> 0;
            });

            if(coupon.equals("PROMO1 año") && discountedSubtotal >= 500){
                discountedSubtotal -= 50.00;
            }

            totalAmount = discountedSubtotal + (discountedSubtotal * iva);
            System.out.printf("%nTotal due: $ %.2f", totalAmount);
        } else {
            System.err.print("\nSome of the entries were invalid.\nPlease try again.");
        }
    }
}
