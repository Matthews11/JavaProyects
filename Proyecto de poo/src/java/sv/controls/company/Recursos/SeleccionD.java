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

    public void verificar(String descripcionj, String programador, String fecha, String id, String Tester) throws SQLException {

        int progra, test,estado,id2,porcentaje;
        CasosBeans CB = new CasosBeans();

        JAFDao AF = new JAFDao();
        switch (programador) {

            case "Jared Pineda":
                
                 switch (Tester) {

            case "Carlos Andino":
                
                id2 = Integer.parseInt(id)  ;

                progra = 1;
                estado = 3;
                test=1;
                porcentaje=50;
                CB.setDescripcionJ(descripcionj);
                CB.setIdProgramador(progra);
                CB.setFechaJD(fecha);
                CB.setIdEstadoCaso(estado);
                CB.setIdCaso(id2);
                CB.setIdTester(test);
                CB.setPorcentajeAvance(porcentaje);
                AF.aceptar(CB);

                break;

            case "Emerson Dave":

                id2 = Integer.parseInt(id)  ;

                progra = 1;
                estado = 3;
                test=2;
                porcentaje=50;
                CB.setDescripcionJ(descripcionj);
                CB.setIdProgramador(progra);
                CB.setFechaJD(fecha);
                CB.setIdEstadoCaso(estado);
                CB.setPorcentajeAvance(porcentaje);
                CB.setIdCaso(id2);
                CB.setIdTester(test);
                AF.aceptar(CB);

                break;
        }
              
                break;

            case "Alejandro":

                 switch (Tester) {

            case "Carlos Andino":
                
                id2 = Integer.parseInt(id)  ;

                progra = 2;
                estado = 3;
                test=1;
                
                porcentaje=50;
                CB.setDescripcionJ(descripcionj);
                CB.setIdProgramador(progra);
                CB.setPorcentajeAvance(porcentaje);
                CB.setFechaJD(fecha);
                CB.setIdEstadoCaso(estado);
                CB.setIdCaso(id2);
                CB.setIdTester(test);
                AF.aceptar(CB);

                break;

            case "Emerson Dave":

                id2 = Integer.parseInt(id)  ;

                progra = 2;
                estado = 3;
                test=2;
                
                porcentaje=50;
                CB.setDescripcionJ(descripcionj);
                CB.setIdProgramador(progra);
                CB.setFechaJD(fecha);
                CB.setIdEstadoCaso(estado);
                CB.setPorcentajeAvance(porcentaje);
                CB.setIdCaso(id2);
                CB.setIdTester(test);
                AF.aceptar(CB);

                break;
        }
              

                break;
        }
    }

}
