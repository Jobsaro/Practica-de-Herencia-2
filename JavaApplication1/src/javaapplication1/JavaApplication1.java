/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    // Método recursivo que suma desde 1 hasta n
    public int suma(int n) {
        if (n >= 1) {
            return suma(n - 1) + n;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaApplication1 sr = new JavaApplication1();

        // Pedir al usuario el valor de n
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        // Calcular y mostrar el resultado
        int resultado = sr.suma(n);
        System.out.println("La suma de 1 hasta " + n + " es: " + resultado);

        sc.close();
    }
}
