package com.taller.practico;

import java.util.Scanner;

public class DayOfWeekManager {
    /*
    * Section 3: Practice case
    * Please implement an interactive program that processes
    * the number representing a day of the week
    * (1 for Monday, 7 for Sunday) and determines the type of
    * workday that corresponds to it.
    */

    public static void main(String[] args) {
        // Determine whether today is a workday or not
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                -- Days of the Week --
                1.Monday
                2.Tuesday
                3.Wednesday
                4.Thursday
                5.Friday
                6.Saturday
                7.Sunday""");
        System.out.print("\nEnter the day number (1-7): ");
        int optionDay = scan.nextInt();

        /*
        Traditional syntax

        switch (optionDay) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print("\nToday is a work day");
                break;
            case 6:
            case 7:
                System.out.print("\nToday is a day off");
                break;
            default:
                System.out.print("\nThe value you entered is invalid");
        }
        */

        // Modern syntax
        String message = switch (optionDay) {
            case 1, 2, 3, 4, 5 -> "Today is a work day";
            case 6, 7 -> "Today is a day off";
            default -> "The value you entered is invalid";
        };

        System.out.print("\n" + message);
    }
}
