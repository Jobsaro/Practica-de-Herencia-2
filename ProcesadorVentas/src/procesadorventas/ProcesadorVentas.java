/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesadorventas;

/**
 *
 * @author Administrator
 */
public class ProcesadorVentas extends ProcesadorDeDatos {
    
    @Override
    protected void leer(){
        System.out.println("Leyendo CSV de ventas...");    
    }
    
    @Override
    protected void transformar(){
        System.out.println("Aplicacion impuesto de 20%...");
    }
    
}
