package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime una frase");
            frase = sc.nextLine();

        } while (frase.length()<3);


        for (int i = 0; i <= cortador(frase).length - 1; i++) {
            System.out.println(cortador(frase)[i]);
        }
    }

    public static String[] cortador(String frase) {
        frase = frase.trim();
        return frase.split("\\s+");
    }
}

