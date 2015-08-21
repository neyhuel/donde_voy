package org.dondevoy.usuario.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class TipoUsuario {

	@Id
	private int idTipoUsuario;
	private String nombreTipoUsuario;

	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	
	
}
