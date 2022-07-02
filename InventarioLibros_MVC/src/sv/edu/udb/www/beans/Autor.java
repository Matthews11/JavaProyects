package sv.edu.udb.www.beans;

public class Autor {

	private String codigoAutor;
	private String nombreAutor;
	private String nacionalidad;

	public Autor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public Autor() {
		this.codigoAutor = "";
		this.nombreAutor = "";
		this.nacionalidad = "";
	}

	public Autor(String codigoAutor, String nombreAutor, String nacionalidadAutor) {
		this.codigoAutor = codigoAutor;
		this.nombreAutor = nombreAutor;
		this.nacionalidad = nacionalidadAutor;
	}

	public String getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(String codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getNacionalidadAutor() {
		return nacionalidad;
	}

	public void setNacionalidadAutor(String nacionalidadAutor) {
		this.nacionalidad = nacionalidadAutor;
	}

}
