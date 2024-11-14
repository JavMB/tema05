package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int alto, ancho;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el alto");
        alto = sc.nextInt();
        System.out.println("Dime el ancho");
        ancho = sc.nextInt();
        sc.nextLine();

        System.out.println("dime un caracter");
        c = sc.next().charAt(0);

        rectangulo(ancho,alto,c);


    }

    /**
     *
     * @param ancho  anchura
     * @param alto altura
     * @param c caracter
     */
    public static void rectangulo(int ancho, int alto, char c) {

        for (int i = 0; i <=alto; i++) {

            for (int j = 0; j <= ancho; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}

