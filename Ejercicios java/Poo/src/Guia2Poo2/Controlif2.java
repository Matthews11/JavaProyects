/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class Controlif2 {
     public static void main(String[] args) {
String v1="";
 v1=JOptionPane.showInputDialog("Ingrese un valor");
if(v1==null)
 {
 JOptionPane.showMessageDialog(null,"Apretaste cancelar");
 }else {
 if(v1.equals(""))
 {
 JOptionPane.showMessageDialog(null,"No ingresaste nada");
}else{
 JOptionPane.showMessageDialog(null,"El valor de V1 es: "+v1);
 }
 }
 }

    
}
