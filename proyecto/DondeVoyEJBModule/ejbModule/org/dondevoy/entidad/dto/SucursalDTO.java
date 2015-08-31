package org.dondevoy.entidad.dto;

import java.util.List;


import org.dondevoy.entidad.entities.Domicilio;
import org.dondevoy.entidad.entities.EstadoSucursal;
import org.dondevoy.entidad.entities.HorarioDeAtencionEntidad;
import org.dondevoy.entidad.entities.Telefono;
import org.dondevoy.entidad.entities.Turnero;

public class SucursalDTO {

		private int idSucursal;
		private boolean casaMatriz;
		private String codigoPostal;
		private String latitud;
		private String longitud;
		private int numeroSucursal;
		private String observaciones;
		private boolean turnero;
		
		private List<EstadoSucursal> listEstadoSucursal;
		private Domicilio domicilio;
		private Turnero sistemaTurnero;
		private List<HorarioDeAtencionEntidad> listHorarioDeAtencionEntidad;
		private List<Telefono> listTelefono;
		
		public int getId(){
			return idSucursal;
		}
		public boolean isCasaMatriz() {
			return casaMatriz;
		}
		public void setCasaMatriz(boolean casaMatriz) {
			this.casaMatriz = casaMatriz;
		}
		public String getCodigoPostal() {
			return codigoPostal;
		}
		public void setCodigoPostal(String codigoPostal) {
			this.codigoPostal = codigoPostal;
		}
		public String getLatitud() {
			return latitud;
		}
		public void setLatitud(String latitud) {
			this.latitud = latitud;
		}
		public String getLongitud() {
			return longitud;
		}
		public void setLongitud(String longitud) {
			this.longitud = longitud;
		}
		public int getNumeroSucursal() {
			return numeroSucursal;
		}
		public void setNumeroSucursal(int numeroSucursal) {
			this.numeroSucursal = numeroSucursal;
		}
		public String getObservaciones() {
			return observaciones;
		}
		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}
		public boolean isTurnero() {
			return turnero;
		}
		public void setTurnero(boolean turnero) {
			this.turnero = turnero;
		}
		public List<EstadoSucursal> getListEstadoSucursal() {
			return listEstadoSucursal;
		}
		public void setListEstadoSucursal(List<EstadoSucursal> listEstadoSucursal) {
			this.listEstadoSucursal = listEstadoSucursal;
		}
		public Domicilio getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(Domicilio domicilio) {
			this.domicilio = domicilio;
		}
		public Turnero getSistemaTurnero() {
			return sistemaTurnero;
		}
		public void setSistemaTurnero(Turnero sistemaTurnero) {
			this.sistemaTurnero = sistemaTurnero;
		}
		public List<HorarioDeAtencionEntidad> getListHorarioDeAtencionEntidad() {
			return listHorarioDeAtencionEntidad;
		}
		public void setListHorarioDeAtencionEntidad(
				List<HorarioDeAtencionEntidad> listHorarioDeAtencionEntidad) {
			this.listHorarioDeAtencionEntidad = listHorarioDeAtencionEntidad;
		}
		public List<Telefono> getListTelefono() {
			return listTelefono;
		}
		public void setListTelefono(List<Telefono> listTelefono) {
			this.listTelefono = listTelefono;
		}
		
		
	}
