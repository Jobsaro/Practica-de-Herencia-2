/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        Desarrollador dev = new Desarrollador("Carlos", 25, 1234, "Colonia Centro", 9999, 15000.0, 101, "01/01/2025", "Tiempo Completo", "IT", "Java", "Intermedio", "NetBeans", 3);

        Gerentes gerentes = new Gerentes("Ana", 35, 5678, "Residencial", 8888, 30000.0, 102, "15/05/2022", "Tiempo Completo", "Administración", "Desarrollo", 15, 50000.0, "Semanal");
        
        DesarrolladorSenior senior = new DesarrolladorSenior("Luis", 30, 9101, "Barrio Sur", 7777, 25000.0, 103, "10/08/2020", "Tiempo Completo", "IT", "Java", "Avanzado", "Eclipse", 10, 5, 4, "Arquitectura", "Alta");
        
        listaEmpleados.add(dev);
        listaEmpleados.add(gerentes);
        listaEmpleados.add(senior);
        
        System.out.println("------SISTEMA DE EMPLEADOS TECHCORP------");
        
        for(Empleado emp : listaEmpleados){
            System.out.println("Empleado: "+emp.nombre);
            
            emp.trabajar();
            
            System.out.println("Salario: Lps. "+ emp.getSalario());
            
            if (emp instanceof Capacitador) {
                ((Capacitador)emp).impartirCapacitacion();
                
            }
        }
    }
    
}
