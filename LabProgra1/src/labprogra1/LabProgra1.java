/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprogra1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LabProgra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso;
        double altura;
        double IMC;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
                
        System.out.println("Ingrese altura en metros: ");
        altura = scanner.nextDouble();
        
        System.out.println("Ingrese Peso en kg: ");
        peso = scanner.nextDouble();
        
        IMC = peso/(altura * altura);
        
        System.out.printf("El IMC del Px es: %.2f\n", IMC);
        
        if (IMC < 18.5){
            System.out.println("Clasificacion: Bajo peso");
        }else if(IMC >= 18.5 && IMC < 25.0){
            System.out.println("Clasificacion: Peso normal");
        }else if(IMC >= 25.0 && IMC < 30.0){
            System.out.println("Clasificacion: Sobrepeso");
        }else{
            System.out.println("Clasificacion: Obesidad");
        }
        
        scanner.close();
    }
    
}
