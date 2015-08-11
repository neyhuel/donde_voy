package org.dondevoy.planificacion.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class ArchivoAsociado {

	private Date fechaAsociacion;
	private String nombreArchivo;
	public Date getFechaAsociacion() {
		return fechaAsociacion;
	}
	public void setFechaAsociacion(Date fechaAsociacion) {
		this.fechaAsociacion = fechaAsociacion;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	
}
