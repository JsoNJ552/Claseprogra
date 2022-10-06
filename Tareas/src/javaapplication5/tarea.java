/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import javax.swing.JOptionPane;

/**
 *
 * @author jason
 */
public class tarea {
    
    
    public static void main(String[] args){
        
        int contadora = 0;
        int contadorb=0;
        int contadorc=0;
        int contadord=0;
        int contadore=0;
        int promedio=0;
        
        String lecturaestudiantes = JOptionPane.showInputDialog("ingrese la cantidad de estudiantes");
        int estudiantes = Integer.parseInt(lecturaestudiantes);
        
        
        
        for (int j = 0; j < estudiantes; j++){
            String lecturaestatura = JOptionPane.showInputDialog("ingrese la estatura del estudiante");
            int estatura = Integer.parseInt(lecturaestatura);
            if (estatura<100){
                
                contadora=+1;
                
            }else if (estatura==100||estatura<121){
                contadorb=+1;
            }else if (estatura==121||estatura<130){
                contadorc=+1;
                
            }else if (estatura==131||estatura<140){
                contadord=+1;
            }else if (estatura>140){
                
                contadore=+1;
            }promedio=promedio + estatura;
            
        }
        System.out.print("las personas que miden mas de 100 cm  son "+contadora);
        System.out.print("las personas que miden mas de 100 cm pero menos de 121cm son "+contadorb);
        System.out.print("las personas que miden mas de 121 cm pero menos de 131cm son "+contadorc);
        System.out.print("las personas que miden mas de 131 cm pero menos de 140cm son "+contadord);
        System.out.print("las personas que miden mas de 140 cm  son "+contadore);
        System.out.print("El promedio de la estatura de los estudiantes es de "+promedio);
        
        
    
          
    }
    
    
}
