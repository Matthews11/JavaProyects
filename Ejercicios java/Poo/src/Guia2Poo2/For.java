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
public class For {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int valor;
        String strnumero = JOptionPane.showInputDialog("Ingrese un Numero: ");
        numero = Integer.parseInt(strnumero);
        valor = numero;
        //long resultado=1;
        for (int i = 1; i < valor; i++) {
            numero = numero * i;
            System.out.println(numero);
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + valor + " es: "
                + numero, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("El factorial es " + numero);
    }

}
