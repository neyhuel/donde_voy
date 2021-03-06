package org.dondevoy.entidad.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.dondevoy.planificacion.entities.Tramite;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class Entidad {
	
	@Id
	private int idEntidad;
	private String nombreEntidad;
	@OneToMany
	private List<EstadoEntidad> listEstadoEntidad;
	@OneToMany
	private List<Sucursal> listSucursal;
	private TipoEntidad tipoEntidad;
	@OneToMany
	private List<Tramite> listTramite;
	
	public Entidad(){}
	public Entidad(String nombreEntidad,Sucursal sucursal, EstadoEntidad estadoEntidad){
		this.nombreEntidad = nombreEntidad;
		this.listSucursal.add(sucursal);
		this.listEstadoEntidad.add(estadoEntidad);
	}
	
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
	public void addEstadoEntidad(EstadoEntidad estadoEntidad){
		this.listEstadoEntidad.add(estadoEntidad);
	}
	
	public List<Sucursal> getListSucursal() {
		return listSucursal;
	}
	
	public void addSucursal(Sucursal sucursal){
		this.listSucursal.add(sucursal);
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
