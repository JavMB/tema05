package com.javiermengual.tema05.arrays;

import java.util.Scanner;

/**
 * Ejercicio03
 * License: 🅮 Public Domain
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2024-11-19
 * @since 0.1, 2024-11-19
 **/
public class Ejercicio03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 20;
        double[] array = new double[TAMANYO_ARRAY];
        // Aprovechamos el método para solicitar datos del Ejercicio01
        Ejercicio01.solicitarDatosArray(array);
        // Para poder realizar pruebas rápidamente podemos utilizar el método rellenarArray
        // Ejercicio01.rellenarArray(array, 10, 1000);

        System.out.println(arrayToString(array, 4, 4));
        scanner.close();
    }

    public static int determinarLongitudMaxima(double[] array, int decimales) {
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (double numero : array) {
            int longitudActual = String.format(formato, numero).length();
            if (longitudMaxima < longitudActual) {
                longitudMaxima = longitudActual;
            }
        }
        return longitudMaxima;
    }

    public static String arrayToString(double[] array, int decimales, int columnas) {
        return arrayToString(array, decimales, columnas, 2);
    }
        //cuadrado columnas
    public static String arrayToString(double[] array, int decimales, int columnas, int padding) {
        if (array == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();


        int tamanyoColumna = determinarLongitudMaxima(array, decimales) + padding;


        String formato = "%-" + tamanyoColumna + "." + decimales + "f";


        for (int i = 0; i < array.length; i++) {

            sb.append(String.format(formato, array[i]));


            if ((i + 1) % columnas == 0) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
