/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodigoBean {

    private String apellido1;
    private String apellido2;
    private int cantidad_registros;
    private String anio_actual;
    private String soloLetra;
    private String soloLetra2;

    public CodigoBean() {
    }


    /**
     * @return the apellido
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the cantidad_registros
     */
    public int getCantidad_registros() {
        return cantidad_registros;
    }

    /**
     * @param cantidad_registros the cantidad_registros to set
     */
    public void setCantidad_registros(int cantidad_registros) {
        this.cantidad_registros = cantidad_registros;
    }

    public String getFecha() {
        Date d = new Date();
        SimpleDateFormat anio = new SimpleDateFormat("yy");
        anio_actual = anio.format(d);
        return anio_actual;
    }

    public String getLetra() {
        soloLetra = apellido1.substring(0, 1);
        return soloLetra;
    }

    public String getLetra2() {
        soloLetra2 = apellido2.substring(0, 1);
        return soloLetra2;
    }

    public String getCod() {
        int aumentregistros = cantidad_registros + 1;
        String regitros = String.valueOf(aumentregistros);
        String codigo = soloLetra + soloLetra2 + anio_actual + regitros;
        return codigo;
    }
}
