/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.maestro;

/**
 *
 * @author Administrator
 */

interface Atacable{
    void recibirDaño(int cantidad);
}

enum Raza{
    HUMANO, ELFO, ORCO
}

abstract class Personaje implements Atacable{
    
    //4. PROTECTED: visible para las clases hijas (guerrero/mago)
    protected String nombre;
    protected int vida;
    protected Raza raza;
    
    public Personaje(String nombre, int vida, Raza raza){
        this.nombre = nombre;
        this.vida = vida;
        this.raza = raza;
    }
    
    //metodo abstracto: obliga a los hijos a definir como atacan
    public abstract void atacar();
    
    @Override
    public void recibirDaño(int cantidad){
        this.vida -= cantidad;
        System.out.println(nombre + " recibio" + cantidad + " de daño. vida restante " + vida);
        
    }
    
    
}