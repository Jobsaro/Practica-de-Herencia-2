/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesadorventas;

/**
 *
 * @author Administrator
 */
abstract class ProcesadorDeDatos {
    
    public final void procesar(){
        conectar();
        leer();
        if(esValido()){
            transformar();
            guardar();
        }
        desconectar();
    }
    
    private void conectar(){
        System.out.println("Conectando a DB...");
    }
    
    private void desconectar(){
        System.out.println("Cerrando conexion...");
    }
    
    //pasos dque las subclases DEBEN implementar
    protected abstract void leer();
    protected abstract void transformar();
    
    //un "hook" (gancho); opcional de sobrescribir
    protected boolean esValido(){
        return true;
    }
    
    
}
