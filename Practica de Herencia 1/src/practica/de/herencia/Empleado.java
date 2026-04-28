/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.de.herencia;

/**
 *
 * @author Administrator
 */
public class Empleado extends Persona{
    
    protected double salario;
    protected int idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String area;
    
    public Empleado(double salario, int idEmpleado, String fechacontratacion, String tipoContrato, String area){
        
        this.salario=salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.area = area;
    }
    
}
