package com.javiermengual.tema05.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio01
 * License: 🅮 Public Domain
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2024-11-19
 * @since 0.1, 2024-11-19
 **/
public class Ejercicio01 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        double[] array = new double[TAMANYO_ARRAY];
        solicitarDatosArray(array);
        // Para poder realizar pruebas rápidamente podemos utilizar el método rellenarArray
        // rellenarArray(array, 1, 10);
        System.out.println(arrayToString(array, 4));
        scanner.close();
    }

    public static double aleatorio(double valorMinimo, double valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }

    public static void solicitarDatosArray(double[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d]?\n", i);
            array[i] = Double.parseDouble(scanner.nextLine());
        }
    }

    public static String arrayToString(double[] array, int decimales) {
        if (array == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%." + decimales + "f";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) { // último elemento
                coma = "";
            }
            sb.append(espacio).append(String.format(formato, array[i])).append(coma);
            if (i == 0) {
                espacio = " ";
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void rellenarArray(double[] array, double valorMinimo, double valorMaximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio(valorMinimo, valorMaximo);
        }
    }
}
