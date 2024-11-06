package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine().toLowerCase();

        int vocales = frase.replaceAll("[^aeiou]", "").length();
        int consonantes = frase.replaceAll("[^a-z]", "").replaceAll("[aeiou]", "").length();

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }
    }

