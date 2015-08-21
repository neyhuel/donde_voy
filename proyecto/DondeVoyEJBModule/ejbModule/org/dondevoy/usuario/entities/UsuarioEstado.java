package org.dondevoy.usuario.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class UsuarioEstado {

	@Id
	private int idUsuarioEstado;
	
	private String descripcionUsuarioEstado;
	private String nombreUsuarioEstado;
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
