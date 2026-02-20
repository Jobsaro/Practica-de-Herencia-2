/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Administrator
 */
public class Auto extends Vehiculo {
    private int puertas;
    
    public Auto(String marca, int velocidad, int puertas){
        super(marca, velocidad);
        this.puertas = puertas;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Pueras: " + puertas);
    }
    
}
