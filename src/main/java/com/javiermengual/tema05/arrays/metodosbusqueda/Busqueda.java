package com.javiermengual.tema05.arrays.metodosbusqueda;

public class Busqueda {
    public static void main(String[] args) {

    }

    /**
     *
     * @param array recibe un array no ordenada
     * @param c recibe el numero a buscar
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
     *
     * @param array recibe un array ordenada
     * @param c recibe el numero a buscar
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

    public static int busquedaBinariaRecursiva(int[] array, int c, int inicio, int fin) {

        int mitad = (inicio + fin) / 2;


        if (array[mitad] == c) {
            return mitad;

        } else if (array[mitad] < c) {

            return busquedaBinariaRecursiva(array, c, mitad + 1, fin);
        } else {

            return busquedaBinariaRecursiva(array, c, inicio, mitad - 1);
        }


    }

}


