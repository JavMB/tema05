package com.javiermengual.tema05.arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime el carácter a introducir:");
            array[i] = sc.next().charAt(0); // Lee un carácter desde la entrada
        }

        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i] + "es impar");
        }
        System.out.println();

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i] + "es par");
        }
    }
}
