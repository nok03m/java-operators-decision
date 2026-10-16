package com.taller.practico;

public class AssignmentError {

    public static void main(String[] args) {
        boolean activeCookie = false;

        // FIX: the original used '=' (assignment), which sets activeCookie to true
        // and always enters the first branch. '==' compares instead of assigning.
        if (activeCookie == true) {
            System.out.println("Session status: User session active.");
        } else {
            System.out.println("Session status: Session inactive.");
        }

        // Idiomatic alternative: if (activeCookie) { ... }
    }
}
