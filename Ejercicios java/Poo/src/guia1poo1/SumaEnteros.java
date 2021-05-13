/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

/**
 *
 * @author jared
 */
import javax.swing.JOptionPane;

public class SumaEnteros {

    public static void main(String[] args) {

        String N1 = "";
        String N2 = "";

        int Num1 = 0;
        int Num2 = 0;
        int suma = 0;

        JOptionPane.showMessageDialog(null, "Este programa solo acepta numeros positivos");
        N1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        N2 = JOptionPane.showInputDialog("Ingrese el segundo numero");

        Num1 = Integer.parseInt(N1);
        Num2 = Integer.parseInt(N2);

        if (Num1 < 0) {
            JOptionPane.showMessageDialog(null, "No se pueden operar numeros negativos");
            JOptionPane.showMessageDialog(null, "Pase un feliz dia");
            System.exit(0);
        } else if (Num2 < 0) {
            JOptionPane.showMessageDialog(null, "No se pueden operar numeros negativos");
            JOptionPane.showMessageDialog(null, "Pase un feliz dia");
        } else {
            suma = Num1 + Num2;

            JOptionPane.showMessageDialog(null, "La suma es " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

    }

}
