package com.taller.practico;

import java.util.Scanner;

public class FactorialAndPattern {

    // 20! is the largest factorial that fits in a long
    private static final int MAX_FACTORIAL_INPUT = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("N must be a positive integer.");
            scanner.close();
            return;
        }

        // Part A: factorial
        if (n <= MAX_FACTORIAL_INPUT) {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        } else {
            System.out.println("N is too large: " + n + "! overflows a long (max N = "
                    + MAX_FACTORIAL_INPUT + ").");
        }

        // Part B: triangular pattern with nested loops
        System.out.println("---- Triangle pattern ----");
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
