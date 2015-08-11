package org.dondevoy.planificacion.entities;

import java.util.Date;
import java.util.List;

public class TramitePlanificado {

	private Date fechaInicio;
	
	private Tramite tramite;
	private List<EtapaTramitePlanificada> listEtapaTramitePlanificada;
	private List<EstadoTramitePlanificado> listEstadoTramitePlanificado;
	private List<Alarma> listAlarma;
	private List<ArchivoAsociado> listArchivoAsociado;
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Tramite getTramite() {
		return tramite;
	}
	public void setTramite(Tramite tramite) {
		this.tramite = tramite;
	}
	public List<EtapaTramitePlanificada> getListEtapaTramitePlanificada() {
		return listEtapaTramitePlanificada;
	}
	public void setListEtapaTramitePlanificada(
			List<EtapaTramitePlanificada> listEtapaTramitePlanificada) {
		this.listEtapaTramitePlanificada = listEtapaTramitePlanificada;
	}
	public List<EstadoTramitePlanificado> getListEstadoTramitePlanificado() {
		return listEstadoTramitePlanificado;
	}
	public void setListEstadoTramitePlanificado(
			List<EstadoTramitePlanificado> listEstadoTramitePlanificado) {
		this.listEstadoTramitePlanificado = listEstadoTramitePlanificado;
	}
	public List<Alarma> getListAlarma() {
		return listAlarma;
	}
	public void setListAlarma(List<Alarma> listAlarma) {
		this.listAlarma = listAlarma;
	}
	public List<ArchivoAsociado> getListArchivoAsociado() {
		return listArchivoAsociado;
	}
	public void setListArchivoAsociado(List<ArchivoAsociado> listArchivoAsociado) {
		this.listArchivoAsociado = listArchivoAsociado;
	}
	
	
}
