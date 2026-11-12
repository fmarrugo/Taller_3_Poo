/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_8;

/**
 *
 * @author Usuario
 */
public class SaldoInsuficienteException extends Exception{
    private double faltante;

    public SaldoInsuficienteException(double monto, double saldo){
        super("Saldo insuficiente");
        this.faltante = monto - saldo;
    }
    
    public double getFaltante() {
        return faltante;
    }
}
