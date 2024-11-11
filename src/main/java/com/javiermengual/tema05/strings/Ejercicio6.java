package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = sc.nextLine();
        System.out.println(multiplicacionDeFrase(frase, 5));
    }

    public static String multiplicacionDeFrase(String frase, int numero) {
        StringBuilder fraseMultipicada = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            fraseMultipicada.append(frase);
        }
        return fraseMultipicada.toString();


    }
}
