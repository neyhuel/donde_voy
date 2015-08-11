package org.dondevoy.entidad.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class ReporteTurnero {

	private int cantidadTurnosDia;
	private int cantidadTurnosNuevos;
	private Date fechaReporte;
	private int nroReporte;
	private int nroTurnoActual;
	

	private Sucursal sucursal;

	public int getCantidadTurnosDia() {
		return cantidadTurnosDia;
	}

	public void setCantidadTurnosDia(int cantidadTurnosDia) {
		this.cantidadTurnosDia = cantidadTurnosDia;
	}

	public int getCantidadTurnosNuevos() {
		return cantidadTurnosNuevos;
	}

	public void setCantidadTurnosNuevos(int cantidadTurnosNuevos) {
		this.cantidadTurnosNuevos = cantidadTurnosNuevos;
	}

	public Date getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public int getNroReporte() {
		return nroReporte;
	}

	public void setNroReporte(int nroReporte) {
		this.nroReporte = nroReporte;
	}

	public int getNroTurnoActual() {
		return nroTurnoActual;
	}

	public void setNroTurnoActual(int nroTurnoActual) {
		this.nroTurnoActual = nroTurnoActual;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
