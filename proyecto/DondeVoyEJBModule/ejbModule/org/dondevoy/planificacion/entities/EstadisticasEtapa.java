package org.dondevoy.planificacion.entities;

/**
 * @author Pablo Lucero
 * 
 *
 */

public class EstadisticasEtapa {

	private boolean atencionSatisfactoria;
	private boolean finalizada;
	private int tiempoAtencion;
	private int tiempoEspera;
	public boolean isAtencionSatisfactoria() {
		return atencionSatisfactoria;
	}
	public void setAtencionSatisfactoria(boolean atencionSatisfactoria) {
		this.atencionSatisfactoria = atencionSatisfactoria;
	}
	public boolean isFinalizada() {
		return finalizada;
	}
	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	public int getTiempoAtencion() {
		return tiempoAtencion;
	}
	public void setTiempoAtencion(int tiempoAtencion) {
		this.tiempoAtencion = tiempoAtencion;
	}
	public int getTiempoEspera() {
		return tiempoEspera;
	}
	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}
	
	
}
