/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.ejercicio_8;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        CuentaBancaria cb = new CuentaBancaria("Fernando Jose", 500000);
        
        int opc = 0;
        try{
            do{
                System.out.println("=== MENU ===\n1. Consultar \n2. Depositar\n3. Retirar \n4. Salir\nOpcion: ");
                opc = parseInt(sc.nextLine());

                try{            
                    switch(opc){
                        case 1:
                            System.out.println("Titular de la cuenta: "+ cb.getTitular());
                            System.out.println("Saldo de la cuenta: "+ cb.getSaldo());                            
                            break;
                            
                        case 2:
                            System.out.println("Digite el monto a depositar: ");
                            double monto_a_depositar = parseDouble(sc.nextLine());
                            
                            try{
                                cb.depositar(monto_a_depositar);
                            }catch(MontoInvalidoException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                            
                        case 3:
                            System.out.println("Digite el monto a retirar: ");
                            double monto_a_retirar = parseDouble(sc.nextLine());
                            
                            try{
                                cb.retirar(monto_a_retirar);
                            }catch(MontoInvalidoException e){
                                System.out.println(e.getMessage());
                            }catch(SaldoInsuficienteException e){
                                 System.out.println("Saldo insuficiente. Saldo: $" +
                                    cb.getSaldo() +" - Faltan: $" + e.getFaltante()
                                );
                            }
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Debe ingresar un numero. Intentelo de nuevo");
                }
            }while(opc != 4);
        }finally{
            sc.close();
        }        
    }
}
