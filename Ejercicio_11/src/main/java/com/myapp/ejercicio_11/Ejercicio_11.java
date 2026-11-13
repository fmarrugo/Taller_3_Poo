/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

/**
 *
 * @author Usuario
 */
public class Ejercicio_11 {

    public static void main(String[] args) throws IOException {        
        String archivoEntrada = "notas.csv";
        String archivoSalida = "reporte.csv";
        
        int procesados = 0;
        int errores = 0;
        int numeroLinea = 0;
        
        try (
            BufferedReader br = Files.newBufferedReader(
                    Path.of(archivoEntrada),
                    StandardCharsets.UTF_8
            );

            BufferedWriter bw = Files.newBufferedWriter(
                    Path.of(archivoSalida),
                    StandardCharsets.UTF_8
            )
        ){
            bw.write("codigo,nombre,promedio,estado");
            bw.newLine();
            
            String linea = br.readLine();

            if(linea != null){
                numeroLinea++;
            }
            while((linea = br.readLine()) != null){
                numeroLinea++;
                try{
                    String[] datos = linea.split(",",-1);
                    if(datos.length != 5){
                        throw new IllegalArgumentException("Debe contener 5 columnas");
                    }
                    
                    String codigo = datos[0].trim();
                    String nombre = datos[1].trim();
                    
                    double nota1 = Double.parseDouble(datos[2].trim());
                    double nota2 = Double.parseDouble(datos[3].trim());
                    double nota3 = Double.parseDouble(datos[4].trim());
                    
                    if(nota1 < 0 || nota1 > 5|| nota2 < 0 || nota2 > 5|| nota3 < 0 || nota3 > 5){

                        throw new IllegalArgumentException("Las notas deben estar entre 0 y 5");
                    }                    
                    double promedio = (nota1 + nota2 + nota3)/3;
                    String estado;
                    
                    if(promedio >= 3.0){
                        estado = "APROBADO";
                    }else{
                        estado = "REPROBADO";
                    }
                    
                     bw.write(
                            codigo + ","
                            + nombre + ","
                            + String.format(Locale.US, "%.2f", promedio)
                            + ","
                            + estado
                    );
                    bw.newLine();
                    procesados++;
                }catch (NumberFormatException e){
                    errores++;
                    System.out.println("Error en línea " + numeroLinea+ ": una nota no es numérica.");
                }catch (IllegalArgumentException e){
                    System.out.println("Error en línea " + numeroLinea+ ": " + e.getMessage());
                }
            }
            System.out.println("\nPROCESO FINALIZADO");
            System.out.println("Registros procesados: " + procesados);
            System.out.println("Registros con error: " + errores);
            System.out.println("Archivo generado: " + archivoSalida);
        }catch (IOException e){
             System.out.println("Error al trabajar con los archivos: "+ e.getMessage());
        }        
    }
}
