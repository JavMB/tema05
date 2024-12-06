package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = sc.nextLine();


        System.out.println(devolverStringImpares(frase));

    }

    /**
     *
     * @param frase frase normal
     * @return fraes con solo los caracteres en las posiciones impares
     */
    public static String devolverStringImpares(String frase) {
        StringBuilder impares = new StringBuilder();

        for (int i = 0; i < frase.length(); i+=2) {
            impares.append(frase.charAt(i));

        }
        return impares.toString();


    }
}
