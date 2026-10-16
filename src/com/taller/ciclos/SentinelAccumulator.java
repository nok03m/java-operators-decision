package com.taller.practico;

import java.util.Scanner;

public class SentinelAccumulator {

    private static final int SENTINEL = -99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long total = 0;
        int count = 0;

        System.out.print("Enter an integer (" + SENTINEL + " to finish): ");
        int number = scanner.nextInt();

        while (number != SENTINEL) {
            total += number;
            count++;

            System.out.print("Enter an integer (" + SENTINEL + " to finish): ");
            number = scanner.nextInt();
        }

        System.out.println("Total sum: " + total);
        System.out.println("Numbers processed: " + count);

        scanner.close();
    }
}
