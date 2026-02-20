/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[] args){
        GestorDocumentos gesto = new GestorDocumentos();
        
        Documento doc1 = new Contrato("arrendamiento A1", "Juan perez");
        gesto.agregar(doc1);
        
        gesto.mostrarTodo();
        
        System.out.println("/nIniciando cronograma de revision:");
        gesto.revisionRecursiva(3);
    }
    
}
