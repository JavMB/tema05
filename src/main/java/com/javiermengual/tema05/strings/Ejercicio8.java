package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = sc.nextLine();
        for (int i = 0; i < cortarEspacios(frase).length ; i++) {
            System.out.printf("%s:%5d", cortarEspacios(frase)[i],contarCaracteres(cortarEspacios(frase)[i]));
            System.out.println();
        }


    }

    /**
     *
     * @param frase frase para contar caracter
     * @return devuelve el num de caracteres
     */
    public static int contarCaracteres(String frase) {
        return frase.length();
    }

    /**
     *
     * @param frase frase sin cortar
     * @return  frase cortada en forma de array
     */
    public static String[] cortarEspacios(String frase) {
        return frase.split("\\s+");
    }


}



