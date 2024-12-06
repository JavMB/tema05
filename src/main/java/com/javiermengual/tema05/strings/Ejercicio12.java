package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        final String s1="es";
        final String s2="por";
        final String s3="*";

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena=sc.nextLine();
        sc.close();

        System.out.println(remplazarSubCadenas(cadena,s1,s2));

        System.out.println(remplazarDigitos(cadena,s3));


    }
    public static String remplazarSubCadenas(String cadena,String objetivo,String remplazo){
        return cadena.replace(objetivo,remplazo);

    }
    public static String remplazarDigitos(String cadena,String c){
        return cadena.replaceAll("\\d",c);

    }
}
