/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjava;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
abstract class Empleado implements Pagable {
    protected String nombre;//visible para los hijos
    protected Calendar fechaIngreso;//uso de calendar
    
    public Empleado(String nombre){
        this.nombre = nombre;
        //calendar obtiene la fecha actual
        this.fechaIngreso =  Calendar.getInstance();
    }
    
    //recursividad metodo para calcular bono por años
    //caso base: año 0 llama recursiva: años - 1
    public int calcularBonoRecursivo(int anios){
        if (anios == 0){
            return 0;
        } return 100 + calcularBonoRecursivo(anios - 1);//se llama a si mismo
        
    }
    
    //metodo abstracto: los hijos deben definir como trabajan
    public abstract void trabajar();
}
