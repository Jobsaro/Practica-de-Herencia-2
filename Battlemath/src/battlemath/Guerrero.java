/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battlemath;

/**
 *
 * @author Administrator
 */
public class Guerrero extends Combatiente{
    public Guerrero(String nombre){
        super(nombre, 150);
        
    }
    
    @Override
    public String realizarAccion(int n){
        int poder = sumarRecursivoDOWN(n, 0);
        return nombre + " Lanza un ataque con poder de: "+ poder;
    }
    
    private int sumarRecursivoDOWN(int n, int contiene){
        if(n == 0) return contiene;
        return sumarRecursivoDOWN(n - 1, contiene + n);
    }
}
