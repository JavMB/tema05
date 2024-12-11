package com.javiermengual.tema05.bidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Ficha {
        O, X, NONE
    }
    public enum Jugador {
        PLAYER1, PLAYER2
    }

    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;
    private static Ficha[][] tablero;
    private static Jugador turnoActual;
    private static Scanner scanner;

    public static void main(String[] args) {
        tablero = new Ficha[FILAS][COLUMNAS];
        scanner = new Scanner(System.in);
        boolean partidaFinalizada;
        boolean hayGanador;
        boolean empate;
        boolean salir = false;
        do {
            reset();
            do {
                play();
                hayGanador = esJugadaGanadora(tablero, getFichaJugador(turnoActual));
                if (!hayGanador) {
                    turnoActual = siguienteTurno();
                }
                empate = !hayGanador && esTableroLleno();
                partidaFinalizada = hayGanador || empate;
            } while (!partidaFinalizada);
            if (hayGanador) {
                System.out.println("Ha ganado " + turnoActual + "!");
            } else {
                System.out.println("Empate!");
            }
            System.out.println("¿Desea jugar una nueva partida (s/n)?");
            salir = scanner.nextLine().toUpperCase().charAt(0) == 's';
        } while (!salir);


        scanner.close();
    }

    private static boolean esTableroLleno() {
        for (Ficha[] filas : tablero) {
            for (Ficha ficha : filas) {
                if (ficha.equals(Ficha.NONE)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Jugador siguienteTurno() {
        Jugador[] jugadores = Jugador.values();
        return jugadores[(turnoActual.ordinal() + 1) % jugadores.length];
    }

    private static void reset() {
        Random random = new Random();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = Ficha.NONE;
            }
        }
        Jugador[] valoresJugador = Jugador.values();
        turnoActual = valoresJugador[random.nextInt(0, valoresJugador.length)];
    }

    private static void play() {
        boolean valido;
        char fila = ' ', columna = ' ';
        System.out.println("Turno " + turnoActual + "(" + getFichaJugador(turnoActual) + ")");
        do {
            System.out.println("Jugada?");
            String posicion = scanner.nextLine().toUpperCase();
            valido = posicion.length() == 2;
            if (!valido) {
                System.err.println("La longitud del texto debe ser de 2 caracteres.");
                continue;
            }

            fila = posicion.charAt(0);
            columna = posicion.charAt(1);
            valido = (fila >= 'A' && fila <= 'C') &&
                    (columna >= '1' && columna <= '3');
            if (!valido) {
                System.err.println("Debe indicar la fila (letra) y la columna (número). Ejemplo: A2");
                continue;
            }
            valido = esJugadaValida(fila, columna);
            if (!valido) {
                System.err.println("Esa posición ya está ocupada");
                continue;
            }
        } while (!valido);
        tablero[getFilaReal(fila)][getColumnaReal(columna)] = getFichaJugador(turnoActual);
        System.out.println(tableroToString(tablero));
    }

    private static int getFilaReal(char fila) {
        return fila - 'A';
    }

    private static int getColumnaReal(char columna) {
        return Character.getNumericValue(columna) - 1;
    }

    private static boolean esJugadaValida(char fila, char columna) {
        int filaReal = getFilaReal(fila);
        int columnaReal = getColumnaReal(columna);
        return tablero[filaReal][columnaReal].equals(Ficha.NONE);
    }

    private static Ficha getFichaJugador(Jugador jugador) {
        Ficha[] fichas = Ficha.values();
        return fichas[jugador.ordinal()];
    }

    private static String tableroToString(Ficha[][] tablero) {
        StringBuilder sb = new StringBuilder();
        // sb.append(String.format("%4s", ))
        for (int i = 0; i < tablero.length; i++) {
            sb.append("|---|---|---|\n");
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append("| ").append(tablero[i][j].equals(Ficha.NONE) ? " " : tablero[i][j]).append(" ");
            }
            sb.append("|\n");
        }
        sb.append("|---|---|---|\n");
        return sb.toString();
    }

    private static boolean esJugadaGanadora(Ficha[][] tablero, Ficha ficha) {
        int contadorDiagonal1 = 0;
        int contadorDiagonal2 = 0;
        for (int i = 0; i < tablero.length; i++) {
            int contadorHorizontal = 0;
            int contadorVertical = 0;
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals(ficha)) {
                    contadorHorizontal++;
                }
                if (tablero[j][i].equals(ficha)) {
                    contadorVertical++;
                }
                if (i == j && tablero[i][j].equals(ficha)) {
                    contadorDiagonal1++;
                }
                if (j == tablero.length - 1 - i && tablero[i][j].equals(ficha)) {
                    contadorDiagonal2++;
                }
            }
            if (contadorHorizontal == tablero[i].length || contadorVertical == tablero.length) {
                return true;
            }
            // Comprobamos diagonales
            if (contadorDiagonal1 == tablero.length || contadorDiagonal2 == tablero.length) {
                return true;
            }
        }
        return false;
    }
}
