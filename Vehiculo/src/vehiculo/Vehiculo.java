/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Administrator
 */
public class Vehiculo {
    
    //1. atributos (variables de instancia)
    private String marca;
    private int velocidadMaxima;
    
    //constructor (para inicializar el obejeto)
    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //3. metodos(acciones)
    public void mostrarInfo(){
        System.out.println("Vehiculo: " + marca +" | velocidad: " + velocidadMaxima + "Km/h");
    }
    
}
