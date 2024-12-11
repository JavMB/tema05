package com.javiermengual.tema05.bidimensionales;
import com.javiermengual.tema05.lib.Matriz;

public class Ejercicio4 {
    public static void main(String[] args) {
        var matrizEnteros = Matriz.crearMatrizAleatoria(4, 8, 1000, 10000);

        System.out.println(matrizToString(matrizEnteros, 5));
        System.out.println("s");
        int[][] matriz = {
                {1, 2, 3}, // Fila 0
                {4, 5, 6}, // Fila 1
                {7, 8, 9}  // Fila 2
        };

        System.out.println(matrizToString(matrizTranspuesta(matriz), 5));


    }

    /**
     * Devuelve el String de una matriz de enteros, podemos poner un padding
     *
     * @param matriz  recibe una matriz de enteros
     * @param padding recibe un entero que es cuanto padding entre columnas
     * @return devuelve una String ordenada for filas y columnas de la matriz de enteros
     */
    public static String matrizToString(int[][] matriz, int padding) {
        StringBuilder sb = new StringBuilder();


        int anchoColumna = determinarLongitudMaxima(matriz);


        String formatoPadding = "%-" + (anchoColumna + padding) + "s";


        for (int[] fila : matriz) {
            for (int valor : fila) {
                sb.append(String.format(formatoPadding, valor));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Devuelve un entero con la longitud maxima es decir del numero mas largo entero de la matriz
     *
     * @param matriz matriz de enteros
     * @return devuelve el valor de lenght entero del valor mas largo
     */
    private static int determinarLongitudMaxima(int[][] matriz) {
        int longitudMaxima = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                int longitud = String.valueOf(valor).length();
                if (longitud > longitudMaxima) {
                    longitudMaxima = longitud;
                }
            }
        }
        return longitudMaxima;
    }


    public static int[][] matrizTranspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < traspuesta.length; i++) {

            for (int j = 0; j < traspuesta[i].length; j++) {
                traspuesta[i][j] = matriz[j][i];

            }

        }

        return traspuesta;

    }

    public static int[] sumaFilaMatriz(int[][] matriz) {
        int sumafila = 0;
        var sumaPorFila = new int[matriz.length];
        int contador = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                sumafila = sumafila + valor;
            }
            sumaPorFila[contador++] = sumafila;
            sumafila = 0;

        }

        return sumaPorFila;
    }

    public static int valorMaximo(int[][] matriz) {
        int valorMaximo = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor > valorMaximo) {
                    valorMaximo = valor;
                }

            }
        }
        return valorMaximo;

    }

    public static int valorMinimo(int[][] matriz) {
        int valorMinimo = matriz[0][0];
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor < valorMinimo) {
                    valorMinimo = valor;
                }

            }
        }
        return valorMinimo;

    }

    public static double mediaMatriz(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
                contador++;
            }
        }

        return (double) suma / contador;

    }

    public static int obtenerDatoMatriz(int fila, int columna, int[][] matriz) {

        return matriz[fila][columna];

    }

    public static int[] obtenerFilaMatriz(int[][] matriz, int fila) {

        if (fila < 0 || fila >= matriz.length) {
            throw new IllegalArgumentException("El índice de la fila está fuera de los límites de la matriz.");
        }

        var filaArray = new int[matriz[0].length];

        for (int i = 0; i < matriz[fila].length; i++) {

            filaArray[i] = matriz[fila][i];

        }
        return filaArray;


    }

}
