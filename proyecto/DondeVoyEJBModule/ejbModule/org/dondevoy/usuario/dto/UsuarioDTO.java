package org.dondevoy.usuario.dto;

import java.io.Serializable;
import java.util.List;

import org.dondevoy.usuario.entities.EstadoUsuario;
import org.dondevoy.usuario.entities.Nota;
import org.dondevoy.usuario.entities.TipoUsuario;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class UsuarioDTO implements Serializable {

	private String contraseña;
	private String correo;
	private String correoRecuperacion;
	private String nombreUsuario;
	private Boolean notificacionActivada;
	private TipoUsuario listTipoUsuario;
	
	private List<EstadoUsuario> listEstadoUsuario;
	private List<Nota> listNota;
	
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
	public TipoUsuario getListTipoUsuario() {
		return listTipoUsuario;
	}
	public void setListTipoUsuario(TipoUsuario listTipoUsuario) {
		this.listTipoUsuario = listTipoUsuario;
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
