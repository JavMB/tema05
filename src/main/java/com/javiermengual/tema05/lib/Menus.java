package com.javiermengual.tema05.lib;

import java.util.Scanner;

public class Menus {

    /**
     * Muestra un menú con opciones y solicita al usuario que seleccione una.
     *
     * @param opciones Las opciones que se mostrarán en el menú.
     * @param scanner  Objeto Scanner para leer la entrada del usuario.
     * @return El índice de la opción seleccionada (basado en el índice del array, comienza en 0).
     */
    public static int mostrarMenu(String[] opciones, Scanner scanner) {
        int opcionSeleccionada = -1;

        // Ciclo hasta que el usuario ingrese una opción válida
        while (opcionSeleccionada < 0 || opcionSeleccionada >= opciones.length) {
            System.out.println("\n********** MENÚ **********");
            for (int i = 0; i < opciones.length; i++) {
                System.out.printf("%d. %s\n", i + 1, opciones[i]);
            }
            System.out.println("--------------------------");
            System.out.print("Seleccione una opción (1-" + opciones.length + "): ");

            // Validar la entrada del usuario
            String entrada = scanner.nextLine();
            if (esNumeroEntero(entrada)) {
                opcionSeleccionada = Integer.parseInt(entrada) - 1; // Ajustar a índice 0
                if (opcionSeleccionada < 0 || opcionSeleccionada >= opciones.length) {
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }
        return opcionSeleccionada;
    }

    /**
     * Verifica si una cadena representa un número entero válido.
     *
     * @param texto La cadena a verificar.
     * @return true si es un número entero válido, false en caso contrario.
     */
    private static boolean esNumeroEntero(String texto) {
        return texto.matches("\\d+");
    }


}
