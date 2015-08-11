package org.dondevoy.entidad.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoEntidad {

	private Date fechaCambio;
	
	private EntidadEstado entidadEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public EntidadEstado getEntidadEstado() {
		return entidadEstado;
	}

	public void setEntidadEstado(EntidadEstado entidadEstado) {
		this.entidadEstado = entidadEstado;
	}
	
	
}
