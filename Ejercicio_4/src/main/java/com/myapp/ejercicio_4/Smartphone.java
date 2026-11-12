/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_4;

/**
 *
 * @author Usuario
 */
public class Smartphone extends Dispositivo implements Llamable, Fotografiable{
    private int megapixeles;

    public Smartphone(int megapixeles, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.megapixeles = megapixeles;
    }
    
    @Override
    public String funcion() {
        return "Llamadas y fotos";
    }
    

    @Override
    void describir() {
        System.out.println("Telefono: " + marca + " de "+ megapixeles + " Megapixeles"+
                "\nModelo: " + modelo + "\nPrecio $"+ precio);
    }

    @Override
    public void llamar(String numero) {
        System.out.println(modelo + " llamando a: " + numero);
    }

    @Override
    public void colgar() {
        System.out.println("Colgando..");
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando foto.. flash");
    }

    @Override
    public int getMegapixeles() {
      return megapixeles;  
    }
    
}
