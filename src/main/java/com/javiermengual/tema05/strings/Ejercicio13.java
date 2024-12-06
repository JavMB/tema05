package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println(strMasLarga());
            case 2 -> System.out.println(strMasCorta());
            case 3 -> System.out.println(numVocales());
            case 0 -> {
            }

            default -> System.err.println("Error");

        }


    }

    public static void mostrarMenu() {
        System.out.println("""
                MENÚ PRINCIPAL
                ==============
                1. Palabra más larga.
                2. Palabra más corta.
                3. Número de vocales.
                ------------------------------------
                0. Salir""");
    }

    public static String strMasLarga() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera palabra");
        String palabra1 = sc.next();
        System.out.println("Dime la segunda");
        String palabra2 = sc.next();
        System.out.println("Dime la tercera");
        String palabra3 = sc.next();

        if (palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() > palabra3.length()) {
            return palabra2;

        } else if (palabra3.length()>palabra2.length()&&palabra3.length()>palabra1.length()){
            return palabra3;
        }else {
            return "son iguales";
        }
    }

    public static String strMasCorta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera palabra");
        String palabra1 = sc.next();
        System.out.println("Dime la segunda");
        String palabra2 = sc.next();
        System.out.println("Dime la tercera");
        String palabra3 = sc.next();
        sc.close();
        if (palabra1.length() < palabra2.length() && palabra1.length() < palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() < palabra3.length()) {
            return palabra2;

        } else {
            return palabra3;
        }
    }

    public static int numVocales() {
        int contadorVocales = 0;
        final char vocal1 = 'a'; //quizas se podia hacer un enum
        final char vocal2 = 'e';
        final char vocal3 = 'i';
        final char vocal4 = 'o';
        final char vocal5 = 'u';
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la primera palabra");
        String palabra = sc.next().toLowerCase();
        sc.close();

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) == vocal1 || palabra.charAt(i) == vocal2 || palabra.charAt(i) == vocal3
                    || palabra.charAt(i) == vocal4
                    || palabra.charAt(i) == vocal5) {

                contadorVocales++;

            }

        }
        return contadorVocales;


    }

}
