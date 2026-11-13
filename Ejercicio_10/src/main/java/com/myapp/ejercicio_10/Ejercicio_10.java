/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Ejercicio_10 {

    public static void main(String[] args) throws IOException {
        Bitacora bitacora = new Bitacora();
        try{
            bitacora.registrar("Produccion dia 1");
            bitacora.registrar("Error en mustras");
            bitacora.registrar("Categorizando muestras");
            bitacora.registrar("Error de muestras");
            
            System.out.println("Contenido de la bitacora: ");
            List<String> eventos = bitacora.leer();
            
            for(String evento: eventos){
                System.out.println(evento);
            }
            
            int errores = bitacora.contar("Error");
            System.out.println("\nTotal de errores: " + errores);
            
            try {
                BufferedReader br = new BufferedReader(
                        new FileReader(
                                "prueba_fernando.txt",
                                StandardCharsets.UTF_8
                        )
                );

                br.close();
            }catch (FileNotFoundException e) {
                System.out.println("Error: el archivo prueba_fernando.txt no existe.");
            }
        }catch(IOException e){
            System.out.println("Error al manejar archivos: "+ e.getMessage());
        }
    }
}
