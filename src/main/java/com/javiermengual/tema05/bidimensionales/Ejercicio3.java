package com.javiermengual.tema05.bidimensionales;

public class Ejercicio3 {
    public enum Ficha {
        X, O, VACIO
    }

    public enum Jugador {
        JUGADOR1, JUGADOR2
    }

    public static Ficha TURNO = Ficha.X;
    public static Ficha[][] tablero = new Ficha[3][3];

    public static void main(String[] args) {


    }

    public static void resetTablero(Ficha[][] tablero) {
        for (Ficha[] fila : tablero) {

            for (Ficha ficha : fila) {

                ficha = Ficha.VACIO;

            }

        }
    }

    public static void cambiarTurnos() {
        Ficha[] fichas = Ficha.values(); // Obtenemos todos los valores del enum
        int siguienteIndice = (TURNO.ordinal() + 1) % 2; // Alterna entre índice 0 (X) y 1 (O)
        TURNO = fichas[siguienteIndice]; // Cambia el turno
    }


}
