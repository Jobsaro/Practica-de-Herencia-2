/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author Administrator
 */
public class Persona {
    
    protected String nombre;
    protected int edad;
    protected int numIdentidad;
    protected String direccion;
    protected int numContacto;
    
    public Persona(String nombre, int edad, int numIdentidad, String direccion, int numConctato){
        this.nombre = nombre;
        this.edad = edad;
        this.numIdentidad = numIdentidad;
        this.direccion = direccion;
        this.numContacto = numConctato;
    }
    
}
