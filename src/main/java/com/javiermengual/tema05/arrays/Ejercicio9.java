package com.javiermengual.tema05.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static com.javiermengual.tema05.arrays.Ejercicio02.Paridad.PAR;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[]array= new int[10];
        int opcion;
        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> Ejercicio6.rellenarArray(array,0,50);
                case 2 -> System.out.println(Arrays.toString(array));
                case 3 -> imprimirMultiplos(array,2);
                case 4 ->imprimirMultiplos(array,3);


            }
        } while (opcion != 0);


    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                MENÚ PRINCIPAL
                ==============
                1.-Rellenar array.
                2.-Visualizar contenido del array
                3.-Visualizar contenido par.
                4.-Visualizar contenido múltiplo de 3
                0.-Salir del menú.
                Selecciona una opción:""");
        return sc.nextInt();


    }

    /**
     *
     * @param array recibe un array de enteros
     * @param numero recibe un numero que es el multiplo a imprimir
     */
    public static void imprimirMultiplos(int[] array,int numero) {
        String formato = "%-10d";
        for (int entero : array) {
            if (entero % numero == 0) {

                System.out.printf(formato + " es multiplo de "+numero+"\n", entero);
            }
        }

    }


}
