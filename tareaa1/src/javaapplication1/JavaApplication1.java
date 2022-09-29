/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jason
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        String lecturames;
        
        lecturames =  JOptionPane.showInputDialog("introduzca la clave");
        mes = Integer.parseInt(lecturames);
        switch(mes){
            case 1:
                System.out.println("Su Clave pertenece a Enero y esta en el primer cuatrimestre ");
                break;
            case 2:
                System.out.println("Su Clave pertenece a Febrero y esta en el primer cuatrimestre ");
                break;
            case 3:
                System.out.println("Su Clave pertenece a Marzo y esta en el primer cuatrimestre ");
                break;
            case 4:
                System.out.println("Su Clave pertenece a Abril y esta en el primer cuatrimestre ");
                break;
            case 5:
                System.out.println("Su Clave pertenece a Mayo y esta en el Segundo cuatrimestre ");
                break;
            case 6:
                System.out.println("Su Clave pertenece a Junio y esta en el Segundo cuatrimestre ");
                break;
            case 7:
                System.out.println("Su Clave pertenece a Julio y esta en el Segundo cuatrimestre ");
                break;
            case 8:
                System.out.println("Su Clave pertenece a Agosto y esta en el Segundo cuatrimestre ");
                break;
            case 9:
                System.out.println("Su Clave pertenece a Setiembre y esta en el tercer cuatrimestre ");
                break;
            case 10:
                System.out.println("Su Clave pertenece a Octubre y esta en el tercer cuatrimestre ");
                break;
            case 11:
                System.out.println("Su Clave pertenece a Noviembre y esta en el tercer cuatrimestre ");
                break;
            case 12:
                System.out.println("Su Clave pertenece a Diciembre y esta en el tercer cuatrimestre ");
                break;
        }
        
 
       
       
        
       
        
       
       
        
       
        
        
        
        
        
        
        
        
        
    }

    private static class string {

        public string() {
        }
    }
   
    
}
