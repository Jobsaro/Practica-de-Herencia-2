/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.java;

/**
 *
 * @author Administrator
 */
public class PalomaMensajera extends Ave implements EnviadorDeMensajes{
    
    public void volarRapido(){
        System.out.println("Volando...");
    }
    
    @Override
    public void enviarMensaje(String mensaje){
        volarRapido();
        System.out.println("Lanzando un papelito que dice: " + mensaje);
    
    }
}
