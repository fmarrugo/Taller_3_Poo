/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Usuario
 */
public class Bitacora {
    private static final String RUTA = "bitacora.txt";
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public void registrar(String mensaje) throws IOException{
        String fecha = LocalDateTime.now().format(formato);
        String registro = "[" + fecha + "] " + mensaje;
        
        try (FileWriter fw = new FileWriter(RUTA, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw)) {
            
            bw.write(registro);
            bw.newLine();
        }
    }
    
    public List<String> leer() throws IOException{
        return Files.readAllLines(
                Path.of(RUTA),
                StandardCharsets.UTF_8
        );
    }
    
    public int contar(String palabra) throws IOException{
        int contador = 0;
        for (String linea : leer()){
            if (linea.toLowerCase(Locale.ROOT)
                    .contains(palabra.toLowerCase(Locale.ROOT))){
                contador++;
            }
        }
        return contador;
    }  
}