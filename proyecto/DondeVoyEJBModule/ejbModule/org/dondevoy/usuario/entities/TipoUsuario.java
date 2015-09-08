package org.dondevoy.usuario.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public enum TipoUsuario {
	PERSONA("Persona"), ENTIDAD("Entidad");
	
	private String nombreTipoUsuario;

	private TipoUsuario(String nombreTipoUsuario){
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	
	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	
	
}
