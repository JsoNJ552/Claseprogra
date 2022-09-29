/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author jason
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String lecturaedad;
        System.out.println("==========");
        System.out.println("BIENVENIDO");
        System.out.println("==========");
        lecturaedad = JOptionPane.showInputDialog("introduzca su edad por favor ");
        edad = Integer.parseInt(lecturaedad);
      if (edad==0 || edad==1|| edad==2|| edad==4||edad==5){
          System.out.println("Perteneces a Primera Infancia");
      }else if(edad==6 || edad==7|| edad==8|| edad==9||edad==10||edad==11){
          System.out.println("Perteneces al grupo de la Infancia  ");
      }else if (edad>11||edad<19){
          System.out.println("Perteneces al grupo de la Adolescencia ");
      }else if (edad>18||edad<31){
          System.out.println("Perteneces al grupo de la Juventud");
      }else if (edad>29||edad<60){
          System.out.println("Perteneces al grupo de Adulto");
      }else if (edad>60){
          System.out.println("Perteces al grupo Adulto Mayor ");
      }
    }
    
}
