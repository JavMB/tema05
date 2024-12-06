package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = sc.nextLine();

        if (esPalindroma(frase)){
            System.out.println("Tu frase es palindroma");
        }else {
            System.out.println("No es palindroma");
        }


    }

    /**
     * @param frase frase para comprobar
     * @return boolean depende si es palindroma o no
     */
    public static boolean esPalindroma(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString().equalsIgnoreCase(frase);

    }
}
