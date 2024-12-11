package com.javiermengual.tema05.lib;

import java.util.Scanner;

public class Strings {

    //------------------ VERIFICAR ---------------\\
    /**
     * Comprueba si el carácter proporcionado es una vocal.
     *
     * @param caracter El carácter que se desea analizar.
     * @return Devuelve `true` si el carácter es una vocal, de lo contrario `false`.
     */
    public static boolean esVocal(char caracter) {
        String vocales = "aáàäâeéèëêiíìïîoóòöôuúùüûAÁÀÄÂEÉÈËÊIÍÌÏÎOÓÒÖÔUÚÙÜÛ";
        return vocales.indexOf(caracter) >= 0;
    }

    /**
     * Comprueba si el carácter proporcionado es una consonante.
     *
     * @param caracter El carácter que se desea analizar.
     * @return Devuelve `true` si el carácter es una consonante, de lo contrario `false`.
     */
    public static boolean esConsonante(char caracter) {
        return Character.isLetter(caracter) && !esVocal(caracter);
    }

    /**
     * Verifica si la longitud de un texto está dentro de un rango permitido.
     *
     * @param texto          El texto que se desea verificar.
     * @param longitudMaxima La longitud máxima permitida.
     * @param longitudMinima La longitud mínima permitida.
     * @param mensajeError   Mensaje que se muestra si la longitud no es válida.
     * @return Devuelve `true` si la longitud del texto es válida, de lo contrario `false`.
     */
    public static boolean validarLongitud(String texto, int longitudMaxima, int longitudMinima, String mensajeError) {
        boolean esValido = texto.length() <= longitudMaxima && texto.length() >= longitudMinima;

        if (!esValido) {
            System.err.println(mensajeError);
        }

        return esValido;
    }

    /**
     * Verifica si una cadena contiene únicamente dígitos.
     *
     * @param texto La cadena a verificar.
     * @return `true` si la cadena contiene solo dígitos, de lo contrario `false`.
     */
    public static boolean esNumerico(String texto) {
        return texto.matches("\\d+");
    }

    /**
     * Verifica si una cadena está vacía o contiene solo espacios en blanco.
     *
     * @param texto La cadena a verificar.
     * @return `true` si la cadena está vacía o contiene solo espacios en blanco, de lo contrario `false`.
     */
    public static boolean esBlanco(String texto) {
        return texto == null || texto.trim().isEmpty();
    }
    /**
     * Comprueba si una cadena empieza con un prefijo específico.
     *
     * @param texto  La cadena a verificar.
     * @param prefijo El prefijo a buscar.
     * @return `true` si la cadena empieza con el prefijo, de lo contrario `false`.
     */
    public static boolean empiezaCon(String texto, String prefijo) {
        return texto.startsWith(prefijo);
    }

    /**
     * Comprueba si una cadena termina con un sufijo específico.
     *
     * @param texto  La cadena a verificar.
     * @param sufijo El sufijo a buscar.
     * @return `true` si la cadena termina con el sufijo, de lo contrario `false`.
     */
    public static boolean terminaCon(String texto, String sufijo) {
        return texto.endsWith(sufijo);
    }




    //--------------- SUSTITUIR -------------\\

    /**
     * Reemplaza una secuencia de caracteres en un texto con otra secuencia.
     *
     * @param texto               El texto en el que se desea realizar la sustitución.
     * @param secuenciaAntigua    La secuencia de caracteres a reemplazar.
     * @param secuenciaNueva      La secuencia de caracteres que reemplazará a la anterior.
     * @return Devuelve el texto con las ocurrencias reemplazadas.
     */
    public static String sustituir(String texto, String secuenciaAntigua, String secuenciaNueva) {
        return texto.replace(secuenciaAntigua, secuenciaNueva);
    }

    /**
     * Reemplaza las ocurrencias de una secuencia en un texto bajo ciertas condiciones (acepta REGEX).
     *
     * @param texto               El texto en el que se desea realizar la sustitución.
     * @param secuenciaAntigua    La secuencia de caracteres a reemplazar.
     * @param secuenciaNueva      La secuencia de caracteres que reemplazará a la anterior.
     * @return Devuelve el texto con las ocurrencias reemplazadas.
     */
    public static String reemplazarConCondicion(String texto, String secuenciaAntigua, String secuenciaNueva) {
        return texto.replaceAll(secuenciaAntigua, secuenciaNueva);
    }

    //------------ OPERACIONES -----------------\\
    /**
     * Elimina espacios en blanco adicionales en una cadena.
     *
     * @param texto La cadena a limpiar.
     * @return La cadena sin espacios adicionales.
     */
    public static String eliminarEspaciosExtras(String texto) {
        return texto.trim().replaceAll("\\s+", " ");
    }
    /**
     * Extrae una subcadena de un texto.
     *
     * @param texto   La cadena de texto original.
     * @param inicio  Posición inicial.
     * @param fin     Posición final (no incluida).
     * @return La subcadena extraída.
     */
    public static String extraerSubcadena(String texto, int inicio, int fin) {
        return texto.substring(inicio, fin);
    }



    /**
     * Cuenta las vocales que contiene la cadena de carácteres pasada como parámetro
     * @param s Cadena de carácteres a contar los carácteres
     * @return int Número de vocales que tiene la cadena de carácteres introducida
     */
    public static int cuentaVocales(String s) {
        int vocales = 0;
        String aux = s.toLowerCase();
        for (int i = 0; i < aux.length(); i++) {
            char c = aux.charAt(i);
            if (esVocal(c)) {
                vocales++;
            }
        }
        return vocales;
    }

    /**
     * Calcula el número de consonantes presentes en un texto.
     *
     * @param texto El texto que se desea analizar.
     * @return Devuelve el número de consonantes presentes en el texto.
     */
    public static int contarConsonantes(String texto) {
        int totalConsonantes = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (esConsonante(texto.charAt(i))) {
                totalConsonantes++;
            }
        }
        return totalConsonantes;
    }
    /**
     * Cuenta cuántas veces aparece un carácter en una cadena.
     *
     * @param texto  La cadena donde buscar.
     * @param caracter El carácter a contar.
     * @return El número de veces que aparece el carácter en el texto.
     */
    public static int contarCaracter(String texto, char caracter) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }


    /**
     * Divide un texto en un array de palabras individuales.
     *
     * @param texto El texto que se desea dividir.
     * @return Devuelve un array con cada palabra del texto.
     */
    public static String[] dividirEnPalabras(String texto) {
        texto = texto.trim();
        return texto.split("\\s+");
    }

    /**
     * Encuentra la palabra más larga dentro de un texto.
     *
     * @param texto El texto en el que se desea buscar.
     * @return Devuelve la palabra más larga encontrada en el texto.
     */
    public static String encontrarPalabraMasLarga(String texto) {
        String palabraMasLarga = "";
        int inicioPalabra = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ' || i == texto.length() - 1) {
                int finPalabra = (i == texto.length() - 1) ? texto.length() : i;

                String palabraActual = texto.substring(inicioPalabra, finPalabra);
                if (palabraActual.length() > palabraMasLarga.length()) {
                    palabraMasLarga = palabraActual;
                }
                inicioPalabra = i + 1;
            }
        }
        return palabraMasLarga;
    }

    /**
     * Pone la primera letra de la frase en mayúscula
     * @param frase Frase a capitalizar
     * @return Frase capitalizada
     */
    public static String capitalizePhrase(String frase) {
        StringBuilder nuevaFrase = new StringBuilder();
        // Eliminamos los espacios en blanco del principio y del final (si los hay)
        frase = frase.trim();
        // Ponemos la primera letra en mayúscula
        nuevaFrase.append(Character.toUpperCase(frase.charAt(0)));
        // Añadimos el resto de la frase
        nuevaFrase.append(frase.substring(1));
        return nuevaFrase.toString();
    }

    /**
     * Pone la primera letra de cada palabra de la frase en mayúscula
     * @param frase Frase a capitalizar
     * @return Palabras de la frase capitalizadas
     */
    public static String capitalizeWords(String frase) {
        StringBuilder nuevaFrase = new StringBuilder();
        String[] palabras;
        // Eliminamos los espacios en blanco del principio y del final (si los hay)
        frase = frase.trim();
        // Dividimos la frase en palabras tomando como separador uno o varios espacios en blanco seguidos
        palabras = frase.split("\\s+");
        // Para cada palabra
        for (String palabra: palabras) {
            // Ponemos la primera letra en mayúscula
            nuevaFrase.append(Character.toUpperCase(palabra.charAt(0)));
            // Añadimos el resto de la palabra
            nuevaFrase.append(palabra.substring(1));
            nuevaFrase.append(" ");
        }
        return nuevaFrase.toString();
    }
    /**
     * Cuenta las "palabras" de la frase pasada como parámetro.
     * Esta versión asume que cada texto separado por espacios en blanco es una
     * palabra
     *
     * @param frase La frase a analizar
     * @return El números de palabras de la frase
     */
    public static int cuentaPalabras(String frase) {
        // Eliminamos los espacios en blanco del principio y del final (si los hay)
        frase = frase.trim();
        return frase.split("\\s+").length;
    }

    /**
     * Cuenta las palabras de la frase pasada como parámetro.
     * Esta versión requiere que cara palabra debe empezar por una letra
     *
     * @param frase La frase a analizar
     * @return El números de palabras de la frase
     */
    public static int cuentaPalabrasMejorado(String frase) {
        // Eliminamos los espacios en blanco del principio y del final (si los hay)
        frase = frase.trim();
        // Dividimos la frase en palabras tomando como separador uno o varios espacios en blanco seguidos
        String[] candidatas = frase.split("\\s+");
        int palabras = 0;
        for (int i = 0; i < candidatas.length; i++) {
            if (Character.isLetter(candidatas[i].charAt(0))) {
                palabras++;
            }
        }
        return palabras;
    }

    /**
     * Repite la frase nVeces veces
     * @param frase frase que recibe
     * @param nVeces  la repite n veces
     * @return String con la frase repitida nVeces
     */
    public static String repiteFrase(String frase, int nVeces) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nVeces; i++) {
            sb.append(frase).append("\n");
        }
        return sb.toString();
    }

    /**
     * Obtiene los caracteres impares del texto
     *
     * @param texto
     * @return String con los caracteres impares
     */
    public static String caracteresImpares(String texto) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < texto.length(); i += 2) {
            sb.append(texto.charAt(i));
        }
        return sb.toString();
    }
    /**
     * Determina si palabra es una palabra palíndroma
     *
     * @param palabra
     * @return true si palabra es palíndroma, false en caso contrario.
     */
    public static boolean esPalabraPalindroma(String palabra) {
        palabra = palabra.trim();
        palabra = eliminarAcentos(palabra);
        String palabraReverse = reverse(palabra);
        return palabra.equalsIgnoreCase(palabraReverse);
    }

    /**
     * Invierte una cadena de texto
     * @param s La cadena a invertir
     * @return La cadena invertida
     */
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            sb.append(s.charAt(i));

        return sb.toString();
    }

    /**
     * Determina si frase es una frase palíndroma
     * @param frase Frase a analizar
     * @return true si frase es palíndroma, false en caso contrario.
     */
    public static boolean esFrasePalindroma(String frase) {
        // Eliminamos espacios en blanco
        frase = frase.replaceAll("\\s+", "");
        // Convertimos a minúsculas
        frase = frase.toLowerCase();
        // Eliminamos acentos
        frase = eliminarAcentos(frase);
        String fraseReverse = reverse(frase);
        return frase.equals(fraseReverse);
    }

    /**
     * Elimina los acentos de una frase
     * @param frase La frase a analizar
     * @return La frase sin acentos
     */
    public static String eliminarAcentos(String frase) {
        String origen = "áàäåéèëiíìïóòöúùü";
        String destino = "aaaaeeeiiiiooouuu";
        for (int i = 0; i < origen.length(); i++) {
            frase = frase.replace(origen.charAt(i), destino.charAt(i));
        }
        return frase;
    }
    /**
     * Calcula el número de veces que aparece el carácter c en el String s
     *
     * @param c
     * @param s
     * @return Número de veces que se repite el carácter
     */
    public static int nApariciones(char c, String s) {
        int nVeces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                nVeces++;
            }
        }
        return nVeces;
    }
    /**
     * Reemplaza cada aparición de texto por reemplazo
     *
     * @param texto     Texto a ser reemplazado
     * @param reemplazo Texto por el que se reemplazará
     * @param frase     Frase donde se buscará el texto
     * @return Frase con el texto reemplazado
     */
    public static String reemplazarTexto(String texto, String reemplazo, String frase) {
        return frase.replace(texto, reemplazo);
    }

    /**
     * Reemplaza los números (de cualquier longitud) que aparezcan en frase
     * por el texto especificado en reemplazo
     *
     * @param reemplazo
     * @param frase
     * @return Frase con los números reemplazados por el texto reemplazo.
     */
    public static String reemplazarNumeros(String reemplazo, String frase) {
        return frase.replaceAll("\\d+", reemplazo);
    }
    /**
     * Determina cual es la palabra más larga de las 3 introducidas como parámetro
     * @param s1 Primera palabra
     * @param s2 Segunda palabra
     * @param s3 Tercera palabra
     * @return String con la palabra más larga
     */
    public static String masLarga(String s1, String s2, String s3) {
        String m1 = masLarga(s1,s2);
        return masLarga(m1, s3);
    }

    /**
     * Determina cual es la palabra más larga de las 2 introducidas como parámetro
     * @param s1 Primera palabra
     * @param s2 Segunda palabra
     * @return String con la palabra más larga
     */
    public static String masLarga(String s1, String s2) {
        return s1.length() > s2.length() ? s1 : s2;
    }


    /**
     * Determina cual es la palabra más corta de las 3 introducidas como parámetro
     * @param s1 Primera palabra
     * @param s2 Segunda palabra
     * @param s3 Tercera palabra
     * @return String con la palabra más corta
     */
    public static String masCorta(String s1, String s2, String s3) {
        String m1 = masCorta(s1, s2);
        return masCorta(m1, s3);
    }

    /**
     * Determina cual es la palabra más corta de las 2 introducidas como parámetro
     * @param s1 Primera palabra
     * @param s2 Segunda palabra
     * @return String con la palabra más corta
     */
    public static String masCorta(String s1, String s2) {
        return s1.length() < s2.length() ? s1 : s2;
    }
    /**
     * Genera una secuencia contadora desde 0-0-0-0 hasta 9-9-9-9
     * devolviéndola como un String, donde toda aparición del número
     * indicado en num, es sustituida por el carácter indicado en c
     *
     * @param num Número que va a ser sustituido
     * @param c Carácter por el cual se sustituirá
     * @return La secuencia contadora generada
     */
    public static String generarContador(int num, char c) {
        String numStr = String.valueOf(num);
        String charStr = String.valueOf(c);
        String secuencia = "";
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        // Concatenar Strings en un bucle es un problema.
                        // En el próximo tema entenderemos porqué y veremos como solucionarlo
                        String aux = i + "-" + j + "-" + k + "-" + l + "\n";
                        secuencia += aux.replaceAll(numStr, charStr);
                    }
                }
            }
        }
        return secuencia;
    }
    /**
     * Genera un rectángulo de dimensiones ancho y alto utilizando
     * el carácter c
     *
     * @param ancho Ancho del rectángulo
     * @param alto Alto del rectángulo
     * @param c Carácter que se utilizará
     * @return El rectángulo generado
     */
    public static String generaRectangulo(int ancho, int alto, char c) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                result.append(c);
            }
            result.append("\n");
        }
        return result.toString();
    }


    //DNI
    public static int solicitarDNI(Scanner sc) {
        int dni = -1; // Valor inicial inválido
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Indica tu DNI (solo números): ");
                dni = Integer.parseInt(sc.nextLine()); // Leer entrada del usuario
                if (dni < 0 || dni > 99999999) { // Verificar rango válido para DNI
                    System.out.println("El DNI debe ser un número entre 0 y 99999999. Intenta de nuevo.");
                } else {
                    entradaValida = true; // Salir del bucle si la entrada es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce solo números.");
            }
        }

        return dni;
    }

    /**
     * Calcula el NIF a partir del dni recibido como parámetro
     *
     * @param dni El dni a calcular
     * @return El NIF correspondiente al dni indicado
     */
    public static String calcularNIF(int dni) {
        return String.valueOf(dni) + obtenerLetraDNI(dni);
    }

    /**
     * Obtiene la letra del NIF que le corresponde al dni indicado
     *
     * @param dni El dni
     * @return La letra que le corresponde al dni indicado
     */
    public static char obtenerLetraDNI(int dni) {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posLetra = dni % 23;
        return tabla.charAt(posLetra);
    }
    /**
     * Obtiene el número de la suerte a partir de la fecha indicada
     *
     * @param fecha Fecha a partir de la que obtenemos el número de la suerte
     * @return El número de la suerte calculado
     */
    public static int luckyNumber(String fecha) { // formater asi  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        int res = 0;
        String resString = "";
        for (int i = 0; i < fecha.length(); i++) {
            if (Character.isDigit(fecha.charAt(i))) {
                res +=  Character.getNumericValue(fecha.charAt(i));
            }
        }
        while (res >= 10) {
            resString = String.valueOf(res);
            res = 0;
            for (int i = 0; i < resString.length(); i++) {
                res += Character.getNumericValue(resString.charAt(i));
            }
        }
        return res;
    }



}
