package org.dondevoy.entidad.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HorarioDeAtencionEntidad {
    
	@Id
	private int idHorarioDeAtencionEntidad;
	private Date horarioAperturaEntidad;
	private Date horaroCierreEntidad;
	private Dia dia;

	public HorarioDeAtencionEntidad(){}
	public HorarioDeAtencionEntidad(Date horarioApertura, Date horarioCierre){
		this.horarioAperturaEntidad = horarioApertura;
		this.horaroCierreEntidad = horarioCierre;
	}
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
