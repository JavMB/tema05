package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        int numeroPalabras = contarPalabras(frase);

        System.out.println("Número de palabras: " + numeroPalabras);

        scanner.close();
    }

    /**
     *
     * @param frase frase para contar sus palabras
     * @return numero de palabras de esta frase
     */
    public static int contarPalabras(String frase) {

        // Eliminar espacios en blanco al inicio y al final
        frase = frase.trim();

        if (frase.isEmpty()) {
            return 0;
        }


        return frase.split(" ").length;
    }
}
