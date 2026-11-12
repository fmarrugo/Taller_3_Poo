/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_3;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Equipo e = new Multifuncional("123");
        Imprimible i = new Multifuncional("A1");

        i.imprimir();
        ((Escaneable) i).escanear();
    }
}
