/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia10;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jared
 */
public class CodigoBean {

    private String apellido1;
    private String apellido2;
    private int cantidad_registros;
    private String anio_actual;
    private String soloLetra;
    private String soloLetra2;
    private String cod;

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getCantidad_registros() {
        return cantidad_registros;
    }

    public void setCantidad_registros(int cantidad_registros) {
        this.cantidad_registros = cantidad_registros;
    }

    public String getCod() {
        Date d = new Date();
        SimpleDateFormat anio = new SimpleDateFormat("yy");
        DecimalFormat dosDigitos = new DecimalFormat("0000");
        anio_actual = anio.format(d);
        soloLetra = apellido1.substring(0, 1);
        soloLetra2 = apellido2.substring(0, 1);
        int aumentregistros = cantidad_registros + 1;
        String regitros = String.valueOf(dosDigitos.format(aumentregistros));
        String codigo = soloLetra + soloLetra2 + anio_actual + regitros;
        return codigo;
    }
}

