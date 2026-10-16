package com.taller.practico;

public class FirstCommonMultiple {

    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0 && number % 11 == 0) {
                System.out.println("First number divisible by 7 and 11: " + number);
                break;
            }
        }
    }
}
