package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");
        String palabraMasLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("Palabra más larga: " + palabraMasLarga);
        System.out.println("Longitud: " + palabraMasLarga.length());

        scanner.close();
    }
}
