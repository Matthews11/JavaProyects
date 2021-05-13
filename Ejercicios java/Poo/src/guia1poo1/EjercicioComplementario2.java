/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

import java.util.Scanner;

/**
 *
 * @author jared
 */
public class EjercicioComplementario2 {
    public static void main(String[] args) {
        
        String nombre="";
        String apellido="";
        int edad =0;
        String carrera="";
        
        Scanner R = new Scanner(System.in);
        
        System.out.println("Ingrese la carrera que cursa ");
        carrera=R.nextLine();
        
        System.out.println("Ingrese su nombre ");
        nombre=R.nextLine();
        
        System.out.println("Ingrese su apellido ");
        apellido=R.nextLine();
        
         System.out.println("Ingrese su edad ");
        edad=R.nextInt();
        
        
        
        System.out.println("Usted se llama "+nombre+" "+apellido+ " tiene  "+edad+" años y cursa la carrera "+carrera);
        
        
        
    }
    
}
