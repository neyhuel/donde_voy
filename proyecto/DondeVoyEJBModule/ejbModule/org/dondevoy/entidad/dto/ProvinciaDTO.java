package org.dondevoy.entidad.dto;

public class ProvinciaDTO {

	private int idProvincia;
	private String abreviaturaNombreProvincia;
	private String codigoAreaProvincia;
	private String nombreProvincia;
	private String zonaHoraria;
	
	private PaisDTO pais;
	
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getAbreviaturaNombreProvincia() {
		return abreviaturaNombreProvincia;
	}
	public void setAbreviaturaNombreProvincia(String abreviaturaNombreProvincia) {
		this.abreviaturaNombreProvincia = abreviaturaNombreProvincia;
	}
	public String getCodigoAreaProvincia() {
		return codigoAreaProvincia;
	}
	public void setCodigoAreaProvincia(String codigoAreaProvincia) {
		this.codigoAreaProvincia = codigoAreaProvincia;
	}
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	public String getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}
	public PaisDTO getPais() {
		return pais;
	}
	public void setPais(PaisDTO pais) {
		this.pais = pais;
	}
	
}
