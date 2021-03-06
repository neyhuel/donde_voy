package org.dondevoy.entidad.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono {

	@Id
	private int idTelefono;
	private String codigoAreaTelefono;
	private String codigoInternacional;
	private String numeroTelefono;
	private TipoTelefono tipoTelefono;

	public Telefono(String codigoAreaTelefono, String codigoInternacional,
			String numeroTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.codigoInternacional = codigoInternacional;
		this.numeroTelefono = numeroTelefono;
	}

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
	public TipoTelefono getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(TipoTelefono tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

}
