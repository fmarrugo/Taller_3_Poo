/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_4;

/**
 *
 * @author Usuario
 */
public class Camara extends Dispositivo implements Fotografiable{
    private int megapixeles;

    public Camara(int megapixeles, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.megapixeles = megapixeles;
    }

    @Override
    void describir() {
        System.out.println("Camara: " + marca + " de "+ megapixeles + " Megapixeles"+
                "\nModelo: " + modelo + "\nPrecio $"+ precio);
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
