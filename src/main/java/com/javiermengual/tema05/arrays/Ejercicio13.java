package com.javiermengual.tema05.arrays;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] array = new double[50];
        Ejercicio01.rellenarArray(array, 1, 50);

    }

    public static double[] arrayPar(double[] array) {
        int contadorpares = 0;
        for (double num : array) {
            if (num % 2 == 0) {
                contadorpares++;
            }

        }
        if (contadorpares==0){
            System.out.println("No hay ningun par");
            return array;
        }

        double[] arrayPar = new double[contadorpares];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPar[i] = array[i];

            }

        }
        return arrayPar;
    }
}

