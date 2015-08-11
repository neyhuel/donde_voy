package org.dondevoy.entidad.entities;

import java.util.List;

import org.dondevoy.planificacion.entities.Tramite;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class Entidad {

	private String nombreEntidad;
	
	private List<EstadoEntidad> listEstadoEntidad;
	private List<Sucursal> listSucursal;
	private TipoEntidad tipoEntidad;
	private List<Tramite> listTramite;
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public List<EstadoEntidad> getListEstadoEntidad() {
		return listEstadoEntidad;
	}
	public void setListEstadoEntidad(List<EstadoEntidad> listEstadoEntidad) {
		this.listEstadoEntidad = listEstadoEntidad;
	}
	public List<Sucursal> getListSucursal() {
		return listSucursal;
	}
	public void setListSucursal(List<Sucursal> listSucursal) {
		this.listSucursal = listSucursal;
	}
	public TipoEntidad getTipoEntidad() {
		return tipoEntidad;
	}
	public void setTipoEntidad(TipoEntidad tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}
	public List<Tramite> getListTramite() {
		return listTramite;
	}
	public void setListTramite(List<Tramite> listTramite) {
		this.listTramite = listTramite;
	}
	
	
}
