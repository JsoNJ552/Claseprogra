
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jason
 */
public class personalcocina {
    String nombre;
    int edad;
    String puestoenespecifico;
    int cedula;
    String direcccion;
    String Asistencia;
    int salario;
    
    
     public void agregar(){
        nombre = JOptionPane.showInputDialog("introduzca su edad por favor ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("introduzca su edad por favor "));
        
        
    }
    public void mostrar(){
        System.out.println(nombre);
        System.out.println(edad);
        
    }
    public void modificar(){
        
    }
    public void calcularsalario(){
        
    }
    public void avisarferiado(){
        
    }
    
}
