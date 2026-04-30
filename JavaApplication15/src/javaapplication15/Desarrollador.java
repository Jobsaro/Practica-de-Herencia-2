/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Administrator
 */
public class Desarrollador extends Empleado {
    
    protected String lenguajePrincipal;
    protected String nivelDominio;
    protected String herramientas;
    protected int cantProyectos;
    
    public Desarrollador(String nombre, int edad, int numIdentidad, String direccion, int numContacto, double salario, int idEmpleado, String fechaContratacion, String tipoContrato, String area, String lenguajePrincipal, String nivelDominio, String herramientas, int cantProyectos){
        
        super(nombre, edad, numIdentidad, direccion, numContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelDominio = nivelDominio;
        this.herramientas= herramientas;
        this.cantProyectos = cantProyectos;
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre+"esta programando en "+ lenguajePrincipal+".");
    }
}
