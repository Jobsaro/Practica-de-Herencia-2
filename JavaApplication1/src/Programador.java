/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

//Herencia (programador es un empleado)
public class Programador extends Empleado {
    
    private double sueldoBase;
    
    public Programador(String nombre, String id, double sueldoBase){
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        
    }
    
    public double calcularSalario(){
        return sueldoBase;
    }
}
