package com.taller.practico;

import java.util.Scanner;

public class BankMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 500_000;
        int option;

        do {
            System.out.println();
            System.out.println("---- Banking Menu ----");
            System.out.println("1. Check balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.printf("Current balance: $%.2f%n", balance);
                case 2 -> {
                    System.out.print("Enter the deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit done. New balance: $%.2f%n", balance);
                    } else {
                        System.out.println("The amount must be greater than zero.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal <= 0) {
                        System.out.println("The amount must be greater than zero.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Withdrawal done. New balance: $%.2f%n", balance);
                    }
                }
                case 4 -> System.out.println("Leaving the system. Goodbye!");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
