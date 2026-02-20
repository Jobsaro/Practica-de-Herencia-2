/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.java;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PartidoDelBuenCodigo {
    private ArrayList<EnviadorDeMensajes> mensajeros;
    
    public PartidoDelBuenCodigo(){
        mensajeros = new ArrayList<>();
    }
    
    public void agregarMensajero(EnviadorDeMensajes mensajero){
        this.mensajeros.add(mensajero);
    }
    
    public void hacerCampania(){
        for (EnviadorDeMensajes mensajero : mensajeros) {
            mensajero.enviarMensaje("vote por el partido del bun codigo");
        }
    }
    
}
