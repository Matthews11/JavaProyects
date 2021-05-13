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
public class Switch2 {
    public static void main(String[] args) {
 // TODO code application logic here
int replaced = JOptionPane.showConfirmDialog(null,"Replace existing selection?");
 String result = "?";
 switch (replaced) {
 case JOptionPane.CANCEL_OPTION:
 result = "Canceled";
 break;
 case JOptionPane.CLOSED_OPTION:
 result = "Closed";
 break;
 case JOptionPane.NO_OPTION:
 result = "No";
 break;
 case JOptionPane.YES_OPTION:
 result = "Yes";
 break;
 default:
 ;
 }
System.out.println("Replace? " + result);
 }

    
}
