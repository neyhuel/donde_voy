package org.dondevoy.planificacion.entities;

import java.util.List;

public class Tramite {

	private String descripcionTramite;
	private String nombreTramite;
	
	private List<HorarioAtencionTramite> listHorarioAtencionTramite;
	private List<ListaRequerimientos> listListaRequerimientos;
	private List<UrlTramiteWeb> listUrlTramiteWeb;
	private List<EtapaTramite> listEtapaTramite;
	private List<EstadoTramite> listEstadoTramite;
	private List<ParametrosTramite> listParametrosTramite;
	public String getDescripcionTramite() {
		return descripcionTramite;
	}
	public void setDescripcionTramite(String descripcionTramite) {
		this.descripcionTramite = descripcionTramite;
	}
	public String getNombreTramite() {
		return nombreTramite;
	}
	public void setNombreTramite(String nombreTramite) {
		this.nombreTramite = nombreTramite;
	}
	public List<HorarioAtencionTramite> getListHorarioAtencionTramite() {
		return listHorarioAtencionTramite;
	}
	public void setListHorarioAtencionTramite(
			List<HorarioAtencionTramite> listHorarioAtencionTramite) {
		this.listHorarioAtencionTramite = listHorarioAtencionTramite;
	}
	public List<ListaRequerimientos> getListListaRequerimientos() {
		return listListaRequerimientos;
	}
	public void setListListaRequerimientos(
			List<ListaRequerimientos> listListaRequerimientos) {
		this.listListaRequerimientos = listListaRequerimientos;
	}
	public List<UrlTramiteWeb> getListUrlTramiteWeb() {
		return listUrlTramiteWeb;
	}
	public void setListUrlTramiteWeb(List<UrlTramiteWeb> listUrlTramiteWeb) {
		this.listUrlTramiteWeb = listUrlTramiteWeb;
	}
	public List<EtapaTramite> getListEtapaTramite() {
		return listEtapaTramite;
	}
	public void setListEtapaTramite(List<EtapaTramite> listEtapaTramite) {
		this.listEtapaTramite = listEtapaTramite;
	}
	public List<EstadoTramite> getListEstadoTramite() {
		return listEstadoTramite;
	}
	public void setListEstadoTramite(List<EstadoTramite> listEstadoTramite) {
		this.listEstadoTramite = listEstadoTramite;
	}
	public List<ParametrosTramite> getListParametrosTramite() {
		return listParametrosTramite;
	}
	public void setListParametrosTramite(
			List<ParametrosTramite> listParametrosTramite) {
		this.listParametrosTramite = listParametrosTramite;
	}
	
	
}
