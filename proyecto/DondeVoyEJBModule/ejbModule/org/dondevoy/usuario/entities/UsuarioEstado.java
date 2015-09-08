package org.dondevoy.usuario.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public enum UsuarioEstado {
	ACTIVO("Activo"), INACTIVO("Inactivo");
	
	private String descripcionUsuarioEstado;
	private String nombreUsuarioEstado;
	
	private UsuarioEstado(String nombreUsuarioEstado) {
		this.nombreUsuarioEstado = nombreUsuarioEstado;
	}
	
	public String getDescripcionUsuarioEstado() {
		return descripcionUsuarioEstado;
	}
	public void setDescripcionUsuarioEstado(String descripcionUsuarioEstado) {
		this.descripcionUsuarioEstado = descripcionUsuarioEstado;
	}
	public String getNombreUsuarioEstado() {
		return nombreUsuarioEstado;
	}
	public void setNombreUsuarioEstado(String nombreUsuarioEstado) {
		this.nombreUsuarioEstado = nombreUsuarioEstado;
	}
	
	
}
