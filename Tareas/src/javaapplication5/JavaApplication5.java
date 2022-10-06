/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import javax.swing.JOptionPane;
/**
 *
 * @author jason
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int promedio = 0;
        int promediopit = 0;
         for (int j = 0; j < 10; j++) {
             String tiempolectura = JOptionPane.showInputDialog("ingrese su tiempo de vuelta");
             int tiempo = Integer.parseInt(tiempolectura);
             String pitlecturas = JOptionPane.showInputDialog("ingrese su tiempo de vuelta en pits");
             int pits = Integer.parseInt(pitlecturas);
             promedio = promedio + tiempo;
             promediopit = promediopit +pits;
        
             
             
            
        }
        promedio = promedio/10;
        promediopit = promediopit/10;
        System.out.println("el promedio de las vueltas fue "+promedio);
        System.out.println("el promedio del timepo en pits fue fue "+promediopit);
         

       
        }
    
           
      
    
        // TODO code application logic here
    
    
}
