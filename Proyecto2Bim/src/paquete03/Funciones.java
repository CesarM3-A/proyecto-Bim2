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

    public static double obtenerRecomendacion(
            int edad,
            double peso,
            double estatura,
            String sexo) {

        double recomendacion;
        double estaturaCm = estatura * 100;

        if (sexo.equals("M")) {
            recomendacion = (10 * peso) + (6 * estaturaCm) - (5 * edad) + 5;
        } else {
            recomendacion = (10 * peso) + (6 * estaturaCm) - (5 * edad) - 161;
        }

        return recomendacion;
    }

    public static int[] alimentosConsumidos() {
        int[] registroSemanal = new int[7];

        for (int dia = 0; dia < 7; dia++) {
            System.out.printf("\nDía %d\n", dia + 1);
            System.out.print("¿Cuántos alimentos consumió hoy?: ");
            int numeroAlimentos = entrada.nextInt();
            entrada.nextLine();

            String[] nombres = nombreAlimento(numeroAlimentos);
            int totalCalorias = obtenerCalorias(numeroAlimentos, nombres);

            registroSemanal[dia] = totalCalorias;
        }

        return registroSemanal;
    }

    public static String[] nombreAlimento(int cantidad) {
        String[] alimentos = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Ingrese nombre del alimento %d: ", i + 1);
            alimentos[i] = entrada.nextLine();
        }

        return alimentos;
    }

    public static int obtenerCalorias(int cantidad, String[] alimentos) {
        int totalCalorias = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Ingrese calorías de %s: ", alimentos[i]);
            int calorias = entrada.nextInt();
            totalCalorias += calorias;
        }
        entrada.nextLine();

        return totalCalorias;
    }

    public static double obtenerPromedioSemanal(int[] registro) {

        int suma = 0;

        for (int i = 0; i < registro.length; i++) {
            suma += registro[i];
        }

        return (double) suma;
    }

    public static String compararDatos(
            double promedioSemanal,
            double recomendacionCaloricaDiaria) {

        String mensaje;

        if (promedioSemanal <= recomendacionCaloricaDiaria) {
            mensaje
                    = "Buen trabajo. En promedio cumples con tu recomendación calorica diaria.";
        } else {
            mensaje
                    = "Atencion. En promedio superas tu recomendación calorica diaria.";
        }

        return mensaje;
    }
}
