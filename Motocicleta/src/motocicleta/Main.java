/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motocicleta;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);    
        Motocicleta[] moto = new Motocicleta [5];
        
        moto[0] = new Motocicleta("Yamaha", "MT12", 341);
        moto[1] = new Motocicleta("SUZUKLI", "FT2", 234);
        
        System.out.println("Motocicletas en stock: ");
        
        for (int i = 0; i < moto.length; i++) {
            
            if (moto[i] != null) {
                System.out.println("- "+ moto[i]);
            }
            
        }
    
    }
    
} 