package org.dondevoy.usuario.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Pablo Lucero
 * 
 *
 */
@Entity
public class Usuario {

	@Id
	private int idUsuario;
	private String contraseña;
	private String correo;
	private String correoRecuperacion;
	private String nombreUsuario;
	private Boolean notificacionActivada;
	
	@ManyToOne
	private TipoUsuario tipoUsuario;
	@OneToMany
	private List<EstadoUsuario> listEstadoUsuario;
	@OneToMany
	private List<Nota> listNota;
	
	public Usuario() {
		
	}

	public Usuario(String contraseña, String correo, String correoRecuperacion,
			String nombreUsuario, Boolean notificacionActivada) {
		super();
		this.contraseña = contraseña;
		this.correo = correo;
		this.correoRecuperacion = correoRecuperacion;
		this.nombreUsuario = nombreUsuario;
		this.notificacionActivada = notificacionActivada;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCorreoRecuperacion() {
		return correoRecuperacion;
	}
	public void setCorreoRecuperacion(String correoRecuperacion) {
		this.correoRecuperacion = correoRecuperacion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Boolean getNotificacionActivada() {
		return notificacionActivada;
	}
	public void setNotificacionActivada(Boolean notificacionActivada) {
		this.notificacionActivada = notificacionActivada;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public List<EstadoUsuario> getListEstadoUsuario() {
		return listEstadoUsuario;
	}
	public void setListEstadoUsuario(List<EstadoUsuario> listEstadoUsuario) {
		this.listEstadoUsuario = listEstadoUsuario;
	}
	public List<Nota> getListNota() {
		return listNota;
	}
	public void setListNota(List<Nota> listNota) {
		this.listNota = listNota;
	}
	
}
