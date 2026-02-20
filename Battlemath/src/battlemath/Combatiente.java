/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battlemath;

/**
 *
 * @author Administrator
 */
public class Combatiente {
    protected String nombre;
    protected int salud;
   
   public Combatiente(String nombre, int salud){
       this.nombre = nombre;
       this.salud = salud;
   } 
   
   //metodo que sera polimorfico
   public String realizarAccion(int valor){
       return nombre + " realiza una accion base.";
   }
   
}
