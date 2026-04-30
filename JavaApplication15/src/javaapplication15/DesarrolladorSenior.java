/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Administrator
 */
public class DesarrolladorSenior extends Desarrollador implements Capacitador {
    
    protected int aniosExp;
    protected int proyectosLiderados;
    protected String nivelEspecializacion;
    protected String capacidadMentoria;
    
    public DesarrolladorSenior(String nombre, int edad, int numIdentidad, String direccion, int numContacto, double salario, int idEmpleado, String fechaContratacion, String tipoContrato, String area, String lenguajePrincipal, String nivelDominio, String herramientas, int cantProyectos, int aniosExp, int proyectosLiderados, String nivelEspecializacion, String capacidadMentoria ){
        
        super( nombre, edad, numIdentidad, direccion, numContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area, lenguajePrincipal, nivelDominio, herramientas, cantProyectos);
        
        this.aniosExp = aniosExp;
        this.proyectosLiderados = proyectosLiderados;
        this.nivelEspecializacion = nivelEspecializacion;
        this.capacidadMentoria = capacidadMentoria;
        
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre+"esta programando y lidreando en "+area+".");
    }
    
    @Override
    public void impartirCapacitacion(){
        System.out.println(nombre+" esta dando una capcaitacion tecnica al equipo.");
    }
    
}
