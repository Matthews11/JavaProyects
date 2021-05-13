/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class Complementario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String pago;
        String color;
        int numero = 0;
        float pago1 = 0;
        float descuento = 0;
        float total = 0;

        Random bolas = new Random();
        int b = bolas.nextInt(3);
        b = (b * 1);

        JOptionPane.showMessageDialog(null, "Hola, este programa le ayudara a cancelar en caja");

        pago = JOptionPane.showInputDialog("Cancele su pago");
        pago1 = Float.parseFloat(pago);

        JOptionPane.showMessageDialog(null, "Felicidades A sido seleccionado para sacar una bolita de la cesta ");

        switch (b) {
            case 1:

                JOptionPane.showMessageDialog(null, "Usted saco la bolita color Rojo y se le aplicara un 10% de descuento");
                descuento = (float) ((pago1 * 0.10));
                total = pago1 - descuento;
                JOptionPane.showMessageDialog(null, "Su total a pagar es $" + total);

                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Usted saco la bolita color verde y se le aplicara un 5% de descuento");
                descuento = (float) ((pago1 * 0.05));
                total = pago1 - descuento;
                JOptionPane.showMessageDialog(null, "Su total a pagar es $" + total);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Lastimosamente saco la bolita color blanco y no se le aplicara descuento  ");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Lastimosamente las bolitas se acabaron ");
                JOptionPane.showMessageDialog(null, "Gracias por su compra y pase un feliz dia !!!");

                break;

        }
        
        System.exit(0);

    }

}
