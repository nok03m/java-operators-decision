package com.taller.practico;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int n = scanner.nextInt();

        System.out.println("---- Multiplication table of " + n + " ----");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %2d = %d%n", n, i, n * i);
        }

        System.out.println("---- Countdown ----");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
