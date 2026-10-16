package com.taller.practico;

import java.util.Scanner;

public class InventoryControl {

    private static final int MAX_CAPACITY = 500;

    private static int totalUnits = 0;
    private static int registeredProducts = 0;
    private static double inventoryValue = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println();
            System.out.println("---- Warehouse Control ----");
            System.out.println("1. Register product batch");
            System.out.println("2. View warehouse status");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> registerBatch(scanner);
                case 2 -> showStatus();
                case 3 -> System.out.println("Leaving the system. Goodbye!");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (option != 3);

        scanner.close();
    }

    private static void registerBatch(Scanner scanner) {
        System.out.print("Number of products in the batch: ");
        int batchSize = scanner.nextInt();

        for (int i = 1; i <= batchSize; i++) {
            System.out.print("Product " + i + " discontinued? (Y/N): ");
            String answer = scanner.next().trim().toLowerCase();

            if (answer.startsWith("y")) {
                System.out.println("Product " + i + " is discontinued. Skipped.");
                continue;
            }

            System.out.print("Product " + i + " price: ");
            double price = scanner.nextDouble();
            while (price <= 0) {
                System.out.print("The price must be greater than zero. Try again: ");
                price = scanner.nextDouble();
            }

            System.out.print("Product " + i + " stock quantity: ");
            int stock = scanner.nextInt();
            while (stock <= 0) {
                System.out.print("The stock must be greater than zero. Try again: ");
                stock = scanner.nextInt();
            }

            // The product is rejected if adding it would exceed the warehouse capacity
            if (totalUnits + stock > MAX_CAPACITY) {
                System.out.println("ALERT: warehouse capacity of " + MAX_CAPACITY
                        + " units exceeded. Aborting the rest of the batch.");
                break;
            }

            totalUnits += stock;
            inventoryValue += price * stock;
            registeredProducts++;
            System.out.println("Product " + i + " registered.");
        }
    }

    private static void showStatus() {
        System.out.println("---- Warehouse Status ----");
        System.out.println("Registered products: " + registeredProducts);
        System.out.println("Total units: " + totalUnits + " / " + MAX_CAPACITY);
        System.out.printf("Inventory value: $%.2f%n", inventoryValue);
    }
}
