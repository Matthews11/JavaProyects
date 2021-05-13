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
public class eleccion {

    private String opc;
    private String id;
    private String nombre;
    private String interna;
     

    estudiante P = new estudiante();

    public void elegir() {
        opc = JOptionPane.showInputDialog("1. Ingreso de estudiante \n"
                + "2. Ver estudiante \n"
                + "3. Buscar Estudiante \n"
                + "4. Salir");
        switch (opc) {

            case "1":

                id = JOptionPane.showInputDialog("Ingrese su carnet");
                nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                interna = JOptionPane.showInputDialog("Ingrese la interna");
                  
                P.ingresarEstudiante(id, nombre,interna);

                sino();
                break;

            case "2":

                P.verEstudiante();
                sino();
                break;

            case "3":

                interna = JOptionPane.showInputDialog("Ingrese la interna");
                P.buscarEstudiante(interna);
                sino();
                break;

            case "4":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Losiento Usted eligio una eleccion invalida");
                sino();
                break;
        }

    }

    public void sino() {
        String opc3;
        opc3 = JOptionPane.showInputDialog("Desea salir? \n"
                + "1.no \n"
                + "2.si \n");

        switch (opc3) {

            case "1":
                elegir();
                break;

            case "2":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Losiento Usted eligio una eleccion invalida");
                sino();
                break;

        }

    }
}
