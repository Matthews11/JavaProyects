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
public class Complementario1 {

    public static void main(String[] args) {

        String nota;
        float nota1 = 0;

        JOptionPane.showMessageDialog(null, "Buenas, este programa esta hecho para que usted ingrese una nota y le diga si aprobo o no");

        JOptionPane.showMessageDialog(null, "Ingrese una nota del 1 al 10");

        nota = JOptionPane.showInputDialog("Ingrese un valor");

        nota1 = Float.parseFloat(nota);

        if (nota1 >= 7.0 && nota1 <= 10) {
            JOptionPane.showMessageDialog(null, "Felicidades!!! Usted aprobo.");

        } if (nota1 >= 11) {
            JOptionPane.showMessageDialog(null, "Usted tiene que ingresar una nota del 1 - 10 ");

        } else if (nota1 >= 6.50 && nota1 <= 6.99) {
            JOptionPane.showMessageDialog(null, "Nose preocupe, para no reprobar, usted hara un examen de sufiencia para aprobar");

        } else {
            JOptionPane.showMessageDialog(null, "Lastimosamente, usted esta reprobado");

        }

    }

}
