package org.dondevoy.entidad.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Turnero {
	
	@Id
	private int idTurnero;
	private String puerto;
	private String urlTurneroSucursal;
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public String getUrlTurneroSucursal() {
		return urlTurneroSucursal;
	}
	public void setUrlTurneroSucursal(String urlTurneroSucursal) {
		this.urlTurneroSucursal = urlTurneroSucursal;
	}
	
	
}
