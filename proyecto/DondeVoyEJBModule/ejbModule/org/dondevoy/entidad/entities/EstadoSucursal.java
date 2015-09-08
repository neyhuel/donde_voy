package org.dondevoy.entidad.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 * 
 */
@Entity
public class EstadoSucursal {
	
	@Id
	private int idEstadoSucursal;
	private Date fechaCambio;
	private SucursalEstado sucursalEstado;
	
	public EstadoSucursal(){};
	public EstadoSucursal(Date fechaCambio,SucursalEstado sucursalEstado){
		this.fechaCambio = fechaCambio;
		this.sucursalEstado = sucursalEstado;
	}
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
