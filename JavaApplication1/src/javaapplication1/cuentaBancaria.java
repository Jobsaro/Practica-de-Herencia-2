/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class cuentaBancaria {
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected double tasa;
    protected  Calendar fecha;
    
    
    public cuentaBancaria(int numCuenta, String cliente, double tasa){
        numero = numCuenta;
        this.cliente=cliente;
        this.tasa=tasa;
        saldo=500;
       
    }
    
    
    
    public double getTasa() {
        return this.tasa;
    }
            
            
            
            /// aprender a usar calendar
            ///que no veo bien la pantalla
            ///
}
