package com.javiermengual.tema05.strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        int sumaFecha = obtenerSumaFechaNacimiento();

        System.out.printf("Tu luckynumber es %d", luckyNumber(sumaFecha));


    }

    /**
     * @param sumaedad recibe la suma de su edad como entero
     * @return devuelve el lucky number calculado
     */
    public static int luckyNumber(int sumaedad) {
        String num = String.valueOf(sumaedad); //hago un string con la lucky de la edad
        int lucky = 0; //

        for (int i = 0; i < num.length(); i++) {
            lucky = lucky + Character.getNumericValue(num.charAt(i));
        }

        // Mientras que el lucky number resultande tenga mas de 1 digito
        // llamo de nuevo a la funcion.

        while (lucky > 9) {
            lucky = luckyNumber(lucky);
        }

        return lucky;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario
     *
     * @return devuelve la suma de dia mes y año
     */
    public static int obtenerSumaFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Por favor, ingresa tu fecha de nacimiento (dd/MM/yyyy):");
        String input = scanner.nextLine();
        scanner.close();

        LocalDate fechaNacimiento = LocalDate.parse(input, formatter);

        int dia = fechaNacimiento.getDayOfMonth();
        int mes = fechaNacimiento.getMonthValue();
        int anio = fechaNacimiento.getYear();

        return dia + mes + anio;
    }
}

