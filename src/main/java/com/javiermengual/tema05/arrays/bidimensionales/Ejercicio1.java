package com.javiermengual.tema05.arrays.bidimensionales;

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

    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo) {
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Ejercicio01.aleatorio(valorMinimo, valorMaximo);

            }
        }
        return matriz;
    }

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