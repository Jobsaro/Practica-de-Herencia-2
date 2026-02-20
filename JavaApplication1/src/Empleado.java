/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
abstract class Empleado {
    
    protected String nombre;//Atributo protegido para las clases hijas
    protected final String ID; // Uso del final(no cambia una vez asignado)
    
    public Empleado(String nombre, String id){
        this.nombre = nombre;
        this.ID = id;
    }
    
    public abstract double calcularSalario();
}
