package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        mostarInformacionNombre(crearNombreCompleto());

    }


    public static String crearNombreCompleto() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        sb.append(sc.next() + " ");
        System.out.println("Dime tu apellido");
        sb.append(sc.next() + " ");
        System.out.println("Dime tu segundo apellido");
        sb.append(sc.next() + " ");
        sc.close();

        return sb.toString();
    }

    public static void mostarInformacionNombre(String nombre) {
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.length());

        if (nombre.length() > 4) {
            System.out.println(nombre.substring(0, 5));
        }
        if (nombre.length() > 1) {
            System.out.println(nombre.substring(nombre.length() - 3));
        }

        int numeroOcurrencias = 0;
        char ultimoCaracter = nombre.charAt(nombre.length() - 1);
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ultimoCaracter) {
                numeroOcurrencias++;

            }

        }
        int numeroOcurrenciasb = 0;
        char primerCaracter = nombre.charAt(nombre.charAt(0));
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == primerCaracter) {
                numeroOcurrenciasb++;

            }

        }

        System.out.println("**" + nombre + "**");

        for (int i = nombre.length() - 1; i > 0; i--) {
            System.out.println(nombre.charAt(i));
            

        }


    }
}
