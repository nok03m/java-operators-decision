package com.taller.practico;

public class TernaryRefactor {

    public static void main(String[] args) {
        boolean activeSessionCookie = true;

        // Original if-else version:
        // String connectionStatus;
        // if (activeSessionCookie == true) {
        //     connectionStatus = "ACTIVA";
        // } else {
        //     connectionStatus = "INACTIVA";
        // }

        // Ternary version (single line):
        String connectionStatus = activeSessionCookie ? "ACTIVA" : "INACTIVA";

        System.out.println("Connection status: " + connectionStatus);
    }
}
