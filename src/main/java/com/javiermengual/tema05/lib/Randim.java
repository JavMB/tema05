package com.javiermengual.tema05.lib;

import java.util.Random;

public class Randim {

    public static double aleatorioDouble(double valorMinimo, double valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }

    public static int aleatorioEntero(int valorMinimo, int valorMaximo) {
        Random random = new Random();
        return valorMinimo + random.nextInt(valorMaximo - valorMinimo + 1);
    }


    public static String generarNifAleatorio() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        // Generar un número aleatorio de 8 dígitos en el rango de 10000000 a 99999999
        int numero = (int) (Math.random() * 90000000) + 10000000;
        int indice = numero % 23; // Obtener el índice para la letra
        return numero + "" + letras.charAt(indice); // Devolver el NIF completo
    }



}
