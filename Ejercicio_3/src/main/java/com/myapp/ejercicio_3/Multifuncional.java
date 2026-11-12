/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_3;

/**
 *
 * @author Usuario
 */
public class Multifuncional extends Equipo implements Imprimible, Escaneable{

    public Multifuncional(String serial) {
        super(serial);
    }

    @Override
    public void encender() {
        System.out.println("Equipo encendido");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void escanear(){
        System.out.println("Escaneando...");
    }
    
}
