package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        char numero=sc.next().charAt(0);
        System.out.println("Dime una letra");
        char letra=sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {

                for (int k = 0; k <= 9; k++) {

                    for (int l = 0; l <= 9; l++) {

                        sb.setLength(0); // Limpia el StringBuilder
                        sb.append(i+"-").append(j+"-").append(k+"-").append(l);


                        System.out.println(sustituirLetra(numero,letra,sb));
                    }

                }

            }

        }

    }

    /**
     *
     * @param num numero que sustituiremls
     * @param letra letra por la cual sustituiremos al numero
     * @param sb Stringbuilder que utilizamos
     * @return
     */
    public static StringBuilder sustituirLetra(char num,char letra,StringBuilder sb){
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == num) {
                sb.replace(i, i + 1, String.valueOf(letra));
            }
        }
        return sb;


    }
}