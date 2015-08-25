package org.dondevoy.entidad;

import org.dondevoy.aplicacion.excepciones.BusinessException;
import org.dondevoy.entidad.dto.EntidadDTO;
import org.dondevoy.entidad.dto.SucursalDTO;
import org.dondevoy.entidad.dto.TipoEntidadDTO;
import org.dondevoy.entidad.entities.Entidad;
import org.dondevoy.entidad.entities.EstadoEntidad;
import org.dondevoy.entidad.entities.EntidadEstado;
import org.dondevoy.entidad.entities.EstadoSucursal;
import org.dondevoy.entidad.entities.Sucursal;
import org.dondevoy.entidad.entities.SucursalEstado;




import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class EntidadService implements EntidadServiceRemote {

	@PersistenceContext
	private EntityManager manager;
	
	public void altaEntidad(EntidadDTO entidadDTO, SucursalDTO sucursalDTO, TipoEntidadDTO tipoEntidadDTO)
			throws BusinessException {
		try {
			Entidad entidadExistente = manager.find(Entidad.class, entidadDTO.getNombreEntidad());
			if (entidadExistente != null){
			//	throw new BusinessException("La entidad ingresada ya se encuentra registrada");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//Si la entidad no existe
		//Creo EstadoSucursal
		EstadoSucursal estadoSucursal = new EstadoSucursal(new Date(),SucursalEstado.ACTIVA);
		
		//Creo Sucursal
		Sucursal sucursal = new Sucursal(true, sucursalDTO.getCodigoPostal(),
				sucursalDTO.getLatitud(), sucursalDTO.getLongitud(),
				sucursalDTO.getNumeroSucursal(),
				sucursalDTO.getObservaciones(), sucursalDTO.isTurnero(),estadoSucursal);
		
		//Creo EstadoEntidad
		EstadoEntidad estadoEntidad = new EstadoEntidad(new Date(), EntidadEstado.ACTIVA);
		
		//Creo Entidad
		//Entidad entidad = new Entidad(EntidadDTO.getNombreEntidad(), sucursal, estadoEntidad); 
		
	}

	@Override
	public EntidadDTO buscarEntidad(String nombre) throws BusinessException {
		manager.find(Entidad.class, nombre);
		return EntidadDTO;
	}
}
