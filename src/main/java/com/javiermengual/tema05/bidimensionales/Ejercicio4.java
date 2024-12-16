package com.javiermengual.tema05.bidimensionales;

public class Ejercicio4 {
    public static void main(String[] args) {


        int[][] matriz = {
                {1, 2, 3}, // Fila 0
                {4, 5, 6}, // Fila 1
                {7, 8, 9}  // Fila 2
        };


        System.out.println(matrizToString(matriz, 5));


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

    /**
     * Devuelve la matriz transpuesta (fila x columnas) de una matriz
     *
     * @param matriz
     * @return
     */
    public static int[][] matrizTranspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < traspuesta.length; i++) {

            for (int j = 0; j < traspuesta[i].length; j++) {
                traspuesta[i][j] = matriz[j][i];

            }

        }

        return traspuesta;

    }

    /**
     * Devuelve una array con la suma de cada fila de la matriz
     *
     * @param matriz
     * @return
     */
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

    /**
     * Devuelve el valor maximo de una matriz
     *
     * @param matriz
     * @return
     */
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

    /**
     * Devuelve el valor minimo de una matriz
     *
     * @param matriz
     * @return
     */
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

    /**
     * Devuelve la media de los valores de una matriz
     *
     * @param matriz
     * @return
     */
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

    /**
     * Devuelve el valor de una matriz de una determinada posición
     *
     * @param fila
     * @param columna
     * @param matriz
     * @return
     */
    public static int obtenerDatoMatriz(int fila, int columna, int[][] matriz) {

        return matriz[fila][columna];

    }

    /**
     * Nos devuelve la fila de una matriz que indiquemos
     *
     * @param matriz
     * @param fila
     * @return
     */
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

    /**
     * Devuelve un array con los valores de una columna de la matriz
     * @param matriz
     * @param columna
     * @return
     */
    public static int[] obtenerColumnaMatriz(int[][] matriz, int columna) {
        int[] arrayColumna = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            arrayColumna[i] = matriz[i][columna];

        }
        return arrayColumna;


    }


}
