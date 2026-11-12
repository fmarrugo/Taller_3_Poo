/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_4;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {
    
    public static void main(String[] args){
        Dispositivo[] dispositivos = {
                new Smartphone(50, "Samsung", "A15-5g", 1000000),
                new Smartphone(55, "Samsung", "A24", 1200000),
                new Camara(25, "Sony", "Alpha a6400 (ILCE-6400K)", 3200000)
        };
        
        int maxMegapixeles = 0;
        
        for(Dispositivo d : dispositivos){
            d.describir();
            
            if(d instanceof Fotografiable){
                Fotografiable f = (Fotografiable) d;
                f.tomarFoto();
                if(maxMegapixeles < f.getMegapixeles()){
                    maxMegapixeles = f.getMegapixeles();
                }
            }
            
            if(d instanceof Llamable){
                Llamable l = (Llamable)d;
                l.llamar("3116258286");
                l.colgar();
            }
            System.out.println("\n");
        }
        System.out.println("Mayor resolución: "
                + maxMegapixeles + " MP");
    } 
}
