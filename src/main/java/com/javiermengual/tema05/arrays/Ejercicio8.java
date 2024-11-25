package com.javiermengual.tema05.arrays;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        double[]array=new double[10];
        Ejercicio01.rellenarArray(array,1,10);

        if (comprobarNumero(array,5)){
            System.out.println("El numero esta en el array");
        }else System.out.println("No esta");



    }

    /**
     *
     * @param array recibe un array de doubles
     * @param num recibe un numero
     * @return devuelve si el numero esta o no en la array
     */
    public static boolean comprobarNumero(double[] array, double num) {

        for (double numero : array) {
            return numero == num;
        }


        return false;
    }
}
