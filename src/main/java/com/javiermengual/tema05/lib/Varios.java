package com.javiermengual.tema05.lib;

public class Varios {
    public final static float PI = 3.141592f;

    /**
     * Calcula el area de una circunferencia a partir del radio introducido
     *
     * @param r Radio de la circunferencia
     * @return Area de la circunferencia
     */
    public static float area(float r) {
        return r * r * PI;
    }

    /**
     * Calcula la longitud de una circunferencia a partir de su radio
     *
     * @param r Radio de la circunferencia
     * @return Longitud de la circunferencia
     */
    public static float longitud(float r) {
        return 2 * PI * r;
    }

    public static float mayor(float n1, float n2) {
        return Math.max(n1, n2);

    }
    /**
     * Obtiene el valor máximo de los 4 números recibidos como parámetros
     * @param n1 Número 1
     * @param n2 Número 2
     * @param n3 Número 3
     * @param n4 Número 4
     * @return El máximo de los 4 números
     */
    public static float mayor(float n1, float n2, float n3, float n4) {
        float m1 = Math.max(n1, n2);
        float m2 = Math.max(n3, n4);
        return Math.max(m1, m2);
    }
    /**
     * Esta versión, al devolver un String, es más reutilizable desde el punto de vista del programador.
     * @param c Carácter a imprimir
     * @param veces Número de veces a imprimir
     */
    public static String strRepiteLetra(char c, int veces) {
        String s = "";
        for (int i = 1; i <= veces; i++) {
            // Concatenar Strings en un bucle es un problema.
            // En el próximo tema entenderemos porqué y veremos como solucionarlo
            s += c;
        }
        return s;
    }
    /**
     * Devuelve una matriz (como String) de caracteres c de filas x columnas. Esta versión hace uso del strRepiteLetra del Ejercicio 5.
     * @param c Carácter a imprimir
     * @param filas Número de filas
     * @param columnas Número de columnas
     */
    public static String strRepiteLetraMatriz(char c, int filas, int columnas) {
        String s = "";
        for (int i = 1; i <= filas; i++) {
            // Concatenar Strings en un bucle es un problema.
            // En el próximo tema entenderemos porqué y veremos como solucionarlo
            s += strRepiteLetra(c, columnas) + "\n";
        }
        return s;
    }
    /**
     * Calcula el factorial de un número entero mayor o igual que 0.
     * @param n Número a calcular
     * @return Factorial de n
     */
    public static long factorial(int n) {
        // Utilizamos un long porque la función factorial crece muy rápidamente
        long factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }


    /**
     * Determina si la secuencia de números n1n2n3n4 es capicúa
     * @param n1 Primer número
     * @param n2 Segundo número
     * @param n3 Tercer número
     * @param n4 Cuarto número
     * @return true si la secuencia es capicúa, false en caso contrario
     */
    public static boolean capicua(int n1, int n2, int n3, int n4) {
        String strNumero = String.valueOf(n1) + String.valueOf(n2) +
                String.valueOf(n3) + String.valueOf(n4);
        String strReverse = "";
        for (int i = strNumero.length() - 1; i >= 0; i--) {
            // Concatenar Strings en un bucle es un problema.
            // En el próximo tema entenderemos porqué y veremos como solucionarlo
            strReverse += strNumero.charAt(i);
        }
        return strNumero.equals(strReverse);
    }
    /**
     * Determina si el número introducido es capicúa
     * @param num Número a comprobar
     * @return true si el número es capicúa, false en caso contrario
     */
    public static boolean capicua(int num) {
        String strNumero = String.valueOf(num);
        String strReverse = "";
        for (int i = strNumero.length() - 1; i >= 0; i--) {
            // Concatenar Strings en un bucle es un problema.
            // En el próximo tema entenderemos porqué y veremos como solucionarlo
            strReverse += strNumero.charAt(i);
        }
        return strNumero.equals(strReverse);
    }

    /**
     * Calcula el sumatorio del número recibido como parámetro
     * @param n Número a calcular
     * @return La suma de 1 hasta n
     */
    public static long sumatorio(int n) {
        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }
    /**
     * Obtiene la tabla de multiplicar del número indicado como parámetro
     * Versión reutilizable
     * @param n Tabla a mostrar
     * @return String que contiene la tabla de multiplicar solicitada
     */
    public static String obtenerTabla(int n) {
        String tabla = "";
        for (int i = 0; i <= 9; i++) {
            // Concatenar Strings en un bucle es un problema.
            // En el próximo tema entenderemos porqué y veremos como solucionarlo
            tabla += n + " x " + i + " = " + n*i + "\n";
        }
        return tabla;
    }

    public enum Calificacion {
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE, ERROR
    }
    /**
     * Obtiene la Calificacion a partir de una nota númerica
     * @param n Nota númerica
     * @return Calificación equivalente
     */
    public static Calificacion obtenerCalificacion(float n) {
        Calificacion calificacion;
        int nota = (int)n;
        // Versión con switch expression. Por supuesto se puede hacer también con switch normal o con if else if
        calificacion = switch (nota) {
            case 0, 1, 2, 3, 4 -> Calificacion.INSUFICIENTE;
            case 5 -> Calificacion.SUFICIENTE;
            case 6 -> Calificacion.BIEN;
            case 7, 8 -> Calificacion.NOTABLE;
            case 9, 10 -> Calificacion.EXCELENTE;
            default -> Calificacion.ERROR;
        };
        return calificacion;
    }

    /**
     * Obtiene el número combinatorio de n sobre m
     * Cantidad de combinaciones que podemos hacer con n elementos tomados de m en m muestras
     * @param n Número de elementos
     * @param m Agrupados de m en m
     * @return long con el número combinatorio obtenido
     */
    public static long numeroCobinatorio(int n, int m) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }

    /**
     * Calcula y muestra el mínimo número de monedas necesario para una cantidad en euros.
     *
     * @param dinero Cantidad en euros que se desea convertir en monedas.
     */
    public static void calcularCambio(float dinero) {
        int restante = (int) (dinero * 100); // Convertir a céntimos
        int monedas200 = 0, monedas100 = 0, monedas50 = 0;
        int monedas20 = 0, monedas10 = 0, monedas5 = 0;
        int monedas2 = 0, monedas1 = 0;

        // Calcular monedas necesarias
        if (restante >= 200) {
            monedas200 = restante / 200;
            restante = restante % 200;
        }
        if (restante >= 100) {
            monedas100 = restante / 100;
            restante = restante % 100;
        }
        if (restante >= 50) {
            monedas50 = restante / 50;
            restante = restante % 50;
        }
        if (restante >= 20) {
            monedas20 = restante / 20;
            restante = restante % 20;
        }
        if (restante >= 10) {
            monedas10 = restante / 10;
            restante = restante % 10;
        }
        if (restante >= 5) {
            monedas5 = restante / 5;
            restante = restante % 5;
        }
        if (restante >= 2) {
            monedas2 = restante / 2;
            restante = restante % 2;
        }
        if (restante >= 1) {
            monedas1 = restante;
        }

        // Mostrar resultados
        System.out.println("El mínimo cambio con monedas de " + dinero + " € son: ");
        System.out.println(monedas200 + " monedas de 2 euros");
        System.out.println(monedas100 + " monedas de 1 euro");
        System.out.println(monedas50 + " monedas de 50 céntimos");
        System.out.println(monedas20 + " monedas de 20 céntimos");
        System.out.println(monedas10 + " monedas de 10 céntimos");
        System.out.println(monedas5 + " monedas de 5 céntimos");
        System.out.println(monedas2 + " monedas de 2 céntimos");
        System.out.println(monedas1 + " monedas de 1 céntimo.");
    }

    /**
     * Calcula la cuota final a pagar en función de la edad y si los padres son socios.
     *
     * @param edad   Edad de la persona.
     * @param socios Indica si los padres son socios ('s' para sí, 'n' para no).
     * @return La cuota final a pagar.
     */
    public static float calcularCuotaFinal(int edad, char socios) {
        final float CUOTA_BASE = 500f;
        float descuento = 0;

        if (edad > 65) {
            descuento = 50;
        } else if (edad < 18) {
            descuento = 25;
            if (socios == 's') {
                descuento = 35;
            }
        }

        return CUOTA_BASE - (CUOTA_BASE * descuento) / 100;
    }

    /**
     * Calcula la potencia de una base elevada a un exponente.
     *
     * @param base      La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de la potencia.
     */
    public static double calcularPotencia(double base, int exponente) {
        boolean potenciaNegativa = false;
        double potencia = 1;

        // Si el exponente es negativo, lo manejamos
        if (exponente < 0) {
            potenciaNegativa = true;
            exponente = -exponente; // Cambiamos el signo del exponente
        }

        // Calculamos la potencia
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        // Si la potencia era negativa, calculamos la inversa
        if (potenciaNegativa) {
            potencia = 1 / potencia;
        }

        return potencia;
    }

    /**
     * Determina si un número es primo.
     *
     * @param numero El número a verificar.
     * @return `true` si el número es primo, `false` en caso contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 1 no es primo por definición
        }
        if (numero == 2) {
            return true; // 2 es el único número par primo
        }
        if (numero % 2 == 0) {
            return false; // Cualquier número par mayor que 2 no es primo
        }

        int tope = (int) Math.sqrt(numero) + 1; // Raíz cuadrada redondeada hacia arriba
        for (int i = 3; i < tope; i += 2) { // Recorremos solo números impares
            if (numero % i == 0) {
                return false; // Si encontramos un divisor, no es primo
            }
        }
        return true; // Si no encontramos divisores, es primo
    }

    /**
     * Calcula el precio final después de aplicar un descuento.
     *
     * @param precioInicial El precio original del producto.
     * @param descuento     El porcentaje de descuento a aplicar.
     * @return El precio final después de aplicar el descuento.
     */
    public static float calcularPrecioConDescuento(float precioInicial, float descuento) {
        float descuentoAplicado = (descuento / 100) * precioInicial;
        return precioInicial - descuentoAplicado;
    }

    /**
     * Convierte una cantidad de segundos en días, horas, minutos y segundos.
     *
     * @param segundosIniciales La cantidad de segundos a convertir.
     * @return Una cadena de texto con el resultado en formato legible.
     */
    public static String convertirSegundos(int segundosIniciales) {
        int segundos = segundosIniciales % 60;
        int minutos = segundosIniciales / 60;
        int horas = minutos / 60;
        minutos = minutos % 60;
        int dias = horas / 24;
        horas = horas % 24;

        return segundosIniciales + " segundos son: " + dias + " días, " +
                horas + " horas, " + minutos + " minutos y " + segundos + " segundos.";
    }


    /**
     * Calcula el consumo medio y el coste por kilómetro basado en los datos de repostajes.
     *
     * @param precioLitro1 Precio por litro del primer repostaje.
     * @param totalPagado1 Total pagado en el primer repostaje.
     * @param km1 Kilómetros recorridos antes del primer repostaje.
     * @param precioLitro2 Precio por litro del segundo repostaje.
     * @param totalPagado2 Total pagado en el segundo repostaje.
     * @param km2 Kilómetros recorridos después del segundo repostaje.
     * @return Una cadena de texto con el consumo medio y el coste por kilómetro.
     */
    public static String calcularConsumoYCoste(
            float precioLitro1, float totalPagado1, float km1,
            float precioLitro2, float totalPagado2, float km2) {

        // Calcular litros consumidos en cada repostaje
        float litros1 = totalPagado1 / precioLitro1;
        float litros2 = totalPagado2 / precioLitro2;

        // Calcular totales
        float totalLitros = litros1 + litros2;
        float totalKm = km2 - km1;

        // Calcular consumo medio y coste por kilómetro
        float consumoMedio = (totalLitros / totalKm) * 100;
        float costePorKm = (totalPagado1 + totalPagado2) / totalKm;

        // Formatear el resultado en texto legible
        return "Consumo medio: " + consumoMedio + " litros/100 km\n" +
                "Coste por kilómetro: " + costePorKm + " €";
    }






}
