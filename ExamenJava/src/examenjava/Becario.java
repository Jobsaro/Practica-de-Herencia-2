/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjava;

/**
 *
 * @author Administrator
 */
public class Becario extends Empleado {
    public Becario(String nombre){
        super(nombre);
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre + " está aprendiendo Java y trayendo café.");    
    }
    
    @Override
    public void procesarPago(){
        System.out.println("El becario no recibe salario, solo experiencia.");
    }
    
}
