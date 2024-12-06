package com.javiermengual.tema05.arrays;


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numalturas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas altuas introduciras");
        numalturas = sc.nextInt();
        sc.close();

        double[] array = new double[numalturas];
        Ejercicio01.solicitarDatosArray(array);
       double[]arrayFiltrada= Ejercicio4.filtrarArray(array,1.74);


        System.out.printf("Esta es la media de las alturas: %.2fm", Ejercicio4.calcularMediaArray(array));
        System.out.printf("Tenemos %d alturas superiores a 1.74m la media española",arrayFiltrada.length);
    }


}
