/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjava;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class ExamenJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //POLIMORFISMO UPCASTING
        //VARIABLE DE TIPO PADRE GUARDA OBJETO DE HIJO
        //upcasting es automatico y seguro
        Empleado miEmpleado = new Gerente("carlos");
        
        //se ejecuta la version del hijo, aunque la variable sea empleado
        miEmpleado.trabajar();
        miEmpleado.procesarPago();
        
        //Dowcsating
        //queremos usar el metodo "despedirEmpleado" que solo tiene el gerente.
        //como "miEmpledao" es tipo empleado, el compilador no ve ese metodo
        if (miEmpleado instanceof Gerente) {
            Gerente miGerente =(Gerente) miEmpleado;//casting explicito(peligroso)
            miGerente.despedirEmpleado();
        }
        
        // recursividad
        System.out.println("Calculo de bono(recursivo 3 Anios): $" + miEmpleado.calcularBonoRecursivo(3));
        
        //CALENDAR
        //obtener el anio del obejto calendar
        int anio = miEmpleado.fechaIngreso.get(Calendar.YEAR);
        System.out.println("Año de ingreso: " + anio);
    }
    
}
