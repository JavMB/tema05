package com.javiermengual.tema05.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio02
 * License: 🅮 Public Domain
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2024-11-19
 * @since 0.1, 2024-11-19
 **/
public class Ejercicio02 {
    public enum Paridad {
        PAR, IMPAR
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAMANYO_ARRAY = 10;
        char[] arrayChar = new char[TAMANYO_ARRAY];
        solicitarDatosArray(arrayChar);
        // Para poder realizar pruebas rápidamente podemos utilizar el método rellenarArray
        // rellenarArray(arrayChar, 'A', 'Z');
        // Mostramos todos los elementos del Array
        System.out.println(Arrays.toString(arrayChar));
        // Mostramos sólo las posiciones PARES
        System.out.println(arrayToString(arrayChar, Paridad.PAR));
        // Mostramos sólo las posiciones IMPARES
        System.out.println(arrayToString(arrayChar, Paridad.IMPAR));
        scanner.close();
    }

    public static void solicitarDatosArray(char[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d]?\n", i);
            array[i] = scanner.nextLine().charAt(0);
        }
    }

    // Versión con StringBuilder
    public static String arrayToString(char[] array, Paridad paridad) {
        StringBuilder sb = new StringBuilder();
        int inicio = paridad == Paridad.PAR ? 0 : 1;
        for (int i = inicio; i < array.length; i += 2) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    // Versión generando un nuevo Array
    /*
    public static String arrayToString(char[] array, Paridad paridad) {
        final int NUM_ELEMENTOS = paridad == Paridad.PAR ? array.length / 2 : array.length / 2 + 1;
        char[] resultado = new char[NUM_ELEMENTOS];
        int contador = 0;
        int inicio = paridad == Paridad.PAR ? 0 : 1;
        for (int i = inicio; i < array.length; i += 2) {
            resultado[contador++] = array[i];
        }
        return Arrays.toString(resultado);
    }
     */

    public static void rellenarArray(char[] array, char caracterMinimo, char caracterMaximo) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char)random.nextInt(caracterMinimo, caracterMaximo);
        }
    }

}
