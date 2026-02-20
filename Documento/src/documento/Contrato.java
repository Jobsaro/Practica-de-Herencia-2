/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento;

/**
 *
 * @author Administrator
 */
public class Contrato extends Documento{
    private String cliente;
    
    public Contrato(String titulo, String cliente){
        super(titulo);//llama al constructor de documento
        this.cliente = cliente;        
    }
    
    public void mostrarDatos(){
        super.mostrarDatos();//Imprime titulo y fecha
        System.out.println("Cliente: "+ cliente);
        System.out.print("Tipo: Contrato Legal");
    }
}
