package com.javiermengual.tema05.arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Ejercicio6.rellenarArray(array, 0, 101);

        imprimirMultiplosDe5(array);
        System.out.println();
        imprimirMultiplosDe10(array);
        System.out.println();
        imprimirCeros(array);

    }

    /**
     * Imprime los multiplos de 5 del array
     *
     * @param array recibe un array de enteros
     */
    public static void imprimirMultiplosDe5(int[] array) {
        String formato = "%-10d";
        for (int entero : array) {
            if (entero % 5 == 0) {

                System.out.printf(formato + " es multiplo de 5\n", entero);
            }
        }

    }

    /**
     * Imprime los multiplos de 10
     *
     * @param array recibe un array de enteros
     */
    public static void imprimirMultiplosDe10(int[] array) {
        String formato = "%-10s";
        for (int entero : array) {
            if (entero % 10 == 0) {

                System.out.printf(formato + " es multiplo de 10\n", entero);
            }
        }


    }

    /**
     * Imprime los ceros del array
     *
     * @param array recibe un array de enteros
     */
    public static void imprimirCeros(int[] array) {
        int contadordeCeros = 0;
        for (int entero : array) {
            if (entero == 0) {
                System.out.println(entero + " Contador de ceros: " + ++contadordeCeros);
            }
        }


    }
}
