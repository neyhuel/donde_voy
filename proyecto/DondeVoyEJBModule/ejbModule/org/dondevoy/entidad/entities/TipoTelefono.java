package org.dondevoy.entidad.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public enum TipoTelefono {

	FAX("Fax"), FIJO("Fijo"),CELULAR("Celular");
	private String nombreTipoTelefono;

	private TipoTelefono(String nombreTipoTelefono){
		this.nombreTipoTelefono = nombreTipoTelefono;
	}
	public String getNombreTipoTelefono() {
		return nombreTipoTelefono;
	}

	public void setNombreTipoTelefono(String nombreTipoTelefono) {
		this.nombreTipoTelefono = nombreTipoTelefono;
	}
	
	
}
