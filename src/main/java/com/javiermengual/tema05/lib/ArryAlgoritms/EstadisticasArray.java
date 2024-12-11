package com.javiermengual.tema05.lib.ArryAlgoritms;

/**
 * <p>Tema 5 Strings y Arrays</p>
 * <p>Búsqueda y Ordenación en Arrays</p>
 * <p>
 * Esta clase permite obtener las siguientes estadísticas de un Array de enteros:
 * <ul>
 * <li>Valor mínimo</li>
 * <li>Valor máximo</li>
 * <li>Suma de todos los valores</li>
 * <li>Media de todos los valores</li>
 * <li>Cantidad de números positivos</li>
 * <li>Cantidad de números negativos</li>
 * </ul>
 * <p>License: 🅮 Public Domain</p>
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.3, 2023-11-21
 * @since 0.1
 **/
public class EstadisticasArray {
    private final int[] array;
    private int min;
    private int max;
    private int suma;
    private final double media;
    private int cantidadNumerosNegativos;
    private int cantidadNumerosPositivos;

    public EstadisticasArray(int[] array) {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        this.array = array;
        suma = 0;
        for (int e : array) {
            if (e >= 0) {
                cantidadNumerosPositivos++;
            } else {
                cantidadNumerosNegativos++;
            }
            if (e > max) {
                max = e;
            } else if (e < min) {
                min = e;
            }
            suma += e;
        }
        media = (double)suma / array.length;
    }

    /**
     * @return the array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @return the suma
     */
    public int getSuma() {
        return suma;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @return the cantidadNumerosNegativos
     */
    public int getCantidadNumerosNegativos() {
        return cantidadNumerosNegativos;
    }

    /**
     * @return the cantidadNumerosPositivos
     */
    public int getCantidadNumerosPositivos() {
        return cantidadNumerosPositivos;
    }
}
