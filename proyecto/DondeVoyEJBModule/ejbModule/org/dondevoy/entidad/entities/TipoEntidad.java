package org.dondevoy.entidad.entities;

import javax.persistence.Entity;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public enum TipoEntidad {
	PUBLICA("Pública"), PRIVADA("Privada");
	private String nombreTipoEntidad;
	
	private TipoEntidad(String nombreTipoEntidad){
		this.nombreTipoEntidad = nombreTipoEntidad;
	}

	public String getNombreTipoEntidad() {
		return nombreTipoEntidad;
	}

	public void setNombreTipoEntidad(String nombreTipoEntidad) {
		this.nombreTipoEntidad = nombreTipoEntidad;
	}
	
	
}
