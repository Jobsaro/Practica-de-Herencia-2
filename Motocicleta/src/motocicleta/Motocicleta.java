/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motocicleta;

/**
 *
 * @author Administrator
 */
public class Motocicleta {
    
    private String marca;
    private String modelo;
    private int cilindrada;

    public Motocicleta (String marca, String modelo, int cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    
    
    //SETER Y GETER PARA MARCA
    public String Getmarca(){
        return marca;
    }
    public void Setmarca(String nuevaMarca){
        this.marca = nuevaMarca;
    }
    
    
    //MODELOOOOOOOOOO
    public String Getmodelo(){
        return modelo;
    }
    public void Setmodelo(String nuevoModelo){
        this.modelo = nuevoModelo;
    }
    
    
    //CILINDRADAAAAAAAAAAAAA
    public int Getcilindrada(){
        return cilindrada;
    }
    public void SetCilindrada(int nuevaCilindrada){
        this.cilindrada = nuevaCilindrada;
    }
}
