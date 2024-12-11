package com.javiermengual.tema05.lib.ArryAlgoritms;

import java.util.Arrays;
import java.util.Random;

/**
 * LibArray
 * License: 🅮 Public Domain
 *
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2024-06-26
 * @since 0.1, 2024-06-26
 **/
public class LibArrays {
    /**
     * Crea un array con números enteros aleatorios entre min y max
     * @param longitud La cantidad de elementos a generar
     * @param min Valor aleatorio mínimo a generar
     * @param max Valor aleatorio máximo a generar
     * @return Array con los valores aleatorios generados
     */
    public static int[] crearArray(int longitud, int min, int max) {
        if (longitud <= 0) {
            return null;
        }
        int[] a = new int[longitud];
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio(min, max);
        }
        return a;
    }

    /**
     * Genera un número aleatorio entre min y max
     *
     * @param min Número mínimo a generar
     * @param max Número máximo a generar
     * @return Número aleatorio generado
     */
    public static int aleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    /**
     * Muestra el contenido de un array
     *
     * @param a Array a mostrar
     */
    public static void mostrarArray(int[] a) {
        System.out.println("array = " + Arrays.toString(a));
    }
}
