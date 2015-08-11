package org.dondevoy.planificacion.entities;

import java.util.Date;

public class ParametroEtapaTramite {
	
	private Date fecha;
	private int tiempoAtencionPromedio;
	private int tiempoEsperaPromedio;
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTiempoAtencionPromedio() {
		return tiempoAtencionPromedio;
	}
	public void setTiempoAtencionPromedio(int tiempoAtencionPromedio) {
		this.tiempoAtencionPromedio = tiempoAtencionPromedio;
	}
	public int getTiempoEsperaPromedio() {
		return tiempoEsperaPromedio;
	}
	public void setTiempoEsperaPromedio(int tiempoEsperaPromedio) {
		this.tiempoEsperaPromedio = tiempoEsperaPromedio;
	}
	
	
}
