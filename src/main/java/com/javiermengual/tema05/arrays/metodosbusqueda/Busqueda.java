package com.javiermengual.tema05.arrays.metodosbusqueda;

public class Busqueda {
    public static void main(String[] args) {

    }

    /**
     * @param array recibe un array no ordenada
     * @param c     recibe el numero a buscar
     * @return devuelve la posicion si la encuentra si no un -1
     */
    public static int busquedaLineal(int[] array, int c) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param array recibe un array ordenada
     * @param c     recibe el numero a buscar
     * @return devuelve la posicion si la encuentra y si no un -1
     */
    public static int busquedaLinealOrdenado(int[] array, int c) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
            if (array[i] > c) {
                return -1;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] array, int c) {
        int inicio = 0;
        int fin = array.length - 1;
        int medio;

        while (inicio <= fin) {
            medio = (fin + inicio) / 2;
            if (array[medio] == c) {
                return medio;
            } else if (array[medio] > c) {
                fin = medio - 1;

            } else {
                inicio = medio + 1;
            }


        }
        return -1;

    }

}


