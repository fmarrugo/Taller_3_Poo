/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_7;

/**
 *
 * @author Usuario
 */
public class Promedio {
    public static double promedio(double[] notas){
        if(notas == null || notas.length == 0){
            throw new IllegalArgumentException(
                "Debe ingresar al menos una nota"
            );
        }
        double suma = 0.0;
        
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < 0 || notas[i] > 5) {
                throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
            }
            
            suma += notas[i];
        }
        return suma / notas.length;
    }
}
