package org.dondevoy.entidad.entities;

public enum Dia {
	LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miercoles"), JUEVES("Jueves"), VIERNES(
			"Viernes"), SABADO("Sabado"), DOMINGO("Domingi");
	private String nombreDia;

	private Dia(String nombreDia) {
		this.nombreDia = nombreDia;
	}

	public String getNombreDia() {
		return nombreDia;
	}
	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}
}
