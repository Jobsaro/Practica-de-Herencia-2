/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battlemath;

/**
 *
 * @author Administrator
 */
public class Mago extends Combatiente {
    public Mago(String nombre){
        super(nombre, 100);
    }
    
    @Override
    public String realizarAccion(int n){
        //aqui usaremos una funcion 
        int poder = sumarRecursivoUP(n);
        return nombre + " lanza un hechizo con poder de: "+ poder;
    }
    
    private int sumarRecursivoUP(int n){
        if (n <= 0) return 0;
        return n + sumarRecursivoUP(n - 1);
    }
    
}
