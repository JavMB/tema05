package com.javiermengual.tema05.arrays.bidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public enum Ficha {
        O, X
    }

    public enum Jugador {
        PLAYER1, PLAYER2

    }

    public static void reset() {
        Random random = new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }

        }
        Jugador[] valoresJugador = Jugador.values();
        turnoActual = valoresJugador[random.nextInt(0, valoresJugador.length)];
    }

    public static void play() {
        boolean valido;
        boolean partidaFinalizada=false;
        char fila = ' ', columna = ' ';
        System.out.println(tableroToString(tablero));
        System.out.println();
        do {

            do {
                System.out.println("Turno " + turnoActual + "(" + getFichaJugador(turnoActual) + ")");
                System.out.println("Jugada?");
                String posicion = scanner.nextLine().toUpperCase();

                valido = posicion.length() == 2;
                if (!valido) {
                    System.err.println("La longitud del texto debe ser de 2 caracteres");
                    continue;
                }
                fila = posicion.charAt(0);
                columna = posicion.charAt(1);

                valido = (fila >= 'A' && fila <= 'C') && (columna >= '1' && columna <= '3');

                if (!valido) {
                    System.err.println("Debe indicar la fila(letra) y la columna.");
                    continue;
                }
                valido = esJugadaValida(fila, Character.getNumericValue(columna));

                if (!valido) {
                    System.err.println("Esa posicion ya esta ocupada");
                    continue;
                }


            } while (!valido);

            tablero[getFilaReal(fila)][getColumnaReal(columna)] = getFichaJugador(turnoActual);

            if (esJugadaGanadora(getFilaReal(fila),getColumnaReal(columna),getFichaJugador(turnoActual))) {
                reset();
                partidaFinalizada=true;
            }

        }while (!partidaFinalizada);
    }


    private static int getFilaReal(char fila) {
        return fila - 'A';

    }

    private static int getColumnaReal(int columna) {
        return columna - 1;

    }


    public static boolean esJugadaValida(char fila, int columna) {
        int filaReal = getFilaReal(fila);
        int columnaReal = getColumnaReal(columna);

        return tablero[filaReal][columnaReal] == null;
    }

    private static Ficha getFichaJugador(Jugador jugador) {
        Ficha[] fichas = Ficha.values();
        return fichas[jugador.ordinal()];
    }

    public static String tableroToString(Ficha[][] tablero) {
        StringBuilder sb = new StringBuilder();
        //sb.append(String.format("%4s",))


        for (int i = 0; i < tablero.length; i++) {
            sb.append("|---|---|---|\n");

            for (int j = 0; j < tablero[i].length; j++) {
                sb.append("| ").append(tablero[i][j] == null ? " " : tablero[i][j]).append(" ");

            }
            sb.append("|\n");
        }
        sb.append("|---|---|---|\n");
        return sb.toString();
    }

    public static boolean esJugadaGanadora(int fila, int columna, Ficha fichaJugador) {
        int contador3enRaya = 0;

        if ((tablero[0][0].equals(fichaJugador) && tablero[1][1].equals(fichaJugador) && tablero[2][2].equals(fichaJugador)
        ) || tablero[0][2].equals(fichaJugador) && tablero[1][1].equals(fichaJugador) && tablero[2][0].equals(fichaJugador)) {
            return true;
        } else {
            for (int i = 0; i < tablero[fila].length; i++) {
                if (tablero[fila][i].equals(fichaJugador)) {
                    contador3enRaya++;
                }
            }
            contador3enRaya=0;
            for (int i = 0; i < tablero.length; i++) {

                if (tablero[i][columna].equals(fichaJugador)) {
                    contador3enRaya++;
                }

            }
        }


        return contador3enRaya == 3 ;

    }

    private static Ficha[][] tablero;
    private static final int FILAS = 3;
    private static final int COLUMNAS = 3;
    private static Jugador turnoActual;
    private static Scanner scanner;

    public static void main(String[] args) {
        tablero = new Ficha[FILAS][COLUMNAS];
        scanner = new Scanner(System.in);
        char[] xd = new char[]{'h', 'o','l','a'};

        String pepe=  String.copyValueOf(xd);

        scanner.close();
    }


}
