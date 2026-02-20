/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesrecursivas;

/**
 *
 * @author Administrator
 */
public class FUNCIONESRECURSIVAS {

    static int suma(int numero){
        if(numero>=1){
            return suma(numero - 1)+ numero;
        }return 0;
        
    }
}
