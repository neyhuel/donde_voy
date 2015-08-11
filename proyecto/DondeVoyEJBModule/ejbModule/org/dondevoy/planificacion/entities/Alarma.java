package org.dondevoy.planificacion.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class Alarma {

	private int cantidadDiasAnticipacion;
	private int cantidadHorasAnticipacion;
	private String descripcionAlarma;
	private Date fechaAlarmaInicio;
	private Date fechaAlarmaObjetivo;
	public int getCantidadDiasAnticipacion() {
		return cantidadDiasAnticipacion;
	}
	public void setCantidadDiasAnticipacion(int cantidadDiasAnticipacion) {
		this.cantidadDiasAnticipacion = cantidadDiasAnticipacion;
	}
	public int getCantidadHorasAnticipacion() {
		return cantidadHorasAnticipacion;
	}
	public void setCantidadHorasAnticipacion(int cantidadHorasAnticipacion) {
		this.cantidadHorasAnticipacion = cantidadHorasAnticipacion;
	}
	public String getDescripcionAlarma() {
		return descripcionAlarma;
	}
	public void setDescripcionAlarma(String descripcionAlarma) {
		this.descripcionAlarma = descripcionAlarma;
	}
	public Date getFechaAlarmaInicio() {
		return fechaAlarmaInicio;
	}
	public void setFechaAlarmaInicio(Date fechaAlarmaInicio) {
		this.fechaAlarmaInicio = fechaAlarmaInicio;
	}
	public Date getFechaAlarmaObjetivo() {
		return fechaAlarmaObjetivo;
	}
	public void setFechaAlarmaObjetivo(Date fechaAlarmaObjetivo) {
		this.fechaAlarmaObjetivo = fechaAlarmaObjetivo;
	}
	
	
}
