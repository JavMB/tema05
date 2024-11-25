package com.javiermengual.tema05.arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        double[] array = new double[10];

    }

    public static double[] generarArrayInverso(double[] array) {
        double[] arrayInverso = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInverso[i] = array[array.length - 1 - i];
        }
        return arrayInverso;
    }


}
