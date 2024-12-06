package com.javiermengual.tema05.arrays;

import com.javiermengual.tema05.strings.Ejercicio1;

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int NUM_ELEMENTOS = 50;
        double[] array = new double[NUM_ELEMENTOS];
        Ejercicio01.rellenarArray(array,1,5);
        System.out.println(Ejercicio01.arrayToString(array, 2));
        double[]array2= generarArray(array);
        System.out.println(Ejercicio01.arrayToString(array2, 2));
    }

    public static double[] generarArray(double[] array) {
        double[] arrayP = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                arrayP[i] = arrayP[i] + array[j];
            }


        }
        return arrayP;
    }
}
