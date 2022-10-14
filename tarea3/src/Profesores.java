
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jason
 */
public class Profesores {
    public String nombre;
    public int edad;
    String puestoenespecifico;
    public int cedula;
    public String direcccion;
    public String Asistencia;
    public int salario;
    
    
   public void agregar(){
        nombre = JOptionPane.showInputDialog("introduzca su edad por favor ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("introduzca su edad por favor "));
        
        
    }
    public void mostrar(){
        System.out.println(nombre);
        System.out.println(edad);
        
    }
    public void eliminar(){
        
    }
    public void modificar(){
        
    }
    public void calcularsalario(){
        
    }
    public void avisarferiado(){
        
    }
    
}
