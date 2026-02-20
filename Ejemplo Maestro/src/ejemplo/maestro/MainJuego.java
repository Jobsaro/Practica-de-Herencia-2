/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.maestro;

/**
 *
 * @author Administrator
 */


class Guerrero extends Personaje{
    private final int FUERZA_MAXIMA = 100;
    
    public Guerrero(String nombre){
        super(nombre, 150, Raza.ORCO);
    }
    
    @Override
    public void atacar(){
        System.out.println(nombre + "golpea con su hacha (fisico)!!");
    }
    
    //metodo esclusivo de guerrero (no lo tiene el mago)
    public void usarFuria(){
        System.out.println(nombre+"GRITA CON FURIA!!");
    }
    
}

class Mago extends Personaje{
    public Mago(String nombre){
        super(nombre, 86, Raza.ELFO);
    }
    
    public void atacar(){
        System.out.println(nombre+" Lanza una bola de fuego(MAGICO)!!!");
    }
}

public class MainJuego{
    public static void main(String[] args){
        //7. upcasting(automatico)
        //guardamos un guerrero en una variable de tipo personaje
        //'vemos'al objeto como un personaje generico.
        Personaje p1 = new Guerrero("Garrosh");
        Personaje p2 = new Mago("Jaina");
        
        p1.atacar();
        p2.atacar();
        
        if (p1 instanceof Guerrero){
            Guerrero g = (Guerrero) p1;
            g.usarFuria();
        }
    }
    
    
}
