package com.javiermengual.tema05.lib.ArryAlgoritms;

/**
 * <p>Tema 5 Strings y Arrays</p>
 * <p>Búsqueda y Ordenación en Arrays</p>
 *
 * <p>Esta clase muestra algunos de los métodos de búsqueda y ordenación en arrays vistos en clase</p>
 * <p>License: 🅮 Public Domain</p>
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.3, 2023-11-21
 * @since 0.1
 **/
public class BusquedaOrdenacion {
    private static int iteraciones;

    /**
     * Realiza una búsqueda lineal en un array que puede no estar ordenado
     *
     * @param array Array sobre el que se realizará la búsqueda
     * @param num   Número a buscar
     * @return La posición donde se encuentra el número buscado o -1 si no se
     *         encuentra
     */
    public static int busquedaLineal(int[] array, int num) {
        iteraciones = 0;
        for (int i = 0; i < array.length; i++) {
            iteraciones++;
            if (array[i] == num) { /* Si lo encontramos devolvemos la posición */
                return i;
            }
        }
        return -1;
    }

    /**
     * Realiza una búsqueda lineal en un array ordenado
     *
     * @param array Array sobre el que se realizará la búsqueda
     * @param num   Número a buscar
     * @return La posición donde se encuentra el número buscado o -1 si no se
     *         encuentra
     */
    public static int busquedaLinealArrayOrdenado(int[] array, int num) {
        iteraciones = 0;
        for (int i = 0; i < array.length; i++) {
            iteraciones++;
            if (array[i] == num) { // Lo hemos encontrado
                return i;
            } else if (array[i] > num) { // Si el número buscado es mayor que el elemento actual ya sabemos que no está
                return -1;
            }
        }
        return -1;
    }

    /**
     * Realiza una búsqueda binaria o dicotómica en un array ordenado
     *
     * @param array Array sobre el que se realizará la búsqueda
     * @param num   Número a buscar
     * @return La posición donde se encuentra el número buscado o -1 si no se
     *         encuentra
     */
    public static int busquedaBinaria(int[] array, int num) {
        int medio;
        int inicio = 0;
        int fin = array.length - 1;
        iteraciones = 0;
        while (inicio <= fin) {
            iteraciones++;
            medio = (fin + inicio) / 2;
            if (array[medio] == num) {
                return medio;
            } else if (num < array[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }

    /**
     * Ordena un array mediante el método de la burbuja
     *
     * @param array Array a ordenar
     */
    public static void ordenaBurbuja(int[] array) {
        boolean hayCambios = true;
        int ultimo = array.length - 1; // apunta al último elemento no ordenado
        while (hayCambios) {
            hayCambios = false;
            for (int i = 0; i < ultimo; i++) {
                // Si el elemento actual es mayor que el elemento siguiente los intercambiamos
                if (array[i] > array[i + 1]) {
                    intercambio(array, i, i + 1);
                    hayCambios = true;
                }
            }
            // Después de cada iteración sabemos que el elemento mayor de esta iteración está en la posición "ultimo"
            // Por tanto podemos restar uno para optimizar y no tener que comprobar hasta el final
            ultimo--;
        }
    }


    /**
     * Ordena un array mediante el método de inserción
     *
     * @param array Array a ordenar
     */
    public static void ordenaInsercion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            // Guardamos el elemento actual
            int aux = array[i];
            // Mientras queden posiciones iteramos
            // los desplazamos a la derecha
            for (j = i - 1; j >= 0; j--) {
                // Si el elementos anteriores a aux son mayores, los desplazamos a la derecha
                if (array[j] > aux) {
                    array[j + 1] = array[j];
                } else { // Si no son menores detenemos la iteración
                    break;
                }
            }
            // Colocamos a aux en el sitio que le corresponde
            array[j + 1] = aux;
        }
    }

    /**
     * Orderna un array mediante el método de selección
     *
     * @param array Array a ordenar
     */
    public static void ordenaSeleccion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Elegimos como el mínimo el elemento
            int min = array[i];
            // Guardamos la posición del supuesto mínimo
            int posicion = i;
            for (int j = i + 1; j < array.length; j++) {
                // Si encontramos un elemento menor que el mínimo actual,
                // ese pasa a ser el nuevo mínimo y guardamos su posición
                if (array[j] < min) {
                    min = array[j];
                    posicion = j;
                }
            }
            // Si se ha encontrado algún elemento menor los intercambiamos
            if (min < array[i]) {
                intercambio(array, i, posicion);
            }
        }
    }

    /**
     * Ordena un array mediante el método Quicksort (algoritmo recursivo)
     * El método realiza llamadas recursivas ordenando el subarray comprendido
     * entre izquierda y derecha
     *
     * @param array     Array que queremos ordenar
     * @param izquierda Posición de inicio del subarray (incialmente será 0)
     * @param derecha   Posición final del subarray (inicialmente será array.length
     *                  -1)
     */
    public static void ordenaQuicksort(int[] array, int izquierda, int derecha) {
        // 1. Elegimos el pivote
        int pivote = array[izquierda];
        // 2. Los elementos mayores al pivote van a su derecha, los menores a su
        // izquierda
        // esta parte de la implementación es el corazón del ordenamiento
        // se utilizan variables auxiliares:
        // - i para controlar los elementos a la izquierda del pivote
        // - j para controlar los elementos a la derecha del pivote
        int i = izquierda;
        int j = derecha;
        // mientras los indices no se crucen
        while (i < j) {
            // mientras que el elemento array[i] sea menor o igual al pivote
            // se aumenta el valor de i
            // cuando el bucle finalice, el elemento en array[i] es mayor que pivote y
            // deberá ir a su derecha
            while (array[i] <= pivote && i < j) {
                i++;
            }
            // mientras que el elemento array[j] sea mayor al pivote
            // se desminuye el valor de j
            // cuando el bucle finalice, el elemento en array[j] es menor o igual a pivote y
            // deberá ir a su izquierda
            while (array[j] > pivote) {
                j--;
            }
            // siempre y cuando i sea menor a j, se hace un cambio de los elementos
            // ya que el elemento en array[i] debe ir a la derecha y array[j] a la izquierda
            if (i < j) {
                intercambio(array, i, j);
            }
        }
        // En este punto v[j] es menor o igual al pivote, actualizamos la posición del
        // pivote,
        // trasladando array[j] a la ubicación del pivote y viceversa
        array[izquierda] = array[j];
        array[j] = pivote;
        // 3. Para V1 y V2, aplicar el mismo proceso.
        if (izquierda < j - 1) {
            // Quicksort aplicado a V1
            ordenaQuicksort(array, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            // Quicksort aplicado a V2
            ordenaQuicksort(array, j + 1, derecha);
        }
    }

    /**
     * Ordena un array mediante el método Countingsort
     *
     * @param array Array que queremos ordenar
     */
    public static void ordenaContando(int[] array) {
        EstadisticasArray estadisticas = new EstadisticasArray(array);
        ordenaContando(array, estadisticas.getMin(), estadisticas.getMax());
    }

    /**
     * Ordena un array mediante el método Countingsort
     * Se indica min y max para evitar que haga más iteraciones
     *
     * @param array Array que queremos ordenar
     * @param min   El elemento más pequeño del array
     * @param max   El elemento más grande del array
     */
    public static void ordenaContando(int[] array, int min, int max) {
        int longitud = Math.max(Math.abs(min), Math.abs(max));
        int[] contador = new int[longitud + 1];
        int[] negativos = null;
        if (min < 0) {
            negativos = new int[contador.length];
        }
        for (int valor : array) {
            if (valor < 0) {
                negativos[Math.abs(valor)]++;
            } else {
                contador[valor]++;
            }
        }
        int offset = 0;
        if (min < 0) {
            for (int i = negativos.length - 1; i >= 0; i--) {
                int valor = negativos[i];
                for (int j = 0; j < valor; j++) {
                    array[offset] = i * (-1);
                    offset++;
                }
            }
        }
        for (int i = 0; i < contador.length; i++) {
            int valor = contador[i];
            for (int j = 0; j < valor; j++) {
                array[offset] = i;
                offset++;
            }
        }
    }

    /**
     * Intercambia los elementos del array que ocupan las posiciones i y j
     **/
    private static void intercambio(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static int getIteraciones() {
        return iteraciones;
    }

}
