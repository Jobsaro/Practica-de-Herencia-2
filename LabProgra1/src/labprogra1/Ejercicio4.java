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
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        int num = scanner.nextInt();
        
        System.out.println();
        
        System.out.println("+-----+-----+--------+");
        System.out.println("|  N  |  x  |  =Res  |");
        System.out.println("+-----+-----+--------+");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("| %3d | %3d |  =%3d  |%n", num, i, num * i);
        }
        
        System.out.println("+-----+-----+--------+");
        
        scanner.close();
    
    }
    
}
