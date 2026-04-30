/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Administrator
 */
public class Gerentes extends Empleado implements Capacitador {
    
    protected String departamentoEncargado;
    protected int cantPersonas;
    protected double presupuestoAsignado;
    protected String frecuenciaReuniones;
    
    public Gerentes(String nombre, int edad, int numIdentidad, String direccion, int numContacto, double salario, int idEmpleado, String fechaContratacion, String tipoContrato, String area, String departamentoEncargado, int cantPersonas, double presupuestoAsignado, String frecuenciaReuniones){
        
        super(nombre, edad, numIdentidad, direccion, numContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        
        this.departamentoEncargado = departamentoEncargado;
        this.cantPersonas = cantPersonas;
        this.presupuestoAsignado = presupuestoAsignado;
        this.frecuenciaReuniones = frecuenciaReuniones;
        
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre+" esta coordinando en "+departamentoEncargado+".");
    }
    
    @Override
    public void impartirCapacitacion(){
        System.out.println(nombre+" esta dando una capacitacion al equipo.");
    }
    
}
