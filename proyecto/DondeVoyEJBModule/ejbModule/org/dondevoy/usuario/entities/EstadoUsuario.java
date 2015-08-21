package org.dondevoy.usuario.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class EstadoUsuario {

	@Id
	private int idEstadoUsuario;
	private Date fechaCambio;
	
	private UsuarioEstado usuarioEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public UsuarioEstado getUsuarioEstado() {
		return usuarioEstado;
	}

	public void setUsuarioEstado(UsuarioEstado usuarioEstado) {
		this.usuarioEstado = usuarioEstado;
	}
	
	
}
