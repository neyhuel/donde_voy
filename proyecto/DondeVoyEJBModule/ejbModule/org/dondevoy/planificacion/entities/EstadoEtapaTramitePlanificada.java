package org.dondevoy.planificacion.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoEtapaTramitePlanificada {

	private Date fechaCambio;
	
	private EtapaTramitePlanificadaEstado etapaTramitePlanificadaEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public EtapaTramitePlanificadaEstado getEtapaTramitePlanificadaEstado() {
		return etapaTramitePlanificadaEstado;
	}

	public void setEtapaTramitePlanificadaEstado(
			EtapaTramitePlanificadaEstado etapaTramitePlanificadaEstado) {
		this.etapaTramitePlanificadaEstado = etapaTramitePlanificadaEstado;
	}
	
	
}
