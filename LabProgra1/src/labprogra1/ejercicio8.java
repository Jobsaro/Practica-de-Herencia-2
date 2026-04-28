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
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US); 
        
        double saldo = 5000.0;
        int opcion;
        
        do {
            System.out.println("\n=== CAJERO AUTOMATICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: Lps. " + saldo);
                    break;
                    
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo = saldo + deposito; 
                        System.out.println("Deposito exitoso. Su nuevo saldo es: Lps. " + saldo);
                    } else {
                        System.out.println("Error: La cantidad debe ser mayor a 0.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    
                    if (retiro > saldo) {
                        System.out.println("Error: Fondos insuficientes.");
                    } else if (retiro > 0) {
                        saldo = saldo - retiro; 
                        System.out.println("Retiro exitoso. Su nuevo saldo es: Lps. " + saldo);
                    } else {
                        System.out.println("Error: La cantidad debe ser mayor a 0.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Gracias por usar el cajero automatico. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
            
        } while (opcion != 4); 
        
        scanner.close();
    }
}
