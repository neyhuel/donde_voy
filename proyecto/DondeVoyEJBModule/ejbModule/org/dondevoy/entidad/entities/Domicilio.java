package org.dondevoy.entidad.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Domicilio {
	
	@Id
	private int idDomicilio;
	private String calle;
	private String casa;
	private String departamento;
	private String interseccion1;
	private String interseccion2;
	private String latitud;
	private String longitud;
	private String manzana;
	private String torre;
	
	//@ManyToOne
	private Localidad localidad;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getInterseccion1() {
		return interseccion1;
	}

	public void setInterseccion1(String interseccion1) {
		this.interseccion1 = interseccion1;
	}

	public String getInterseccion2() {
		return interseccion2;
	}

	public void setInterseccion2(String interseccion2) {
		this.interseccion2 = interseccion2;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getTorre() {
		return torre;
	}

	public void setTorre(String torre) {
		this.torre = torre;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
}
