/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.Recursos;

import java.sql.SQLException;
import sv.controls.company.DAO.JAFDao;
import sv.controls.company.model.CasosBeans;

/**
 *
 * @author jared
 */
public class SeleccionD {

    public void verificar(String descripcionj, String programador, String fecha, String id) throws SQLException {

        int progra, estado,id2;
        CasosBeans CB = new CasosBeans();

        JAFDao AF = new JAFDao();
        switch (programador) {

            case "Jared Pineda":
                
                id2 = Integer.parseInt(id)  ;

                progra = 1;
                estado = 3;
                CB.setDescripcionJ(descripcionj);
                CB.setIdProgramador(progra);
                CB.setFechaJD(fecha);
                CB.setIdEstadoCaso(estado);
                CB.setIdCaso(id2);
                AF.aceptar(CB);

                break;

            case "Alejandro":

                progra = 2;
                estado = 3;
                CB.setDescripcionA(descripcionj);
                CB.setIdProgramador(progra);
                CB.setFechaJD(fecha);
                AF.ingresar(CB);

                break;
        }
    }

}
