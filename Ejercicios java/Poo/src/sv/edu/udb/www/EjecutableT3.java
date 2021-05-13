/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class EjecutableT3 {

    public static void main(String[] args) {
        // variables

        String ColorAuto = "";
        String PlacaAuto = "";
        String TarAuto = "";

        clase3T auto = new clase3T(ColorAuto,PlacaAuto,TarAuto);

        ColorAuto = JOptionPane.showInputDialog("Ingrese el color");
        PlacaAuto = JOptionPane.showInputDialog("Ingrese la placa");
        TarAuto = JOptionPane.showInputDialog("Ingrese la targeta de circulacion");
        
        JOptionPane.showConfirmDialog(null, auto.getColor());
        

    }
}
