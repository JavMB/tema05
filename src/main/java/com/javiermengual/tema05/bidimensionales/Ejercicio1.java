package com.javiermengual.tema05.bidimensionales;

import com.javiermengual.tema05.arrays.Ejercicio01;
import com.javiermengual.tema05.arrays.Ejercicio03;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArrays, tamanyoArrays;
        System.out.println("Dime cuantas arrays ?");
        numArrays = Integer.parseInt(sc.nextLine());
        System.out.println("Dime de que tamaño");
        tamanyoArrays = Integer.parseInt(sc.nextLine());

        double[][] matriz = new double[numArrays][tamanyoArrays];

        crearMatrizAleatoria(3, 3, 1000, 5000);

        System.out.println(matrizToString(matriz, 4, 3));


    }

    /**
     * Permite rellenar una matriz pidiendo al usuario los valores
     * @param array
     * @param sc
     * @return devuelve la matriz rellena
     */
    public static double[][] rellenarMatriz(double[][] array, Scanner sc) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Dime el num para la posición/índice [" + i + "][" + j + "] en el array nº[" + i + "]");


                double num = sc.nextDouble();

                array[i][j] = num;
            }
        }
        return array;
    }

    /**
     *  Crea una matriz aleatoria
     * @param filas el numero de filas (arrays)
     * @param columnas el numero de columnas (longitud de arrays)
     * @param valorMinimo el valor minimo que puede contener
     * @param valorMaximo el valorm maximo que puede contener
     * @return
     */
    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo) {
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Ejercicio01.aleatorio(valorMinimo, valorMaximo);

            }
        }
        return matriz;
    }

    /**
     * Determina la longitud maxima de un matriz
     * @param matriz
     * @param decimales
     * @return
     */
    public static int determinarLongitudMaxima(double[][] matriz, int decimales) {
        int longitudMaxima = 0;

        for (double[] fila : matriz) {
            int longitud = Ejercicio03.determinarLongitudMaxima(fila, decimales);
            if (longitud > longitudMaxima) {
                longitudMaxima = longitud;
            }
        }

        return longitudMaxima;

    }

    /**
     * Muestra la matriz como String
     * @param matriz
     * @param decimales
     * @param padding
     * @return
     */
    public static String matrizToString(double[][] matriz, int decimales, int padding) {

        StringBuilder sb = new StringBuilder();
        int anchoColumna = determinarLongitudMaxima(matriz, decimales);
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        String formatoPadding = "%" + (anchoColumna + padding) + "s";


        for (double[] fila : matriz) {

            for (double valor : fila) {

                String decimalFormateado = String.format(formatoDecimales, valor);
                sb.append(String.format(formatoPadding, decimalFormateado));
            }
            sb.append("/n");

        }

        return sb.toString();
    }


}
