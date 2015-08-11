package org.dondevoy.entidad.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadoSucursal {

	private Date fechaCambio;
	
	private SucursalEstado sucursalEstado;

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public SucursalEstado getSucursalEstado() {
		return sucursalEstado;
	}

	public void setSucursalEstado(SucursalEstado sucursalEstado) {
		this.sucursalEstado = sucursalEstado;
	}
	
	
}
