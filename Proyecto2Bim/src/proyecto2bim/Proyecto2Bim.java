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

    double recomendacionCaloricaDiaria =
            Funciones.obtenerRecomendacion(edad, peso, estatura, sexo);

    
    int[] registroAlimentos = Funciones.alimentosConsumidos();

    double promedioSemanal =
            Funciones.obtenerPromedioSemanal(registroAlimentos);

    String comparacion =
            Funciones.compararDatos(promedioSemanal, recomendacionCaloricaDiaria);

    String resumenSemanal =
            Reporte.generarResumenSemanal(registroAlimentos, promedioSemanal);

    Reporte.generarReporteFinal(
            nombre,
            edad,
            peso,
            estatura,
            sexo,
            recomendacionCaloricaDiaria,
            promedioSemanal,
            comparacion,
            resumenSemanal
    );
}
}
