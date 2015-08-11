package org.dondevoy.planificacion.entities;

import java.util.Date;
import java.util.List;

public class EtapaTramitePlanificada {

	private Date fechaInicio;
	private boolean notificado;
	
	private EstadisticasEtapa estadisticasEtapa;
	private EtapaTramite etapaTramite;
	private List<EstadoEtapaTramitePlanificada> listEstadoEtapaTramitePlanificada;
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public boolean isNotificado() {
		return notificado;
	}
	public void setNotificado(boolean notificado) {
		this.notificado = notificado;
	}
	public EstadisticasEtapa getEstadisticasEtapa() {
		return estadisticasEtapa;
	}
	public void setEstadisticasEtapa(EstadisticasEtapa estadisticasEtapa) {
		this.estadisticasEtapa = estadisticasEtapa;
	}
	public EtapaTramite getEtapaTramite() {
		return etapaTramite;
	}
	public void setEtapaTramite(EtapaTramite etapaTramite) {
		this.etapaTramite = etapaTramite;
	}
	public List<EstadoEtapaTramitePlanificada> getListEstadoEtapaTramitePlanificada() {
		return listEstadoEtapaTramitePlanificada;
	}
	public void setListEstadoEtapaTramitePlanificada(
			List<EstadoEtapaTramitePlanificada> listEstadoEtapaTramitePlanificada) {
		this.listEstadoEtapaTramitePlanificada = listEstadoEtapaTramitePlanificada;
	}
	
	
}
