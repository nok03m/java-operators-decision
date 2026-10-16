package com.taller.practico;

public class EvenNumberFilter {

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 50 that are not multiples of 5:");

        for (int number = 1; number <= 50; number++) {
            if (number % 2 != 0) {
                continue;
            }
            if (number % 5 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}
