/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author daigo
 */

public class Datos {

    static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);


    public static String obtenerNombre() {
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        return nombre;
    }

    public static int obtenerEdad() {
        int edad;
        do {
            System.out.print("Ingrese su edad (1 - 120): ");
            edad = entrada.nextInt();
        } while (edad < 1 || edad > 120);
        return edad;
    }

    public static double obtenerPeso() {
        double peso;
        do {
            System.out.print("Ingrese su peso en kg (1 - 300): ");
            peso = entrada.nextDouble();
        } while (peso < 1 || peso > 300);
        return peso;
    }

    public static String obtenerSexo() {
        String sexo;
        do {
            System.out.print("Ingrese su sexo (M/F): ");
            sexo = entrada.next().toUpperCase();
        } while (!sexo.equals("M") && !sexo.equals("F"));
        return sexo;
    }

    public static double obtenerEstatura() {
        double estatura;
        do {
            System.out.print("Ingrese su estatura en metros (0.50 - 2.50): ");
            estatura = entrada.nextDouble();
        } while (estatura < 0.50 || estatura > 2.50);
        return estatura;
    }
}
