package com.hibernate.www.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="EMPLEADOS")

public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5321859749658046399L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COD_Emp",nullable = false)
	private Long codigo;
	
	@Column(name="NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name="APELLIDOS", nullable = false)
	private String apellidos;
	
	@Column(name="FECHA", nullable = false)
	private Date fecha;
	
	

	public Empleado() {
	}

	public Empleado(Long codigo, String nombre, String apellido, Date fecha) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.fecha = fecha;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		 
		return "Empleado: codigo "+codigo+" nombre "+nombre+" apellido "+apellidos+ " fecha "+fecha;
	}
	
	

}
