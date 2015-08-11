package org.dondevoy.planificacion.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class DocumentoRequerido {

	private int copiasNecesarias;
	private String descripcionDocumento;
	private String nombreDocumento;
	public int getCopiasNecesarias() {
		return copiasNecesarias;
	}
	public void setCopiasNecesarias(int copiasNecesarias) {
		this.copiasNecesarias = copiasNecesarias;
	}
	public String getDescripcionDocumento() {
		return descripcionDocumento;
	}
	public void setDescripcionDocumento(String descripcionDocumento) {
		this.descripcionDocumento = descripcionDocumento;
	}
	public String getNombreDocumento() {
		return nombreDocumento;
	}
	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}
	
	
}
