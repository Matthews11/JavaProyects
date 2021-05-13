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
public class complementario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hola, Administrador que accion desea hacer");
        eleccion elegir = new eleccion();
        elegir.elegir();
    }

}
