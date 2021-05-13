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
public class Cuadros_de_dialogos {

    public static void main(String[] args) {

        while (true) {
            try {
                String nombre = JOptionPane.showInputDialog("Como te llamas ?");
                String entrada = JOptionPane.showInputDialog("Cuantos años tienes");
                int edad = Integer.parseInt(entrada);

                JOptionPane.showMessageDialog(null, "Hola, " + nombre + ". El año que viene tendrás "
                        + (edad + 1) + "años", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
               
                JOptionPane.showMessageDialog(null, "Error en algun dato de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                String seleccion = (String) JOptionPane.showInputDialog(
                        null,
                        "Desea Salir",
                        "Seleccione una opcion",
                        JOptionPane.QUESTION_MESSAGE,
                        null, // null para icono defecto
                        new Object[]{"Si", "No"},
                        "si");
                if (seleccion.equals("Si")) {
                    System.exit(0);
                    break;
                }
            }//fin de catch
        }//fin de while

    }

}
