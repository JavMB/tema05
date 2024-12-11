package com.javiermengual.tema05.lib;
import java.util.Scanner;

public class Matriz {

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
                matriz[i][j] = Randim.aleatorioDouble(valorMinimo, valorMaximo);

            }
        }
        return matriz;
    }
    public static int[][] crearMatrizAleatoria(int filas, int columnas, int valorMinimo, int valorMaximo) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Randim.aleatorioEntero(valorMinimo,valorMaximo);

            }
        }
        return matriz;
    }

    public static int determinarLongitudMaxima(double[][] matriz, int decimales) {
        int longitudMaxima = 0;

        for (double[] fila : matriz) {
            int longitud = Arrys.determinarLongitudMaxima(fila, decimales);
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
