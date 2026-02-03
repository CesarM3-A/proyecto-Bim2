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

    // 1️⃣ FUNCIÓN: cantidad de alimentos
    public static int obtenerCantidadAlimentos(int dia) {
        System.out.printf("\n--- Día %d ---\n", dia + 1);
        System.out.print("¿Cuántos alimentos consumió hoy?: ");
        return entrada.nextInt();
    }

    // 2️⃣ FUNCIÓN: nombres de alimentos
    public static String[] obtenerNombresAlimentos(int cantidad) {
        entrada.nextLine(); // limpiar buffer
        String[] nombres = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Nombre del alimento %d: ", i + 1);
            nombres[i] = entrada.nextLine();
        }

        return nombres;
    }

    // 3️⃣ FUNCIÓN: calorías de alimentos
    public static double[] obtenerCaloriasAlimentos(String[] nombres) {
        double[] calorias = new double[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Calorías de %s: ", nombres[i]);
            calorias[i] = entrada.nextDouble();
        }

        return calorias;
    }

    public static double obtenerPromedioSemanal(double[][] calorias) {
        double suma = 0;

        for (int d = 0; d < calorias.length; d++) {
            for (int i = 0; i < calorias[d].length; i++) {
                suma += calorias[d][i];
            }
        }

        return suma / 7;
    }

    public static String compararDatos(double promedio, double recomendacion) {
        if (promedio <= recomendacion) {
            return "Buen trabajo. Cumples con tu recomendación calórica diaria.";
        } else {
            return "Atención. Superas tu recomendación calórica diaria.";
        }
    }
}

