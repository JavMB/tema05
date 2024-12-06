package com.javiermengual.tema05.strings;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el NIF (8 dígitos y una letra): ");
        String nif = scanner.nextLine().toUpperCase();

        if (validarNIF(nif)) {
            System.out.println("El NIF es válido.");
        } else {
            System.out.println("El NIF no es válido.");
        }

        scanner.close();
    }

    /**
     *
     * @param nif recibe el nif como String
     * @return devuelve true o false depende de si se ha validado o no
     */
    public static boolean validarNIF(String nif) {
        // Verificar que el NIF tiene 9 caracteres
        if (nif.length() != 9) {
            return false;
        }

        // Verificar que los primeros 8 caracteres son dígitos
        String numeroStr = nif.substring(0, 8);
        if (!numeroStr.matches("\\d{8}")) { //8 numeros consecutivos en numeroStr
            return false;
        }

        // Obtener el número y la letra
        int numero = Integer.parseInt(numeroStr);
        char letraUsuario = nif.charAt(8);

        // Calcular la letra correcta
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numero % 23;
        char letraCalculada = letras.charAt(indice);

        // Comparar la letra calculada con la letra proporcionada por el usuario
        return letraUsuario == letraCalculada;
    }
}
