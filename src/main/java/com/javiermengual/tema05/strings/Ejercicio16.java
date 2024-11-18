package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int dni = solicitarDNI();
        System.out.println(calcularNif(calcularLetraDNI(dni), dni));


    }


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
        return dni;

    }

    public static String calcularNif(char letraFinal, int dni) {
        return " " + dni + letraFinal;

    }

    public static char calcularLetraDNI(int dni) {
        final String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numeroDni = dni % 23;

        return letrasDni.charAt(numeroDni);
    }
}
