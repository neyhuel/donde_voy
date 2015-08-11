package org.dondevoy.planificacion.entities;

import java.util.Date;
import java.util.List;

import org.dondevoy.usuario.entities.Usuario;

public class Planificacion {

	private Date fechaPlanificacion;
	
	private Usuario usuario;
	private List<TramitePlanificado> listTramitePlanificado;
	public Date getFechaPlanificacion() {
		return fechaPlanificacion;
	}
	public void setFechaPlanificacion(Date fechaPlanificacion) {
		this.fechaPlanificacion = fechaPlanificacion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<TramitePlanificado> getListTramitePlanificado() {
		return listTramitePlanificado;
	}
	public void setListTramitePlanificado(
			List<TramitePlanificado> listTramitePlanificado) {
		this.listTramitePlanificado = listTramitePlanificado;
	}
	
	
}
