package com.taller.practico;

public class MisplacedBreakError {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number detected: " + i);
                // FIX: 'break' ended the whole loop on the first odd number.
                // 'continue' skips only the current iteration.
                continue;
            }
            System.out.println("Even number processed: " + i);
        }
    }
}
