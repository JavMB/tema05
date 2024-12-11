package com.javiermengual.tema05.lib;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FechaUtils {


    //******************************** INGRESAR FECHAS ********************************\\

    /**
     * Solicita una fecha al usuario en un formato dado y la devuelve como LocalDate.
     *
     * @param scanner Scanner para leer datos del usuario.
     * @param mensaje Mensaje que se mostrará al solicitar la fecha.
     * @param formato El formato esperado de la fecha (por ejemplo, "dd/MM/yyyy").
     * @return La fecha ingresada por el usuario como un objeto LocalDate.
     */
    public static LocalDate ingresarFecha(Scanner scanner, String mensaje, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDate fecha = null;

        while (fecha == null) {
            try {
                System.out.println(mensaje);
                String fechaTexto = scanner.nextLine();
                fecha = LocalDate.parse(fechaTexto, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor, use el formato: " + formato);
            }
        }
        return fecha;
    }

    /**
 * Solicita al usuario una fecha y hora en un formato dado.
 *
 * @param scanner Scanner para leer datos del usuario.
 * @param mensaje Mensaje para guiar al usuario.
 * @param formato El formato esperado de la fecha y hora (por ejemplo, "dd/MM/yyyy HH:mm").
 * @return La fecha y hora ingresada como LocalDateTime.
 *
 * <p>Ejemplo de formato esperado: "25/12/2024 14:30" para el formato "dd/MM/yyyy HH:mm".</p>
 */
    public static LocalDateTime ingresarFechaHora(Scanner scanner, String mensaje, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDateTime fechaHora = null;

        while (fechaHora == null) {
            try {
                System.out.println(mensaje);
                String entrada = scanner.nextLine();
                fechaHora = LocalDateTime.parse(entrada, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Intente nuevamente: " + formato);
            }
        }
        return fechaHora;
    }


        /**
     * Convierte una cadena en un objeto LocalDate utilizando un formato dado.
     *
     * @param fechaTexto La cadena que representa la fecha (por ejemplo, "25/12/2024").
     * @param formato El formato esperado de la cadena (por ejemplo, "dd/MM/yyyy").
     * @return Un objeto LocalDate representando la fecha.
     * @throws DateTimeParseException Si la cadena no coincide con el formato.
     */
    public static LocalDate parseFecha(String fechaTexto, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return LocalDate.parse(fechaTexto, formatter);
    }

    /**
     * Convierte una cadena en un objeto LocalDateTime utilizando un formato dado.
     *
     * @param fechaHoraTexto La cadena que representa la fecha y hora (por ejemplo, "25/12/2024 14:30").
     * @param formato El formato esperado de la cadena (por ejemplo, "dd/MM/yyyy HH:mm").
     * @return Un objeto LocalDateTime representando la fecha y hora.
     * @throws DateTimeParseException Si la cadena no coincide con el formato.
     */
    public static LocalDateTime parseFechaHora(String fechaHoraTexto, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return LocalDateTime.parse(fechaHoraTexto, formatter);
    }


    //******************************** FORMATOS Y VALIDACIONES ********************************\\

    /**
     * Convierte una fecha en una cadena en el formato especificado.
     *
     * @param fecha La fecha que se desea formatear.
     * @param formato El formato deseado (ejemplo: "dd-MM-yyyy").
     * @return La fecha como cadena en el formato indicado.
     */
    public static String convertirFecha(LocalDate fecha, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return fecha.format(formatter);
    }

    /**
 * Convierte una fecha y hora en una cadena en el formato especificado.
 *
 * @param fechaHora La fecha y hora que se desea formatear.
 * @param formato El formato deseado (ejemplo: "dd-MM-yyyy HH:mm").
 * @return La fecha y hora como cadena en el formato indicado.
 */
public static String convertirFechaHora(LocalDateTime fechaHora, String formato) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
    return fechaHora.format(formatter);
}


    /**
     * Verifica si el año de una fecha es bisiesto.
     *
     * @param fecha Fecha a analizar.
     * @return true si el año es bisiesto, de lo contrario false.
     */
    public static boolean verificarBisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    //******************************** OPERACIONES DE FECHA ********************************\\

    /**
     * Calcula la diferencia en días entre dos fechas.
     *
     * @param inicio Fecha inicial.
     * @param fin Fecha final.
     * @return Número de días entre ambas fechas.
     */
    public static long calcularDias(LocalDate inicio, LocalDate fin) {
        return ChronoUnit.DAYS.between(inicio, fin);
    }

    /**
     * Añade o resta días a una fecha.
     *
     * @param fecha La fecha base.
     * @param dias Número de días a modificar (positivos o negativos).
     * @return La nueva fecha.
     */
    public static LocalDate ajustarDias(LocalDate fecha, int dias) {
        return fecha.plusDays(dias);
    }

    /**
     * Obtiene el día de la semana de una fecha específica.
     *
     * @param fecha Fecha a analizar.
     * @return Nombre del día de la semana.
     */
    public static String obtenerDiaSemana(LocalDate fecha) {
        return fecha.getDayOfWeek().toString();
    }

    //******************************** UTILIDADES ADICIONALES ********************************\\

    /**
     * Calcula la diferencia exacta entre dos fechas en años, meses y días.
     *
     * @param inicio Fecha inicial.
     * @param fin Fecha final.
     * @return Un objeto Period representando la diferencia.
     */
    public static Period calcularPeriodo(LocalDate inicio, LocalDate fin) {
        return Period.between(inicio, fin);
    }

    /**
     * Verifica si una fecha es posterior a otra.
     *
     * @param fecha1 Primera fecha.
     * @param fecha2 Segunda fecha.
     * @return true si la primera fecha es posterior a la segunda.
     */
    public static boolean esFechaPosterior(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    /**
     * Calcula la duración en horas entre dos fechas y horas.
     *
     * @param inicio Fecha y hora inicial.
     * @param fin Fecha y hora final.
     * @return Duración en horas.
     */
    public static long calcularDuracionEnHoras(LocalDateTime inicio, LocalDateTime fin) {
        return Duration.between(inicio, fin).toHours();
    }
}
