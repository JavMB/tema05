package com.javiermengual.tema05.strings;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase:");
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine().toLowerCase();

        String[] arrayPalabras = frase.split("\\s+");

        for (int i = 0; i < arrayPalabras.length; i++) {
            String palabra = arrayPalabras[i];
            int vocales = palabra.replaceAll("[^aeiou]", "").length();
            int consonantes = palabra.replaceAll("[^a-z]", "").replaceAll("[aeiou]", "").length();

            System.out.println("Palabra " + (i + 1) + ": " + palabra +
                    " - Vocales: " + vocales +
                    ", Consonantes: " + consonantes);
        }


    }
}
