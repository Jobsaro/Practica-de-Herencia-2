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
class Gerente extends Empleado {
    //FINAL: esta variable es constante, no se puede cambiar
    protected final double SALARIO_BASE= 5000.00;
    
    public Gerente(String nombre){
        super(nombre);//llama al constructor del padre(Empleado)
        
        //calendar: establece una fecha especifica 
        //OJO; los meses en calendar empiezan en 0 )
        this.fechaIngreso.set(2020, Calendar.JANUARY, 15);
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre + " Esta supervisando el equipo.");
    }
    
    @Override
    public void procesarPago(){
        System.out.println("Pagando salario de Gerente: $" + SALARIO_BASE);
    }
    
    public void despedirEmpleado(){
        System.out.println(" Estas despedido!");
    }
}
