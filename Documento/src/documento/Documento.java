/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class Documento {
    protected String titulo;
    protected Calendar fechaCreacion;
    
    public Documento(String titulo){
        this.titulo = titulo;
        this.fechaCreacion = Calendar.getInstance(); //Captura fecha y hora actual
    }
    
    public void mostrarDatos(){
        System.out.println("Documento: " + titulo+
                "/nFecha: "+ fechaCreacion.getTime());// .getTime() lo hace legible
    }
}
