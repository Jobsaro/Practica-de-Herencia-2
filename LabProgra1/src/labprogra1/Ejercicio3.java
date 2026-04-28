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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US); 
        
        System.out.println("======= CALCULADORA DE AREAS =======");
        System.out.println("1. Cuadrado  "
                + "\n2. Rectangulo  "
                + "\n3. Triangulo  "
                + "\n4. Circulo  "
                + "\n5. Salir");
        System.out.print("Seleccione una opcion: ");
        
        int opcion = scanner.nextInt();
        double area = 0; 
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el lado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                System.out.printf("El area del cuadrado es: %.2f\n", area);
                break;
                
            case 2:
                System.out.print("Ingrese la base: ");
                double baseRect = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaRect = scanner.nextDouble();
                area = baseRect * alturaRect;
                System.out.printf("El area del rectangulo es: %.2f\n", area);
                break;
                
            case 3:
                System.out.print("Ingrese la base: ");
                double baseTri = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaTri = scanner.nextDouble();
                area = (baseTri * alturaTri) / 2.0;
                System.out.printf("El area del triangulo es: %.2f\n", area);
                break;
                
            case 4:
                System.out.print("Ingrese el radio: ");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2); 
                System.out.printf("El area del circulo es: %.2f\n", area);
                break;
                
            case 5:
                break;
                
            default:
                System.out.println("Opcion no valida.");
                break;
        }
        
        scanner.close();
    }
    
}
