package org.dondevoy.entidad.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public enum EntidadEstado {
	ACTIVA("Activa"), INACTIVA("Inactiva");
	private String descripcion;
	private String nombreEstado;
	
	
	private EntidadEstado(String nombreEstado){
		this.nombreEstado = nombreEstado;
	}

	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreEstado() {
		return nombreEstado;
	}
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	
	
}
