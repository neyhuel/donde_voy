package org.dondevoy.usuario.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoUsuario {

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
