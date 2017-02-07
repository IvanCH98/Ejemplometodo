/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplometodo;
import java.util.Scanner;
        
/**
 *
 * @author Alumno
 */
public class Ejemplometodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v, r;
    final double pi=3.1416;
    r=solicitaRadio();
    v=calculaVolumen (r,pi);
    muestraResultado(v);    
               
            
    }
   static double solicitaRadio (){
       double radio;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el radio");
        radio= kb.nextDouble();
        return radio;
   }
   static double calculaVolumen (double rad,double pix) {
   double volumen;
   volumen= pix*Math.pow(rad,2);
   return volumen;
   }
   
   static void muestraResultado (double vol) {
       System.out.println("El volumen es: "+ vol);
   }       
   
   }

