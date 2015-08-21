package org.dondevoy.usuario.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class Nota {

	@Id
	private int idNota;
	
	private String descripcion;
	private Date fechaNota;
	private String titulo;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaNota() {
		return fechaNota;
	}
	public void setFechaNota(Date fechaNota) {
		this.fechaNota = fechaNota;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
