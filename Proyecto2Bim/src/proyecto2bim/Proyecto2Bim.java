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
        String sexo = Datos.obtenerSexo();
        double estatura = Datos.obtenerEstatura();

        double recomendacion = Funciones.obtenerRecomendacion(
                edad, peso, estatura, sexo);

        Object[] datosSemana = Funciones.registrarSemana();

        String[][] nombres = (String[][]) datosSemana[0];
        double[][] calorias = (double[][]) datosSemana[1];

        double promedio = Funciones.obtenerPromedioSemanal(calorias);
        String comparacion = Funciones.compararDatos(promedio, recomendacion);

        String reporteFinal = Reporte.generarReporteCompleto(
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

        Reporte.imprimirReporte(reporteFinal);
    }
}
