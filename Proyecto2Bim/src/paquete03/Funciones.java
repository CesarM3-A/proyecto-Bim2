/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Funciones {

    static Scanner entrada = new Scanner(System.in);

    public static double obtenerRecomendacion(int edad, double peso, double estatura, String sexo) {
        double estaturaCm = estatura * 100;

        if (sexo.equals("M")) {
            return (10 * peso) + (6 * estaturaCm) - (5 * edad) + 5;
        } else {
            return (10 * peso) + (6 * estaturaCm) - (5 * edad) - 161;
        }
    }

    // REGISTRO DETALLADO DIA A DIA
    public static Object[] registrarSemana() {

        String[][] nombres = new String[7][];
        double[][] calorias = new double[7][];

        for (int dia = 0; dia < 7; dia++) {
            System.out.printf("\n--- Día %d ---\n", dia + 1);

            System.out.print("¿Cuántos alimentos consumió hoy?: ");
            int cantidad = entrada.nextInt();
            entrada.nextLine();

            nombres[dia] = new String[cantidad];
            calorias[dia] = new double[cantidad];

            for (int i = 0; i < cantidad; i++) {
                System.out.printf("Nombre del alimento %d: ", i + 1);
                nombres[dia][i] = entrada.nextLine();

                System.out.printf("Calorías de %s: ", nombres[dia][i]);
                calorias[dia][i] = entrada.nextDouble();
                entrada.nextLine();
            }
        }

        return new Object[]{nombres, calorias};
    }

    public static double obtenerPromedioSemanal(double[][] calorias) {
        double suma = 0;

        for (int d = 0; d < calorias.length; d++) {
            for (int i = 0; i < calorias[d].length; i++) {
                suma += calorias[d][i];
            }
        }

        return suma / 7; // promedio diario semanal
    }

    public static String compararDatos(double promedio, double recomendacion) {
        if (promedio <= recomendacion) {
            return "Buen trabajo. Cumples con tu recomendación calórica diaria.";
        } else {
            return "Atención. Superas tu recomendación calórica diaria.";
        }
    }
}
