/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Administrator
 */
public class Empleado extends Persona {
    
    protected double salario;
    protected int idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String area;
    
    public Empleado(String nombre, int edad, int numIdentidad, String direccion, int numContacto, double salario, int idEmpleado, String fechaContratacion, String tipoContrato, String area){
        
        super(nombre, edad, numIdentidad, direccion, numContacto);
        
        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.area = area;
    }
    
    public void trabajar(){
        System.out.println(nombre +"esta realizando tareas generales en "+area+"." );
    }
    
    public double getSalario(){
        return salario;
    }
}
