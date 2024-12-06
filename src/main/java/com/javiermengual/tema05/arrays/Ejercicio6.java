package com.javiermengual.tema05.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] arraySuma = new int[10];
        int[] arrayDivi = new int[10];

        rellenarArray(array1, 1, 10);
        rellenarArray(array2, 1, 10);

        arraySuma=sumarArrays(array1,array2);
        arrayDivi=dividirArrays(array1,array2);

        System.out.println(Arrays.toString(arraySuma));
        System.out.println(Arrays.toString(arrayDivi));



    }

    /**
     *
     * @param array recibe un array
     * @param valorMinimo valor minimo para rellenar
     * @param valorMaximo valor maximo para rellenar
     */
    public static void rellenarArray(int[] array, int valorMinimo, int valorMaximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorioEntero(valorMinimo, valorMaximo);
        }
    }

    /**
     *
     * @param valorMinimo minimo numero aleatorio
     * @param valorMaximo maximo numero aleatorio
     * @return devuelve un numero entero aleatorio
     */
    public static int aleatorioEntero(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextInt(valorMaximo - valorMinimo + 1);
    }

    /**
     *
     * @param array1 primera array para sumar
     * @param array2  segunda array para sumar
     * @return  array con la suma de las dos arrays
     */
    public static int[] sumarArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return null;
        }
        if (array1.length != array2.length) {
            return null;
        }

        int[] arraysuma = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {

            arraysuma[i] = array1[i] + array2[i];


        }

        return arraysuma;


    }
    /**
     *
     * @param array1 primera array para dividir
     * @param array2  segunda array para dividir
     * @return  array con la division de las dos arrays
     */
    public static int[] dividirArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return null;
        }
        if (array1.length != array2.length) {
            return null;
        }

        int[] arrayDividido = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                return null; // no se puede dividir cero
            }
            arrayDividido[i] = array1[i] / array2[i];
        }

        return arrayDividido;

    }
}
