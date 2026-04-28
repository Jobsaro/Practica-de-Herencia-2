/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.de.herencia;

/**
 *
 * @author Administrator
 */
public class Desarrollador extends Empleado{
    protected String lenguajes;
    protected String nivelTecnico;
    protected String herramientas;
    protected int cantidadProyectos;
    
    public Desarrollador(String nombre, int edad, int numIdentidad, String direccion, int numContacto, 
                         double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area,
                         String lenguajePrincipal, String nivelDominio, String herramientas, int cantidadProyectos){
        
        super(nombre, edad, numIdentidad, direccion, numContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        
        this.lenguajes = lenguajes;
        this.nivelTecnico = nivelDominio;
        this.herramientas = herramientas;
        this.cantidadProyectos = cantidadProyectos;
        
        
    }
}
