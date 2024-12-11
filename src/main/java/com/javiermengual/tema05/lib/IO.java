package com.javiermengual.tema05.lib;

import java.util.Scanner;

public class IO {

    /**
     * Solicita un texto al usuario con validaciones de longitud.
     *
     * @param mensaje Mensaje para guiar al usuario.
     * @param longitudMinima Longitud mínima permitida.
     * @param longitudMaxima Longitud máxima permitida.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @return Una cadena válida ingresada por el usuario.
     */
    public static String solicitarTexto(String mensaje, int longitudMinima, int longitudMaxima, Scanner scanner) {
        String entradaUsuario;
        do {
            System.out.println(mensaje);
            entradaUsuario = scanner.nextLine();

            if (entradaUsuario.isEmpty()) {
                System.err.println("El texto no puede estar vacío.\n");
            } else if (entradaUsuario.length() < longitudMinima || entradaUsuario.length() > longitudMaxima) {
                System.err.printf("El texto debe tener entre %d y %d caracteres.\n\n", longitudMinima, longitudMaxima);
            }
        } while (entradaUsuario.isEmpty() || entradaUsuario.length() < longitudMinima || entradaUsuario.length() > longitudMaxima);

        return entradaUsuario;
    }

    /**
     * Solicita un número entero dentro de un rango.
     *
     * @param mensaje Mensaje para guiar al usuario.
     * @param valorMinimo Valor mínimo permitido.
     * @param valorMaximo Valor máximo permitido.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @return Un número entero válido ingresado por el usuario.
     */
    public static int solicitarNumeroEntero(String mensaje, int valorMinimo, int valorMaximo, Scanner scanner) {
        String entradaUsuario;
        int numero;
        do {
            System.out.println(mensaje);
            entradaUsuario = scanner.nextLine();

            if (!esNumeroEntero(entradaUsuario)) {
                System.err.println("Debe ingresar un número entero válido.\n");
                numero = valorMinimo - 1; // Valor inválido para repetir el bucle
            } else {
                numero = Integer.parseInt(entradaUsuario);
                if (numero < valorMinimo || numero > valorMaximo) {
                    System.err.printf("El número debe estar entre %d y %d.\n\n", valorMinimo, valorMaximo);
                }
            }
        } while (numero < valorMinimo || numero > valorMaximo);

        return numero;
    }

    /**
     * Solicita un número flotante dentro de un rango.
     *
     * @param mensaje Mensaje para guiar al usuario.
     * @param valorMinimo Valor mínimo permitido.
     * @param valorMaximo Valor máximo permitido.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @return Un número flotante válido ingresado por el usuario.
     */
    public static float solicitarNumeroFlotante(String mensaje, float valorMinimo, float valorMaximo, Scanner scanner) {
        String entradaUsuario;
        float numero;
        do {
            System.out.println(mensaje);
            entradaUsuario = scanner.nextLine();

            if (!esNumeroFlotante(entradaUsuario)) {
                System.err.println("Debe ingresar un número válido.\n");
                numero = valorMinimo - 1; // Valor inválido para repetir el bucle
            } else {
                numero = Float.parseFloat(entradaUsuario);
                if (numero < valorMinimo || numero > valorMaximo) {
                    System.err.printf("El número debe estar entre %.2f y %.2f.\n\n", valorMinimo, valorMaximo);
                }
            }
        } while (numero < valorMinimo || numero > valorMaximo);

        return numero;
    }

    /**
     * Verifica si una cadena representa un número entero válido.
     *
     * @param texto La cadena a verificar.
     * @return true si es un número entero válido, false en caso contrario.
     */
    private static boolean esNumeroEntero(String texto) {
        return texto.matches("-?\\d+");
    }

    /**
     * Verifica si una cadena representa un número flotante válido.
     *
     * @param texto La cadena a verificar.
     * @return true si es un número flotante válido, false en caso contrario.
     */
    private static boolean esNumeroFlotante(String texto) {
        return texto.matches("-?\\d+(\\.\\d+)?");
    }
}
