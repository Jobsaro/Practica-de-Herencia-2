/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GestorDocumentos {
    private ArrayList <Documento> lista = new ArrayList();
    
    public void agregar(Documento d){
        lista.add(d);
    }
    //metodo recursivo para simular una cuneta regresiva de revision
    public void revisionRecursiva(int dias){
        if (dias <= 0){//caso base
            System.out.println("REVICION COMPLETA");
        } else {// caso recursivo
            System.out.println("FALTAN "+ dias +"DIAS PARA QUE EXPIRE EL PLAZO...");
            revisionRecursiva(dias - 1);
        }
    }
    
    public void mostrarTodo(){
        for(Documento d : lista){
            d.mostrarDatos();
            System.out.println("---------------");
        }
    }
}
