package com.javiermengual.tema05.lib;
import java.util.Random;
import java.util.Scanner;

public  class Arrys {
    /**
     * Solicita al usuario los valores del array pasado como parámetro
     * @param array Array a rellenar
     */
    public static void solicitarDatosArray(double[] array,Scanner sc) {
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d]?\n", i);
            array[i] = Double.parseDouble(sc.nextLine());
        }
    }

    /**
     * Rellena el Array recibido como parámetro con valores aleatorios comprendidos entre valorMinimo y valorMaximo
     * @param array Array a rellenar
     * @param valorMinimo Mínimo valor aleatorio que se generará
     * @param valorMaximo Máximo valor aleatorio que se generará
     */
    public static void rellenarArray(double[] array, double valorMinimo, double valorMaximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Randim.aleatorioDouble(valorMinimo, valorMaximo);
        }
    }
    /**
     * Rellena el array recibido como parámetro con números aleatorios
     * comprendidos entre un valor mínimo y un valor máximo.
     *
     * @param array      Array a rellenar.
     * @param valorMinimo Mínimo valor aleatorio que se generará (inclusive).
     * @param valorMaximo Máximo valor aleatorio que se generará (inclusive).
     */
    public static void rellenarArrayEnteros(int[] array, int valorMinimo, int valorMaximo) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }
    }



    /**
     * Obtiene una representación como texto de los elementos del array representándolos con los decimales
     * indicados como parámetro.
     *
     * @param array Array a mostrar
     * @param decimales La cantidad de decimales que se mostrarán en la representación
     * @return String con la representación como texto del array
     */
    public static String arrayToString(double[] array, int decimales) {
        if (array == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%." + decimales + "f";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) { // último elemento
                coma = "";
            }
            sb.append(espacio).append(String.format(formato, array[i])).append(coma);
            if (i == 0) {
                espacio = " ";
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Obtiene la media aritmética de los valores del array recibido como parámetro
     * @param array Array sobre el que se quiere calcular la media
     * @return La media aritmética
     */
    public static double mediaArray(double[] array) {
        double suma = 0;
        for (double valor : array) {
            suma += valor;
        }
        return suma / array.length;
    }


    public enum Paridad {
        PAR, IMPAR, TODOS
    }
    /**
     * Convierte un array de caracteres en una representación textual según el tipo especificado.
     *
     * @param array Array de caracteres a procesar.
     * @param tipo  Tipo de elementos a incluir en el texto:
     *              - Paridad.PAR: Solo elementos en posiciones pares.
     *              - Paridad.IMPAR: Solo elementos en posiciones impares.
     *              - Paridad.TODOS: Todos los elementos del array.
     * @return Representación textual del array con los elementos seleccionados.
     */
    public static String arrayToString(char[] array, Paridad tipo) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        // Determinar índice inicial y paso según el tipo
        int inicio = (tipo == Paridad.IMPAR) ? 1 : 0; // Empieza en 1 para impares, 0 para pares o todos.
        int paso = (tipo == Paridad.TODOS) ? 1 : 2;   // Incremento de 1 para todos, 2 para pares o impares.

        for (int i = inicio; i < array.length; i += paso) {
            sb.append(array[i]).append(" ");
        }

        sb.append("]");
        return sb.toString();
    }



    /**
     * Determina la longitud máxima, expresada en número de caracteres, de los elementos del array.
     * Útil para saber el tamaño mínimo que deberá tener cada columna al imprimir un array en columnas
     * @param array Array a imprimir
     * @param decimales Número de decimales con los que se expresará cada elemento
     * @return La longitud máxima expresada como número de caracteres
     */
    public static int determinarLongitudMaxima(double[] array, int decimales) {
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (double numero : array) {
            int longitudActual = String.format(formato, numero).length();
            if (longitudMaxima < longitudActual) {
                longitudMaxima = longitudActual;
            }
        }
        return longitudMaxima;
    }

    /**
     * Muestra el Array en columnas con la cantidad de decimales indicada y
     * una distancia entre las columnas de 2 caracteres.
     *
     * @param array Array a mostrar
     * @param decimales Cantidad de decimales que se mostrarán
     * @param columnas Número de columnas que mostrará
     * @return Representación del array como texto
     */
    public static String arrayToString(double[] array, int decimales, int columnas) {
        return arrayToString(array, decimales, columnas, 2);
    }

    /**
     * Muestra el Array en columnas con la cantidad de decimales indicada y
     * una distancia entre las columnas igual al valor asignado a padding.
     *
     * @param array Array a mostrar
     * @param decimales Cantidad de decimales que se mostrarán
     * @param columnas Número de columnas que mostrará
     * @param padding Espaciado entre columnas
     * @return Representación del array como texto
     */
    public static String arrayToString(double[] array, int decimales, int columnas, int padding) {
        if (array == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int tamanyoColumna = determinarLongitudMaxima(array, decimales) + padding;
        String formato = "%" + tamanyoColumna + "." + decimales + "f";
        for (int i = 0; i < array.length; i++) {
            sb.append(String.format(formato, array[i]));
            if ((i + 1) % columnas == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    /**
     * Obtiene los elementos del Array array que son mayores que x
     * devolviéndolos en un nuevo array
     *
     * @param array Array a buscar
     * @param x valor a partir del cual se mostrarán
     * @return Array con los elementos de array mayores que x
     */
    public static float[] mayoresQue(float[] array, float x) {
        float[] resultado;
        int mayoresCont = 0;
        for (float num : array) {
            if (num > x) {
                mayoresCont++;
            }
        }
        resultado = new float[mayoresCont];
        int i = 0;
        for (float elem : array) {
            if (elem > x) {
                resultado[i] = elem;
                i++;
            }
        }
        return resultado;
    }
    /**
     * Suma cada elemento de v1 con su correspondiente en v2
     *
     * @param v1 Primer Array
     * @param v2 Segundo array
     * @return Devuelve un nuevo array con la suma de v1 y v2
     */
    public static int[] suma(int[] v1, int[] v2) {
        int[] sum = new int[v1.length];
        if (v1.length != v2.length) {
            System.out.println("Error no se pueden sumar arrays de diferente tamaño.");
            return sum;
        }
        for (int i = 0; i < v1.length; i++) {
            sum[i] = v1[i] + v2[i];
        }
        return sum;
    }

    /**
     * Divide cada elemento de v1 con su correspondiente en v2
     *
     * @param v1 Primer Array
     * @param v2 Segundo array
     * @return Devuelve un nuevo array con la división de v1 y v2
     */
    public static double[] division(int[] v1, int[] v2) {
        double[] div = new double[v1.length];
        if (v1.length != v2.length) {
            System.out.println("Error no se pueden dividir arrays de diferente tamaño.");
            return div;
        }
        for (int i = 0; i < v1.length; i++) {
            div[i] = (float) v1[i] / v2[i];
        }
        return div;
    }
    /**
     * Obtiene un array con los elementos del array v que son múltiplos de 5
     *
     * @param array Array que contiene los valores a buscar
     * @return array con los elementos de v que son múltiplos de 5
     */
    public static int[] multiplosDeCinco(int[] array) {
        return multiplosDe(array, 5);
    }

    /**
     * Obtiene un array con los elementos del array v que son múltiplos del valor indicado
     *
     * @param array Array que contiene los valores a buscar
     * @param multiplo El múltiplo
     * @return array con los elementos de v que son múltiplos de multiplo
     */
    public static int[] multiplosDe(int[] array, int multiplo) {
        int[] resultado;
        int multiplosCount = 0;

        for (int numero : array) {
            if (numero % multiplo == 0) {
                multiplosCount++;
            }
        }
        resultado = new int[multiplosCount];
        int contador = 0;
        for (int numero : array) {
            if (numero % multiplo == 0) {
                resultado[contador] = numero;
                contador++;
            }
        }
        return resultado;
    }

    // Lo ideal hubiera sido un método que le pasáramos como parámetro
    // el múltiplo a buscar, de esta forma con un método valdría para
    // los múltiplos de 5 y de 10. Pero el ejercicio lo pide expresamente
    // en métodos separados.
    /**
     * Obtiene un array con los elementos del array v que son múltiplos de 10
     *
     * @param array Array que contiene los valores a buscar
     * @return array con los elementos de v que son múltiplos de 10
     */
    public static int[] multiplosDeDiez(final int[] array) {
        return multiplosDe(array, 10);
    }
    /**
     * Busca si un determinado elemento se encuentra en el array.
     *
     * @param array El array
     * @param x El valor a buscar
     * @return Si el elemento se encuentra en el array devuelve la posición
     *         de la primera aparición en el array. En caso negativo devuelve -1
     */
    public static int buscar(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Muestra el array pasado como parámetro
     *
     * @param array Array a visualizar
     */
    public static void visualizarArray(int[] array) {
        // Dos formas de hacerlo
        // 1. Recorrer el array e imprimir cada elemento
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");

        // 2. Utilizar el método toString de la clase Arrays.
        // Arrays.toString(array);
    }

    /**
     * Muestra los elementos del array que son pares
     *
     * @param array Array a visualizar
     */
    public static void visualizarPares(int[] array) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (cont != 0) {
                    System.out.print(", ");
                }
                System.out.print("array[" + i + "] = " + array[i]);
                cont++;
            }
        }
        System.out.println();
    }

    /**
     * Muestra los elementos del array que son múltiplos de 3
     *
     * @param array Array a visualizar
     */
    public static void visualizarMultiplos3(int[] array) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                if (cont != 0) {
                    System.out.print(", ");
                }
                System.out.print("v[" + i + "] = " + array[i]);
                cont++;
            }
        }
        System.out.println();
    }
    /**
     * Solicita al usuario que introduza números reales para el Array array
     *
     * @param array Array en el que se guardarán los datos introducidos por el usuario
     */
    public static void solicitarArray(double[] array, Scanner sc) {
        System.out.println("Introduce los " + array.length + " elementos del array");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    /**
     * Genera un array s con los valores de p que son mayores que num
     *
     * @param p   Array en el que se buscan los valores
     * @param num Número que marca el valor a partir del cual se guardaran los
     *            valores en el array s
     * @return Array con los elementos p que son mayores que num
     */
    public static double[] mayoresQue(final double[] p, int num) {
        double[] resultado = new double[p.length];
        for (int i = 0; i < p.length; i++) {
            if (p[i] > num) {
                resultado[i] = p[i];
            } else {
                resultado[i] = -1;
            }
        }
        return resultado;
    }

    /**
     * Genera un array a partir del contenido del Array array cuyo
     * contenido es el mismo que array pero en orden inverso
     *
     * @param array Array original
     * @return Array invertido
     */
    public static double[] ordenInverso(final double[] array) {
        int j = 0;
        double[] p = new double[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            p[j] = array[i];
            j++;
        }
        return p;
    }
    /**
     * Rellena el Array array con números enteros aleatorios entre minValue y maxValue
     *
     * @param array Array a rellenar
     * @param minValue valor aleatorio mínimo
     * @param maxValue valor aleatorio máximo
     */
    public static void rellenarArray(int[] array, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minValue, maxValue + 1);
        }
    }

    /**
     * Genera un array de la forma
     * v[0] = v[0]
     * v[1] = v[0] + v[1]
     * v[2] = v[0] + v[1] + v[2]
     * ...
     * v[n] = v[0] + v[1] + v[2] + ... + v[n]
     *
     * @param v Array origen
     * @return Array con los sumatorios
     */
    public static int[] generarSumatorio(final int[] v) {
        int suma = 0;
        int[] w = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
            w[i] = suma;
        }
        return w;
    }
    /**
     * Genera un Array con los elementos pares presentes en el Array array
     *
     * @param array Array origen
     * @return Array con los elementos pares del Array array
     */
    public static int[] obtenerPares(final int[] array) {
        int[] resultado = null;
        int paresCount = 0;
        int contador = 0;
        /*
         * Como tenemos que devolver un array de tamaño igual al número de elementos pares que hay,
         * en primer lugar tenemos que determinar cuantos elementos pares hay en el array
         */
        for (int numero : array) {
            if (numero % 2 == 0) {
                paresCount++;
            }
        }
        /*
         * Una vez sabemos cuantos elementos pares hay, creamos el array de ese tamaño y volvemos a iterar
         * para añadir todos los elmentos pares.
         */
        if (paresCount > 0) {
            resultado = new int[paresCount];
            for (int numero : array) {
                if (numero % 2 == 0) {
                    resultado[contador] = numero;
                    contador++;
                }
            }
        }
        return resultado;
    }
    /**
     * Genera un array de carácteres aleatorios.
     * Los carácteres son generados mediante números aleatorios.
     * En Unicode las letras de la A-Z corresponden a números entre 65 y 90
     * La letra Ñ tiene es el número 209 en Unicode
     * @param array Array a rellenar con caracteres
     */
    public static void rellenarArray(char[] array) {
        int num;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // 65 -> A
            // 90 -> Z
            // 209 -> Ñ
            // Generamos un número entre 65 y 91
            // De 65 a 90 serán las letras normales A..Z en inglés pero falta la Ñ
            // Si sale el 91 lo tomaremos como si fuése la Ñ que es el 209 en Unicode
            num = random.nextInt('A', 'Z' + 2); // +2 para hacer hueco a la Ñ
            if (num == 'Z' + 1) {
                num = 'Ñ';
            }
            array[i] = (char)num;
        }
    }

    /**
     * Muestra el número de apariciones de cada carácter que hay en el Array
     * @param array Array con los carácteres
     */
    public static void mostrarOcurrencias(final char[] array) {
        int[] o = new int['Z' + 2 - 'A'];
        int num;
        StringBuilder s = new StringBuilder();
        for (char c : array) {
            num = c - 'A';
            if (num > 'Z') {
                num = 'Z' + 1 - 'A';
            }
            o[num]++;
        }
        for (int i = 0; i < o.length; i++) {
            s.setLength(0);
            num = i + 'A';
            if (num == 'Z' + 1) {
                num = 'Ñ';
            }
            s.append((char)num).append(" --> ").append(o[i]);
            System.out.println(s);
        }
    }
    /**
     * Encuentra el valor máximo en un array de enteros.
     *
     * @param array Array de enteros.
     * @return Valor máximo en el array.
     */
    public static int encontrarMaximo(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Encuentra el valor mínimo en un array de enteros.
     *
     * @param array Array de enteros.
     * @return Valor mínimo en el array.
     */
    public static int encontrarMinimo(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    /**
     * Verifica si un array está ordenado de manera ascendente.
     *
     * @param array Array de enteros.
     * @return `true` si el array está ordenado, de lo contrario `false`.
     */
    public static boolean estaOrdenado(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
    /**
     * Rota un array hacia la derecha una posición.
     *
     * @param array Array de enteros.
     * @return Array rotado.
     */
    public static int[] rotarDerecha(int[] array) {
        int[] rotado = new int[array.length];
        rotado[0] = array[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            rotado[i] = array[i - 1];
        }
        return rotado;
    }




}