package com.educacion.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Banco de palabras secretas y pistas pedagógicas
    private static final String[] PALABRAS = {
        "JAVA", "PROGRAMACION", "VARIABLE", "COMPILADOR", "DESARROLLO", "SENTENCIA"
    };
    private static final String[] PISTAS = {
        "Lenguaje orientado a objetos, tipado estático y multiplataforma.",
        "Proceso de escribir, probar y mantener el código fuente de un programa.",
        "Espacio de memoria con nombre asignado que almacena un valor mutable.",
        "Herramienta que traduce el código fuente a bytecode de Java.",
        "Fase integral de creación, arquitectura y construcción de software.",
        "Instrucción elemental que compone el flujo de ejecución de un algoritmo."
    };

    // Variables globales para la persistencia de estadísticas en la sesión (Fase 1 y Fase 4)
    private static int totalPartidas = 0;
    private static int partidasGanadas = 0;
    private static int partidasPerdidas = 0;
    private static double mejorPuntaje = 0.0;
    private static String ultimoJugador = "N/A";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;

        System.out.println("==================================================");
        System.out.println("  BIENVENIDO AL TALLER INTEGRADOR: EL AHORCADO    ");
        System.out.println("==================================================");

        // Fase 1: Arquitectura del Menú Principal envuelto en do-while
        do {
            mostrarMenu();
            opcionMenu = leerOpcionMenu(scanner, 1, 3);

            // Estructura seleccionadora switch
            switch (opcionMenu) {
                case 1:
                    jugarPartida(scanner);
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("\n¡Gracias por jugar! Éxitos en tu camino como Java Developer.");
                    break;
                default:
                    System.out.println("⚠️ Opción no contemplada.");
                    break;
            }
        } while (opcionMenu != 3);

        scanner.close();
    }

    /**
     * Muestra visualmente las opciones del menú interactivo.
     */
    private static void mostrarMenu() {
        System.out.println("\n----------------- MENÚ PRINCIPAL -----------------");
        System.out.println("1. Jugar");
        System.out.println("2. Ver Estadísticas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción (1-3): ");
    }

    /**
     * Fase 1: Control y Validación de Entradas de Menú.
     * Lee líneas completas con nextLine() y realiza el parseo mediante Integer.parseInt()
     * dentro de un bucle while para evitar bloqueos del búfer y caídas por formato.
     */
    private static int leerOpcionMenu(Scanner scanner, int min, int max) {
        int opcion = -1;
        boolean valida = false;

        while (!valida) {
            String entrada = scanner.nextLine().trim();
            try {
                opcion = Integer.parseInt(entrada);
                if (opcion >= min && opcion <= max) {
                    valida = true;
                } else {
                    System.out.printf("[AVISO] Opción fuera de rango (%d-%d). Intente nuevamente: ", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.printf("[AVISO] Entrada inválida. Ingrese un número entre %d y %d: ", min, max);
            }
        }
        return opcion;
    }

    /**
     * Fases 2, 3, 4 y 5: Flujo completo de la partida del Ahorcado.
     */
    private static void jugarPartida(Scanner scanner) {
        System.out.println("\n========================================");
        System.out.println("          INICIANDO NUEVA PARTIDA       ");
        System.out.println("========================================");

        // Fase 2: Registro de Jugador y normalización estricta de cadenas
        String nombreJugador = "";
        while (nombreJugador.length() == 0) {
            System.out.print("Ingrese el nombre del jugador: ");
            String entrada = scanner.nextLine();
            // Limpieza con trim() y estandarización a mayúsculas con toUpperCase()
            nombreJugador = entrada.trim().toUpperCase();
            if (nombreJugador.length() == 0) {
                System.out.println("[AVISO] El nombre no puede estar vacío ni contener solo espacios.");
            }
        }
        ultimoJugador = nombreJugador;

        // Selección de palabra secreta y pista correspondiente
        Random random = new Random();
        int indicePalabra = random.nextInt(PALABRAS.length);
        String palabraSecreta = PALABRAS[indicePalabra];
        String pistaContextual = PISTAS[indicePalabra];

        // Fase 2 y Fase 5 (Reto 2): Variables de estado requeridas y dificultad dinámica
        final int MAX_INTENTOS = palabraSecreta.length() > 6 ? 7 : 6;
        int intentosRestantes = MAX_INTENTOS;
        double puntaje = 100.0;
        boolean juegoGanado = false;
        char ultimaLetra = ' ';

        // Métricas para cálculo de desempeño
        int aciertos = 0;
        int fallos = 0;
        boolean pistaOtorgada = false;

        // Fase 3: Uso obligatorio de StringBuilder para máscara e historial de turnos
        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            mascara.append("_ ");
        }

        StringBuilder historialLetras = new StringBuilder();

        System.out.println("\n¡Bienvenido al juego, " + nombreJugador + "!");
        System.out.printf("Palabra asignada: %d letras. Intentos disponibles: %d\n", palabraSecreta.length(), MAX_INTENTOS);

        // Fase 3: Bucle del Juego (mientras intentosRestantes > 0 y no haya ganado)
        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println("\n----------------------------------------");
            System.out.println("Palabra: " + mascara.toString().trim());
            System.out.println("Historial de letras: [" + (historialLetras.length() > 0 ? historialLetras.toString() : "Ninguna") + "]");
            System.out.printf("Intentos Restantes: %d/%d\n", intentosRestantes, MAX_INTENTOS);

            // Fase 5 (Reto 1): Pista inteligente contextual y substring() cuando queda 1 intento
            if (intentosRestantes == 1 && !pistaOtorgada) {
                System.out.println("\n[PISTA DE APOYO]: " + pistaContextual);
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (mascara.charAt(i * 2) == '_') {
                        String letraPista = palabraSecreta.substring(i, i + 1);
                        System.out.println("[PISTA SUBSTRING]: La palabra incluye la letra '" + letraPista + "'.");
                        break;
                    }
                }
                pistaOtorgada = true;
            }

            System.out.print("Arriesga una letra: ");
            String entradaLetra = scanner.nextLine().trim();

            // Validación de entrada vacía
            if (entradaLetra.length() == 0) {
                System.out.println("[AVISO] Entrada vacía. Por favor introduce una letra.");
                continue;
            }

            // Extracción segura del carácter y normalización
            ultimaLetra = entradaLetra.toUpperCase().charAt(0);

            // Validación alfabética
            if (!Character.isLetter(ultimaLetra)) {
                System.out.println("[AVISO] Por favor ingresa únicamente caracteres alfabéticos (A-Z).");
                continue;
            }

            String letraStr = String.valueOf(ultimaLetra);

            // Control de flujo: validación de letra repetida en el historial
            if (historialLetras.indexOf(letraStr) != -1) {
                System.out.printf("[AVISO] Ya habías arriesgado la letra '%c'. No se descuentan intentos.\n", ultimaLetra);
                continue;
            }

            // Agregar letra al historial dinámico
            if (historialLetras.length() > 0) {
                historialLetras.append(", ");
            }
            historialLetras.append(ultimaLetra);

            // Evaluación de coincidencia con equalsIgnoreCase() y actualización de StringBuilder
            boolean aciertoEnTurno = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                String caracterPalabra = String.valueOf(palabraSecreta.charAt(i));
                if (caracterPalabra.equalsIgnoreCase(letraStr)) {
                    mascara.setCharAt(i * 2, palabraSecreta.charAt(i));
                    aciertoEnTurno = true;
                }
            }

            // Retroalimentación dinámica mediante operador ternario (Fase 3)
            String feedback = aciertoEnTurno
                    ? String.format("¡Acierto! La letra '%c' forma parte de la palabra.", ultimaLetra)
                    : String.format("Fallo. La letra '%c' no se encuentra en la palabra.", ultimaLetra);
            System.out.println(feedback);

            if (aciertoEnTurno) {
                aciertos++;
            } else {
                fallos++;
                intentosRestantes--;
            }

            // Control de condición de victoria
            if (mascara.indexOf("_") == -1) {
                juegoGanado = true;
                break;
            }
        }

        // Fase 4 y Fase 5 (Reto 3): Cálculo preciso con casting a double y bonificaciones
        int totalIntentos = aciertos + fallos;
        double porcentajeAciertos = totalIntentos > 0
                ? ((double) aciertos / totalIntentos) * 100.0
                : 0.0;

        if (juegoGanado) {
            // Bonificación por aciertos, intentos no consumidos y multiplicador de precisión
            puntaje = 100.0 + (intentosRestantes * 10.0) + (porcentajeAciertos * 0.5);
        } else {
            // Puntaje residual en caso de derrota
            puntaje = Math.max(0.0, (aciertos * 12.0) - (fallos * 5.0));
        }

        // Actualización de estadísticas acumuladas
        totalPartidas++;
        if (juegoGanado) {
            partidasGanadas++;
        } else {
            partidasPerdidas++;
        }
        if (puntaje > mejorPuntaje) {
            mejorPuntaje = puntaje;
        }

        // Fase 4: Despliegue del resumen formateado con System.out.printf()
        String estadoFinal = juegoGanado ? "¡VICTORIA!" : "DERROTA";
        mostrarResumenFinal(nombreJugador, estadoFinal, palabraSecreta, intentosRestantes, MAX_INTENTOS, porcentajeAciertos, puntaje);
    }

    /**
     * Fase 4: Reporte final formateado estrictamente con System.out.printf()
     * según los especificadores requeridos (%s, %d, %.2f) y alineación con anchos fijos.
     */
    private static void mostrarResumenFinal(
            String nombreJugador,
            String estadoFinal,
            String palabraSecreta,
            int intentosRestantes,
            int maxIntentos,
            double porcentajeAciertos,
            double puntajeFinal) {

        System.out.println("\n========================================");
        System.out.println("         RESUMEN DE LA PARTIDA          ");
        System.out.println("========================================");
        System.out.printf(java.util.Locale.US, "%-20s %s\n", "Jugador:", nombreJugador);
        System.out.printf(java.util.Locale.US, "%-20s %s\n", "Estado Final:", estadoFinal);
        System.out.printf(java.util.Locale.US, "%-20s %s\n", "Palabra Secreta:", palabraSecreta);
        System.out.printf(java.util.Locale.US, "%-20s %d/%d\n", "Intentos Restantes:", intentosRestantes, maxIntentos);
        System.out.printf(java.util.Locale.US, "%-20s %.2f%%\n", "Porcentaje Aciertos:", porcentajeAciertos);
        System.out.printf(java.util.Locale.US, "%-20s %.2f pts\n", "Puntaje Final:", puntajeFinal);
        System.out.println("========================================");
    }

    /**
     * Muestra las estadísticas acumuladas de la sesión de juego.
     */
    private static void mostrarEstadisticas() {
        System.out.println("\n========================================");
        System.out.println("         ESTADÍSTICAS GLOBALES          ");
        System.out.println("========================================");
        System.out.printf("%-22s %d\n", "Partidas Jugadas:", totalPartidas);
        System.out.printf("%-22s %d\n", "Partidas Ganadas:", partidasGanadas);
        System.out.printf("%-22s %d\n", "Partidas Perdidas:", partidasPerdidas);
        System.out.printf(java.util.Locale.US, "%-22s %.2f pts\n", "Mejor Puntaje:", mejorPuntaje);
        System.out.printf("%-22s %s\n", "Último Jugador:", ultimoJugador);
        System.out.println("========================================");
    }
}
