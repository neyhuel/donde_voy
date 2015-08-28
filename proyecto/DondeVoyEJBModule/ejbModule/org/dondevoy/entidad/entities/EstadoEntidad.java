package org.dondevoy.entidad.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class EstadoEntidad {
	
	@Id
	private int idEstadoEntidad;
	private Date fechaCambio;
	private EntidadEstado entidadEstado;
	
	public EstadoEntidad(){};
	public EstadoEntidad(Date fechaCambio,EntidadEstado entidadEstado){
		this.fechaCambio = fechaCambio;
		this.entidadEstado = entidadEstado;
	}
	
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
