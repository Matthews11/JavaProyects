/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class EjercicioComplementario3 {

    public static void main(String[] args) {

        String nombre = "";
        String apellido = "";
        String edad = "";
        String carrera = "";

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        edad = JOptionPane.showInputDialog("Ingrese su edad");
        carrera = JOptionPane.showInputDialog("Ingrese la carrera que cursa");

        JOptionPane.showMessageDialog(null, "usted se llama " + nombre + " " + apellido + " \n tiene " + edad + " años \n y \n cursa la carrera " + carrera);
    }

}
