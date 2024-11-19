package com.javiermengual.tema05.arrays;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime el num a introducir");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%d\t", array[i]);

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }


    }
}
