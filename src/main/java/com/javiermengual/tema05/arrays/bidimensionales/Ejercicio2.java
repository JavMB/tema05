package com.javiermengual.tema05.arrays.bidimensionales;

import com.javiermengual.tema05.arrays.Ejercicio01;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] arrayV = new double[50];
        double[] arrayP = new double[20];

        Ejercicio01.rellenarArray(arrayV, 1, 10);
        Ejercicio01.rellenarArray(arrayP, 1, 10);

        double[][] matriz = new double[50][20];

    }

    /**
     *
     * @param array1 recibe una array
     * @param array2 reccibe otro array
     * @param matriz crea una matriz multiplicando los valores de las dos arrays
     */
    public static void multiplicacionMatriz(double[] array1, double[] array2, double[][] matriz) {

        for (int i = 0; i <matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j]=array1[i]*array2[j];

            }

        }


    }
}
