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
public class Ejercicio5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
            
            System.out.print("numero: ");
            int valorOriginal = scanner.nextInt();
            
            if (valorOriginal == 0) {
            System.out.println("numero ingresado: 0");
            System.out.println("Cantidad de digitos: 1");
            System.out.println("Suma de digitos: 0 = 0");
            System.out.println("El numero es: Par");
            }
            
            else if (valorOriginal<0) {
            System.out.println("Error: Por favor ingrese un numero entero positivo");
            }
            
            else{
                int numero = valorOriginal;
                int suma = 0;
                int contador = 0;
                String desgloseSuma = "";
                
                while(numero > 0){
                    int digito = numero % 10;
                    suma = suma + digito;
                    contador = contador + 1;
                    
                    if (desgloseSuma.equals("")) {
                        desgloseSuma = Integer.toString(digito);
                    } else{
                        desgloseSuma = digito +"+"+ desgloseSuma;
                    }
                    
                    numero = numero/10;
                    
                }
                
            System.out.println("numero ingresado: "+ valorOriginal);
            System.out.println("Cantidad de digitos: "+ contador);
            System.out.println("Suma de digitos: "+ desgloseSuma +"="+ suma);
    
            if(valorOriginal % 2==0){
                System.out.println("El numero es: Par");
            }else{
                System.out.println("El numero es: Impar");
            }
            
            }
        }
}
