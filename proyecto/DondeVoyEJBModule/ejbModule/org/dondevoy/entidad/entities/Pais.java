package org.dondevoy.entidad.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class Pais {

	@Id
	private int idPais;
	private String abreviaturaNombrePais;
	private String codigoAreaPais;
	private String nombrePais;
	private String zonaHoraria;
	
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getAbreviaturaNombrePais() {
		return abreviaturaNombrePais;
	}
	public void setAbreviaturaNombre(String abreviaturaNombrePais) {
		this.abreviaturaNombrePais = abreviaturaNombrePais;
	}
	public String getCodigoAreaPais() {
		return codigoAreaPais;
	}
	public void setCodigoAreaPais(String codigoAreaPais) {
		this.codigoAreaPais = codigoAreaPais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public String getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}
	
	
}
