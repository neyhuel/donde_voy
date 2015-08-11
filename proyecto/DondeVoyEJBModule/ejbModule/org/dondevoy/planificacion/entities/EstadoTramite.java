package org.dondevoy.planificacion.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoTramite {

	private Date fechaCambio;
	
	private TramiteEstado tramiteEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public TramiteEstado getTramiteEstado() {
		return tramiteEstado;
	}

	public void setTramiteEstado(TramiteEstado tramiteEstado) {
		this.tramiteEstado = tramiteEstado;
	}
	
	
}
