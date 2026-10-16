package com.taller.practico;

import java.util.Scanner;

public class GradingAttendanceSystem {
    /*
    * Challenge 2
    * Develop an academic performance evaluator to determine
    * whether a student passes a programming course, taking into
    * account both the score obtained and the student's mandatory
    * attendance rate.
    */
    public static void main(String[] args) {
        String evaluation = "";
        String errorMsg = "";

        System.out.print("Academic Performance Evaluator\n\n");

        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the final grade (0.0 - 100.0): ");
            double finalGrade = Double.parseDouble(scan.nextLine().trim());

            System.out.print("Enter the attendance percentage (%) (0 - 100): ");
            int attendancePer = Integer.parseInt(scan.nextLine().trim());

            System.out.print("Did I complete the final project? (Y/N): ");
            boolean isCompleteProj = scan.nextLine().trim().toLowerCase().charAt(0) == 'y';

            if(finalGrade >= 70 && attendancePer >= 80){
                evaluation = "Approved";
            } else if (isCompleteProj && finalGrade >= 60) {
                evaluation = "Awaiting make-up exam";
            } else {
                evaluation = "Failed";
            }
        } catch (NumberFormatException e) {
            errorMsg = "The value you entered is invalid";
        } catch (IndexOutOfBoundsException e){
            errorMsg = "There was a problem entering the value";
        }

        if(errorMsg.isEmpty()){
            System.out.println("\nEvaluation: " + evaluation);
        } else {
            System.err.println("\nError: " + errorMsg);
        }
    }
}
