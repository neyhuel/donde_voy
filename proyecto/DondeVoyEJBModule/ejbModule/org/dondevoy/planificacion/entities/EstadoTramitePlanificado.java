package org.dondevoy.planificacion.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoTramitePlanificado {

	private Date fechaCambio;
	
	private TramitePlanificadoEstado tramitePlanificadoEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public TramitePlanificadoEstado getTramitePlanificadoEstado() {
		return tramitePlanificadoEstado;
	}

	public void setTramitePlanificadoEstado(
			TramitePlanificadoEstado tramitePlanificadoEstado) {
		this.tramitePlanificadoEstado = tramitePlanificadoEstado;
	}
	
	
}
