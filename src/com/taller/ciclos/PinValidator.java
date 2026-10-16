package com.taller.practico;

import java.util.Scanner;

public class PinValidator {

    private static final int MIN_PIN = 1000;
    private static final int MAX_PIN = 9999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin;
        boolean isValid;

        do {
            System.out.print("Enter your 4-digit PIN: ");
            pin = scanner.nextInt();
            isValid = pin >= MIN_PIN && pin <= MAX_PIN;

            if (!isValid) {
                System.out.println("Error: La clave debe tener exactamente 4 dígitos positivos");
            }
        } while (!isValid);

        System.out.println("PIN accepted.");

        scanner.close();
    }
}
