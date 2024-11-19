package com.javiermengual.tema05.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Dime el num a introducir");
            array[i]=sc.nextInt();
        }

        for (int j : array) {
            System.out.println(j);
        }


    }
}
