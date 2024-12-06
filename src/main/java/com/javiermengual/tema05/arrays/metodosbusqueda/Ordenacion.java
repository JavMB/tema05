package com.javiermengual.tema05.arrays.metodosbusqueda;

import com.javiermengual.tema05.arrays.Ejercicio01;

import java.util.Arrays;

public class Ordenacion {
    public static void ordenaBurbuja(int[] array) {
        boolean hayCambios;

        for (int i = 0; i < array.length; i++) {
            hayCambios = false;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    intercambio(array, j, j + 1);
                    hayCambios = true;
                }
            }

            if (!hayCambios) { //optimizacion para salir antes
                return;
            }
        }
    }

    public static void intercambio(int[] array, int posicionOrigen, int posicionDestino) {
        int aux = array[posicionOrigen];
        array[posicionOrigen] = array[posicionDestino];
        array[posicionDestino] = aux;
    }

    public static void insercion(int[] array) { //diferente del profe
        int indice;
        for (int i = 1; i < array.length; i++) {
            indice = i;
            //al reves porque se comprueba de izq a dere
            while (array[indice] < array[indice - 1] && indice > 0) {
                intercambio(array, indice, indice - 1);
                indice--;
            }


        }
    }

    public static void seleccion(int[] array) { //diferente del profe


        for (int i = 0; i < array.length; i++) {

            int valorMinimo = array[i];

            int indiceMinimo = i;

            for (int j = indiceMinimo; j < array.length; j++) {

                if (valorMinimo > array[j]) {

                    valorMinimo = array[j];

                    indiceMinimo = j;

                }

            }
            intercambio(array, indiceMinimo, i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Ejercicio01.rellenarArray(array, 1, 100);
        insercion(array);
        System.out.println(Arrays.toString(array));

    }

    public static void ordenaContando(int[] array) {
        final int DISTANCIA_MAXIMA = 100_000_000;
        ArrayEstadisticas arrayEstadisticas = new ArrayEstadisticas(array);
        int min = arrayEstadisticas.getMin();
        int max = arrayEstadisticas.getMax();

        if (max - min > DISTANCIA_MAXIMA) {
            System.err.println("hay demasiada dispersion en los datos");
            return;
        }
        int[] arrayConteo = new int[max + 1];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            arrayConteo[array[i]]++;

        }

        for (int i = 0; i < arrayConteo.length; i++) {
            int cantidad = arrayConteo[i];
            for (int j = 0; j < cantidad; j++) {
                array[contador++] = i;

            }


        }
        System.out.println("Conteo :" + Arrays.toString(arrayConteo));

    }
}
