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
public class IconosSwing {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Informacion", "Mensaje de informacion", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Advertencia", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sin Icono", "Mensaje de Texto Plano", JOptionPane.PLAIN_MESSAGE);

    }

}
