package org.dondevoy.planificacion.entities;

import java.util.Date;

import org.dondevoy.entidad.entities.Dia;

public class HorarioAtencionTramite {

	private Date horarioAperturaTramite;
	private Date horarioCierreTramite;
	
	private Dia dia;

	public Date getHorarioAperturaTramite() {
		return horarioAperturaTramite;
	}

	public void setHorarioAperturaTramite(Date horarioAperturaTramite) {
		this.horarioAperturaTramite = horarioAperturaTramite;
	}

	public Date getHorarioCierreTramite() {
		return horarioCierreTramite;
	}

	public void setHorarioCierreTramite(Date horarioCierreTramite) {
		this.horarioCierreTramite = horarioCierreTramite;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}
	
	
}
