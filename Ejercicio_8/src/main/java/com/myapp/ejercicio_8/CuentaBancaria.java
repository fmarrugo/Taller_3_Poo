/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.ejercicio_8;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void depositar(double monto) throws MontoInvalidoException{
        if(monto <= 0){
            throw new MontoInvalidoException(monto);
        }
        
        saldo += monto;
        System.out.println("Depósito hecho correctamente");
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, MontoInvalidoException{
        if(monto <= 0){
            throw new MontoInvalidoException(monto);
        }
        
        if(monto > saldo){
            throw new SaldoInsuficienteException(monto, saldo);
        }
        
        saldo -= monto;
        System.out.println("Retiro hecho correctamente");
    }
    
}
