/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myapp.ejercicio_3;

/**
 *
 * @author Usuario
 */
public interface Escaneable {
    void escanear();
    default void estado() {
        System.out.println("Escáner listo"); 
    }

}

