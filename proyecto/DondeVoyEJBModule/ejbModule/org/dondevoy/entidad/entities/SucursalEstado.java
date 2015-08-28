package org.dondevoy.entidad.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public enum SucursalEstado {
	ACTIVA("Activa","DescripcionActiva"), INACTIVA("Inactiva","DescripcionInactiva");
	private String descripcion;
	private String nombreEstado;
	
	private SucursalEstado(String nombreEstado, String descripcion){
		this.descripcion = descripcion;
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
