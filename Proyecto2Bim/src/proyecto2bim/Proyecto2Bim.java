/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2bim;

import paquete02.Datos;
import paquete03.Funciones;
import paquete04.Reporte;

/**
 *
 * @author daigo
 */
public class Proyecto2Bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombre = Datos.obtenerNombre();
        int edad = Datos.obtenerEdad();
        double peso = Datos.obtenerPeso();
        double estatura = Datos.obtenerEstatura();
        String sexo = Datos.obtenerSexo();

        double recomendacion = Funciones.obtenerRecomendacion(
                edad, peso, estatura, sexo
        );

        
        String[][] nombres = Funciones.registrarSemana();
        double[][] calorias = Funciones.obtenerCaloriasSemana();

        double promedio = Funciones.obtenerPromedioSemanal(calorias);
        String comparacion = Funciones.compararDatos(promedio, recomendacion);

        String reporte = Reporte.generarReporteCompleto(
                nombre,
                edad,
                peso,
                estatura,
                sexo,
                recomendacion,
                promedio,
                comparacion,
                nombres,
                calorias
        );

        Reporte.imprimirReporte(reporte);
    }
}
