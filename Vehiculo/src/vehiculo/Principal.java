/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Administrator
 */
public class Principal {
    public static void main(String[] args){
        //creamos una instacia(objeto)
        Auto miAuto =new Auto("Hiudai", 23333, 2);
        
        //Ejecutamos el comportamiento
        miAuto.mostrarInfo();
    }
    
}
