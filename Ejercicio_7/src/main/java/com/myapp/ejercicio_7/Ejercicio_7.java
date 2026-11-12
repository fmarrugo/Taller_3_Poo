/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_7;

import static com.myapp.ejercicio_7.Promedio.promedio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("¿Cuántas notas? ");
            int n = Integer.parseInt(sc.nextLine());
            
            if(n <= 0){
                throw new IllegalArgumentException(
                    "Debe ingresar una cantidad mayor que cero"
                );
            }
            
            double[] notas = new double[n];
            for(int i = 0; i < n; i++) {

                System.out.print("Digite la nota " + (i + 1) + ": ");
                notas[i] = Double.parseDouble(sc.nextLine());
            }
            System.out.println("Promedio: " + promedio(notas));
            
        }catch(NumberFormatException e){
            System.out.println("Dato inválido: debe ingresar números.");
        }catch(IllegalArgumentException e){
             System.out.println("Error: " + e.getMessage());
        }
    }
}