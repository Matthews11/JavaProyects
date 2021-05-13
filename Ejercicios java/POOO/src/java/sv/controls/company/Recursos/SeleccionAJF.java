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
public class SeleccionAJF {

    public void verificar(String descripcion, String jd, String departamento) throws SQLException {

        int j;
        int depa, estado, jefe=2;
        CasosBeans CB = new CasosBeans();
        JAFDao AF = new JAFDao();
        switch (departamento) {

            case "Comunicaciones":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 1;
                        j = 3;
                        estado = 1;

                        CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }

                break;
            case "Desarrollo":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 2;
                        j = 3;
                        estado = 1;

                        CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;
                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }
                break;

            case "Finanzas":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 3;
                        j = 3;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                          CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }

                break;

            case "Call center":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 4;
                        j = 3;
                        estado = 1;

                          CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }
                break;

            case "Jefes":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 5;
                        j = 3;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }

                break;

            case "Ventas":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 6;
                        j = 3;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }

                break;
            case "Tecnologia":

                switch (jd) {

                    case "Oscar Rodriguez":

                        depa = 7;
                        j = 3;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                    case "Emerson Dave":

                        depa = 1;
                        j = 4;
                        estado = 1;

                         CB.setDescripcionA(descripcion);
                        CB.setIdDepartamento(depa);
                        CB.setdEmpleado(j);
                        CB.setIdEstadoCaso(estado);
                        CB.setiDjefe(jefe);
                        AF.ingresar(CB);

                        break;

                }

                break;
        }
    }

}
