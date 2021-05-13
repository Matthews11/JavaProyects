/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.model;

/**
 *
 * @author jared
 */
public class CasosBeans {
    private int idCaso;
    private String descripcionA;
    private String descripcionJ;
    private int idDepartamento;
    private String razonRechazo;
    private int idEstadoCaso;
    private int idProgramador;
    private int porcentajeAvance;
    private String fechaJD;
    private int dEmpleado;
    private int iDjefe;
    private int IdTester;

    public int getIdTester() {
        return IdTester;
    }

    public void setIdTester(int IdTester) {
        this.IdTester = IdTester;
    }

    public CasosBeans() {
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getDescripcionJ() {
        return descripcionJ;
    }

    public void setDescripcionJ(String descripcionJ) {
        this.descripcionJ = descripcionJ;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getRazonRechazo() {
        return razonRechazo;
    }

    public void setRazonRechazo(String razonRechazo) {
        this.razonRechazo = razonRechazo;
    }

    public int getIdEstadoCaso() {
        return idEstadoCaso;
    }

    public void setIdEstadoCaso(int idEstadoCaso) {
        this.idEstadoCaso = idEstadoCaso;
    }

    public int getIdProgramador() {
        return idProgramador;
    }

    public void setIdProgramador(int idProgramador) {
        this.idProgramador = idProgramador;
    }

    public int getPorcentajeAvance() {
        return porcentajeAvance;
    }

    public void setPorcentajeAvance(int porcentajeAvance) {
        this.porcentajeAvance = porcentajeAvance;
    }

    public String getFechaJD() {
        return fechaJD;
    }

    public void setFechaJD(String fechaJD) {
        this.fechaJD = fechaJD;
    }

    public int getdEmpleado() {
        return dEmpleado;
    }

    public void setdEmpleado(int dEmpleado) {
        this.dEmpleado = dEmpleado;
    }

    public int getiDjefe() {
        return iDjefe;
    }

    public void setiDjefe(int iDjefe) {
        this.iDjefe = iDjefe;
    }

    
    
}
