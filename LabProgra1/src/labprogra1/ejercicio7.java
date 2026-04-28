/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogra1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ejercicio7 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Ingrese un numero N (entre 1 y 10): ");
       int n = scanner.nextInt();
       
        if (n < 1|| n>10) {
            System.out.println("Error: El umero debe estar entre 1 y 10.");
        }else {
            
            System.out.println("\npATRON a---- Triangulo de numeros");
            
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            
            System.out.println("\nPatron B --- Piramide centrada");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            
            System.out.println("\nPatron C --- Rombo de asteriscos");
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
    
}
