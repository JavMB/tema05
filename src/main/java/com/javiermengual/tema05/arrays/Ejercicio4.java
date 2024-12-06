package com.javiermengual.tema05.arrays;


import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        double[] array = new double[30];
        Ejercicio01.rellenarArray(array, 0, 10);
    }

    /**
     *
     * @param array recibe un array de doubles
     * @param numero recibe el numero del cual filtraremos
     * @return devuelve un array nueva filtrada
     */
    public static double[] filtrarArray(double[] array, double numero) {

        int contador = 0;
        for (double valor : array) {
            if (valor >= numero) {
                contador++;
            }
        }


        double[] arrayFiltrado = new double[contador];
        int indice = 0;
        for (double valor : array) {
            if (valor >= numero) {
                arrayFiltrado[indice++] = valor;
            }
        }

        return arrayFiltrado;
    }

    /**
     *
     * @param array recibe un array de doubles
     * @return devuelve la media de los nums del array
     */
    public static double calcularMediaArray(double[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }

        double suma = 0;

        for (double numero : array) {
            suma = suma + numero;
        }

        return suma / array.length;


    }


}
