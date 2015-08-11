package org.dondevoy.planificacion.entities;

import java.util.List;

import org.dondevoy.entidad.entities.Entidad;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EtapaTramite {

	private String descripcionEtapaTramite;
	private String nombreEtapaTramite;
	private String ordenEtapa;
	
	private Entidad entidad;
	private List<ParametroEtapaTramite> listParametroEtapaTramite;
	private EtapaTramite etapaTramite;
	public String getDescripcionEtapaTramite() {
		return descripcionEtapaTramite;
	}
	public void setDescripcionEtapaTramite(String descripcionEtapaTramite) {
		this.descripcionEtapaTramite = descripcionEtapaTramite;
	}
	public String getNombreEtapaTramite() {
		return nombreEtapaTramite;
	}
	public void setNombreEtapaTramite(String nombreEtapaTramite) {
		this.nombreEtapaTramite = nombreEtapaTramite;
	}
	public String getOrdenEtapa() {
		return ordenEtapa;
	}
	public void setOrdenEtapa(String ordenEtapa) {
		this.ordenEtapa = ordenEtapa;
	}
	public Entidad getEntidad() {
		return entidad;
	}
	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}
	public List<ParametroEtapaTramite> getListParametroEtapaTramite() {
		return listParametroEtapaTramite;
	}
	public void setListParametroEtapaTramite(
			List<ParametroEtapaTramite> listParametroEtapaTramite) {
		this.listParametroEtapaTramite = listParametroEtapaTramite;
	}
	public EtapaTramite getEtapaTramite() {
		return etapaTramite;
	}
	public void setEtapaTramite(EtapaTramite etapaTramite) {
		this.etapaTramite = etapaTramite;
	}
	
	
}
