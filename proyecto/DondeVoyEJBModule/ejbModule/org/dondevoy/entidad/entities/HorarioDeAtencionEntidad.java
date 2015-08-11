package org.dondevoy.entidad.entities;

import java.util.Date;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class HorarioDeAtencionEntidad {

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
