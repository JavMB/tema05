package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase= sc.next();

        System.out.println(capitalizarPrimeraLetra(frase));



    }

    /**
     *
     * @param frase frase que vamos a capitalizar
     * @return frase capitalizada
     */
    public static String capitalizarPrimeraLetra(String frase) {

        return frase.substring(0, 1).toUpperCase() + frase.substring(1);
    }

}
