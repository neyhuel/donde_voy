package org.dondevoy.entidad.dto;

import javax.persistence.Id;

public class TelefonoDTO {
	@Id
	private int idTelefono;
	private String codigoAreaTelefono;
	private String codigoInternacional;
	private String numeroTelefono;
	public String getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}
	public void setCodigoAreaTelefono(String codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}
	public String getCodigoInternacional() {
		return codigoInternacional;
	}
	public void setCodigoInternacional(String codigoInternacional) {
		this.codigoInternacional = codigoInternacional;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
}
