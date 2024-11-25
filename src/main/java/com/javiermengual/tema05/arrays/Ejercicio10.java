package com.javiermengual.tema05.arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        double[] arrayP = new double[10];
        Ejercicio01.solicitarDatosArray(arrayP);
        Ejercicio01.arrayToString(arrayP, 2);
        double[] arrayS =arrayFiltrar(arrayP,10);

    }

    /**
     *
     * @param array recibe un array de doubles
     * @param num recibe un numero del cual filtraremos hacia abajo
     * @return devuelve un nuevo array con solo numeros mayores o iguales que num, en caso contrario
     * asignaremos -1
     */
    public static double[] arrayFiltrar(double[] array, double num) {

        double[] arrayReturn = new double[array.length];


        for (int i = 0; i < array.length; i++) {
            if (array[i] >= num) {
                // Asignar el valor si es mayor o igual a num
                arrayReturn[i] = array[i];
            } else {
                // Asignar -1 si es menor
                arrayReturn[i] = -1;
            }
        }


        return arrayReturn;
    }


}
