package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int dni = solicitarDNI();
        System.out.println(calcularNif(calcularLetraDNI(dni), dni));


    }

    /**
     *
     * @return devuelve un dni valido
     */
    public static int solicitarDNI() {
        final int numsDNI = 8;
        boolean dniValido = false;
        int dni = 0;
        Scanner sc = new Scanner(System.in);

        while (!dniValido) {
            System.out.println("Dime tu DNI");
            dni = sc.nextInt();
            if (dni > 9999999) {
                dniValido = true;
            }
        }
        sc.close();
        return dni;

    }

    /**
     *
     * @param letraFinal le pasamos la letra final del nif
     * @param dni pasamos los numeros del dni
     * @return nos devueve todo junto como el nif
     */
    public static String calcularNif(char letraFinal, int dni) {
        return " " + dni + letraFinal;

    }

    /**
     *
     * @param dni le pasamos los numeros del dni
     * @return nos devuelve la letra correspondiente
     */
    public static char calcularLetraDNI(int dni) {
        final String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDni = dni % 23;

        return letrasDni.charAt(numeroDni);
    }
}
