package com.taller.practico;

public class PrecisionError {

    public static void main(String[] args) {
        int completedTasks = 3;
        int totalTasks = 4;

        // FIX: 3 / 4 is integer division and truncates to 0 before multiplying by 100.
        // Casting one operand to double forces floating-point division (0.75 * 100 = 75.0).
        double progressPercentage = ((double) completedTasks / totalTasks) * 100;

        System.out.println("Progress percentage: " + progressPercentage + "%");
    }
}
