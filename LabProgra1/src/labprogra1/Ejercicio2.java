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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota del estudiante (0-100): ");
        int nota = scanner.nextInt();
        
        if (nota < 0 || nota > 100) {
            System.out.println("Error: La nota no es valida. Debe estar entre 0 y 100.");
        } else {
            char letra;
            String mensaje;
            int puntosFaltantes = 0;
                    
            if (nota >= 90) {
                letra = 'A';
                mensaje = "Excelente trabajo!";
            } else if (nota >= 80) {
                letra = 'B';
                mensaje = "Muy bien, sigue adelante!";
                puntosFaltantes = 90 - nota; 
            } else if (nota >= 70) {
                letra = 'C';
                mensaje = "Aprobado, puedes mejorar.";
                puntosFaltantes = 80 - nota; 
            } else if (nota >= 60) {
                letra = 'D';
                mensaje = "Aprobado minimo.";
                puntosFaltantes = 70 - nota; 
            } else {
                letra = 'F';
                mensaje = "Necesitas estudiar mas.";
                puntosFaltantes = 60 - nota; 
            }
            
            System.out.println("Nota: " + nota + " | Letra: " + letra);
            System.out.println(mensaje);
            
            if (letra != 'A') {
                System.out.println("Te faltan " + puntosFaltantes + " puntos para subir de letra.");
            }
        }
        
        scanner.close();
    }
    
}
