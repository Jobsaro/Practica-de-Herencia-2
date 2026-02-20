
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class SistemaUnitec {
    
    public static double sumarSalarios(ArrayList<Empleado> lista, int index){
        if(index <0) return 0;
        
        return lista.get(index).calcularSalario()+sumarSalario(lista, index - 1 );
    }
    
    public static void main(String[] args){
        ArrayList<Empleado> nomina = new ArrayList<>();
        
        Empleado emp1 = new Programador("Erick Amaya","1234",25000);
        nomina.add(emp1);
        nomina.add(new Programador("Juan perez","5432",30000));
        
        if(emp1 instanceof Programador){
            Programador p= (Programador)emp1;
            System.out.println("Casting exitoso para: "+ p.nombre);
            
        }
        
        double total = sumarSalarios(nomina, nomina.size()-1);
        System.out.println("total de nomina acumulado: Lps. "+ total);
    }
    
}
