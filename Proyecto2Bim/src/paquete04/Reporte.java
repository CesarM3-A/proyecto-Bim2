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

    public static String generarReporteCompleto(
            String nombre,
            int edad,
            double peso,
            double estatura,
            String sexo,
            double recomendacion,
            double promedio,
            String comparacion,
            String[][] nombres,
            double[][] calorias) {

        String reporte = "";

        reporte += "CONTROL SEMANAL DE ALIMENTACIÓN\n\n";

        reporte += String.format(
                "DATOS DEL USUARIO\n" +
                "Nombre: %s\n" +
                "Edad: %d años\n" +
                "Peso: %.2f kg\n" +
                "Estatura: %.2f m\n" +
                "Sexo: %s\n\n",
                nombre, edad, peso, estatura, sexo
        );

        reporte += String.format(
                "Recomendación calórica diaria: %.2f calorías\n\n",
                recomendacion
        );

        reporte += "RESUMEN SEMANAL\n";

        for (int d = 0; d < nombres.length; d++) {
            reporte += String.format("\nDía %d:\n", d + 1);

            for (int i = 0; i < nombres[d].length; i++) {
                reporte += String.format(
                        "%s: %.2f calorías\n",
                        nombres[d][i],
                        calorias[d][i]
                );
            }
        }

        reporte += String.format(
                "\nPromedio semanal: %.2f calorías\n\n",
                promedio
        );

        reporte += "ANÁLISIS FINAL\n";
        reporte += comparacion + "\n";

        return reporte;
    }

    public static void imprimirReporte(String reporte) {
        System.out.printf("%s", reporte);
    }
}
