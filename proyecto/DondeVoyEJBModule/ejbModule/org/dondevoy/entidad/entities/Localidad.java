package org.dondevoy.entidad.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class Localidad {

	private String nombreLocalidad;
	
	private Provincia provincia;

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
