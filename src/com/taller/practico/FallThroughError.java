package com.taller.practico;

public class FallThroughError {

    public static void main(String[] args) {
        int categoryOption = 1;

        // FIX: each case now ends with 'break', so execution no longer
        // falls through into the following cases.
        switch (categoryOption) {
            case 1:
                System.out.println("Selected category: Lunes (Jornada Laboral)");
                break;
            case 2:
                System.out.println("Selected category: Martes (Jornada Laboral)");
                break;
            case 3:
                System.out.println("Selected category: Miercoles (Jornada Laboral)");
                break;
            default:
                System.out.println("Unidentified day");
                break;
        }
    }
}
