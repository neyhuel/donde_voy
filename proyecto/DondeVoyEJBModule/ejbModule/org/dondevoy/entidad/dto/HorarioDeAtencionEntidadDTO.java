package org.dondevoy.entidad.dto;

import java.util.Date;

import javax.persistence.Id;

import org.dondevoy.entidad.entities.Dia;

public class HorarioDeAtencionEntidadDTO {
	@Id
	private int idHorarioDeAtencionEntidad;
	private Date horarioAperturaEntidad;
	private Date horaroCierreEntidad;
	private Dia dia;

	public Date getHorarioAperturaEntidad() {
		return horarioAperturaEntidad;
	}

	public void setHorarioAperturaEntidad(Date horarioAperturaEntidad) {
		this.horarioAperturaEntidad = horarioAperturaEntidad;
	}

	public Date getHoraroCierreEntidad() {
		return horaroCierreEntidad;
	}

	public void setHoraroCierreEntidad(Date horaroCierreEntidad) {
		this.horaroCierreEntidad = horaroCierreEntidad;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}
}
