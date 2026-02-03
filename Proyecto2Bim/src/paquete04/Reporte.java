/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author daigo
 */
public class Reporte {

    public static String generarResumenSemanal(
            int []registro,
            double promedioSemanal) {

        String resumen = "RESUMEN SEMANAL\n";

        for (int i = 0; i < registro.length; i++) {
            resumen = String.format(
                    "%sDía %d: %d calorias\n",
                    resumen,
                    i + 1,
                    registro[i]
            );
        }

        resumen = String.format(
                "%sPromedio semanal: %.2f calorias\n",
                resumen,
                promedioSemanal
        );

        return resumen;
    }

    public static void generarReporteFinal(
            String nombre,
            int edad,
            double peso,
            double estatura,
            String sexo,
            double recomendacion,
            double promedio,
            String comparacion,
            String resumen) {

        String reporte = "";

        reporte += "CONTROL SEMANAL DE ALIMENTACION\n\n";

        reporte = String.format(
                "%sDATOS DEL USUARIO\n"
                + "Nombre: %s\n"
                + "Edad: %d años\n"
                + "Peso: %.2f kg\n"
                + "Estatura: %.2f m\n"
                + "Sexo: %s\n\n",
                reporte,
                nombre,
                edad,
                peso,
                estatura,
                sexo
        );

        reporte = String.format(
                "%sRECOMENDACION CALORICA DIARIA: %.2f calorias\n\n",
                reporte,
                recomendacion
        );

        reporte = String.format("%s%s\n", reporte, resumen);

        reporte = String.format(
                "%sANALISIS FINAL\n%s\n",
                reporte,
                comparacion
        );

        System.out.printf("%s", reporte);
    }
}
