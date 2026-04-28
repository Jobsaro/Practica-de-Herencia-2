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
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int intentos = 1;
        int maxIntentos = 3;
        boolean esValida = false;
        
        System.out.println("---CREAR CONTRASENA---");
        
        do {
            System.out.println("Intento "+ intentos +" de "+ maxIntentos);
            System.out.print("Ingrese su contrasena: ");
            
            String contrasena = scanner.nextLine();
            
            boolean tieneLongitud = contrasena.length() >= 8;
            boolean tieneDigito = false;
            boolean tieneMayuscula = false;
            boolean tieneMinuscula = false;
            
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isDigit(c)) {
                    tieneDigito = true;
                }
                if (Character.isUpperCase(c)) {
                    tieneMayuscula = true;
                }
                if (Character.isLowerCase(c)) {
                    tieneMinuscula = true;
                }
            }
            
            if (tieneLongitud) {
                System.out.println("    [OK] Longitud correcta");
            } else {
                System.out.println("    [X] Minimo 8 caracteres (tiene " + contrasena.length() + ")");
            }
            
            if (tieneDigito) {
                System.out.println("    [OK] Contiene digito");
            } else {
                System.out.println("    [X] Debe tener al menos un digito");
            }
            
            if (tieneMayuscula) {
                System.out.println("    [OK] Contiene mayuscula");
            } else {
                System.out.println("    [X] Debe tener al menos una mayuscula");
            }
            
            if (tieneMinuscula) {
                System.out.println("    [OK] Contiene minuscula");
            } else {
                System.out.println("    [X] Debe tener al menos una minuscula");
            }
            
            if (tieneLongitud && tieneDigito && tieneMayuscula && tieneMinuscula) {
                esValida = true;
                System.out.println("Contrasena creada exitosamente!");
            } else {
                intentos++; 
                System.out.println(); 
            }

        } while (!esValida && intentos <= maxIntentos);
        
        if (!esValida) {
            System.out.println("Se han agotado los 3 intentos. Acceso denegado");
        }
        
        scanner.close();
    }
}
